create table friends(
 id integer,
 name text,
 birthday data
);

insert into friends (id,name,birthday) values(1,'Jane Doe','1990-05-30');

insert into friends (id,name,birthday) values(2,'Jane Doe 2','1990-06-30');

insert into friends (id,name,birthday) values(3,'Jane 3','1990-07-30');

select * from friends;

update friends set name = 'Jane Smith' where id = 1;

alter table friends add column email column text;
update friends set email = 'jane@codecademy.com';

delete from friends where name = 'Jane Smith';

select * from friends;
