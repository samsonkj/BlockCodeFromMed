/*
* Block Check Class
Each block will have two values
1. data / transaction
2. previous hashcode
*/
import java.util.*;

class Block{
  private List<String> transaction;
  private int previousHashcode;
  private int currentBlockHash;
 public Block(List<String> transaction, int previousHashcode){
   this.transaction = transaction;
   this.previousHashcode = previousHashcode;
   Object[] obj = {this.transaction.hashCode(),this.previousHashcode};
   this.currentBlockHash = Arrays.hashCode(obj);
   //System.out.println(this.currentBlockHash);
 }
 public int getHashcode(){
   return this.currentBlockHash;
 }
}
public class Check{
  public static void main(String args[]){
    Block genesisBlock = new Block(Arrays.asList("Transaction","gne"),1);
    Block firstTransaction = new Block(Arrays.asList("this is first transactn","dum"), genesisBlock.getHashcode());
    Block secondTransaction = new Block(Arrays.asList("This is second transactn","dum2"), firstTransaction.getHashcode());
    System.out.println(firstTransaction.getHashcode());
    System.out.println(secondTransaction.getHashcode());
  }

}
