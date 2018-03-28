/*
* FIRST Reoccurrence and Last ReOccurrence with O(n) and O(n)2 way
* Set value
*/
import java.util.*;
import java.io.*;

class Recur{
  public int max(Set<Integer> ind){
    //int indexValue = Collections.max(ind);
    System.out.println(Collections.max(ind));
    return Collections.max(ind);
  }
  public String hashCheck(String str){
    String ch = "";
    //System.out.println(str);
    Hashtable<Character,Integer> tabl = new Hashtable<Character,Integer>();
    for(int j=0;j<str.length();j++){
      if(!tabl.containsKey(str.charAt(j))){
        tabl.put(str.charAt(j),j);
      }else if(tabl.containsKey(str.charAt(j))){
        ch = "Duplicate First Occurent "+str.charAt(j);
        return ch;
      }
    }
    return "No occurrence";
  }
  public void addList(String str, TreeSet treeset, Recur r){
    for(int j=0;j<str.length();j++){
      for(int i=str.length()-1;i>j;i--){
        if(str.charAt(j) == str.charAt(i)){
          treeset.add(i);
        }
      }
    }
      if(treeset.size() != 0){
        int indexValue = r.max(treeset);
        char finalValue = str.charAt(indexValue);
        System.out.println("Repeated final value : "+ finalValue);
      }else{
        System.out.println("No Repeated value");
      }
  }
  public static void main(String args[]){
    //String str = "ABCBC";
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    TreeSet<Integer> treeset = new TreeSet<Integer>();
    Recur r = new Recur();
    r.addList(str,treeset, r);
    System.out.println(r.hashCheck(str));

  }

}
