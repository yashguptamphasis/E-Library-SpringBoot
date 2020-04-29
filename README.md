# E-Library-SpringBoot
Online Library made for self learning purpose on Spring Boot.
(Extremely simple web-App for self learning and practice with simple front end but strong back end. 
It is a ful functional library web-app which can also be made use in a practical senario)


IT has Admin Login
--------------------
You can add books and add students and perform crud opertion on them


IT has Student Login
--------------------
Account can be created only by admin.
Student can issue book.
Return book. 
View the book he/she has issued.


To Run.
------------
Run it on STS or Eclipe.
Inbuilt H2 Database of Spring Boot is been used.

MAKE USE OF FOLLOWING COMMANDS TO INIT THE DATABASE
-------------------------------------------------------
create table  User(name varchar2(40), email varchar2(40), phone varchar2(20), password varchar2(40) );
insert into user values('yash','yash','8989','yash');
insert into user values('Rajesh','Raj@gmail','8989','raj');


create table book(name varchar2(20));
insert into book values('Wings Of Fire');
insert into book values('Into The Unknown');
insert into book values('Five Days Work A Week');

create table Book2(book varchar2(20));
insert into book2 values('book2');



