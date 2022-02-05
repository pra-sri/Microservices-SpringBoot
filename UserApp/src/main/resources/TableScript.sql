drop database if exists UserAppDB;

create database UserAppDB ;

use UserAppDB;

create table user(
user_id bigint,
	course_id bigint,
    user_name varchar(20),
    primary key(user_id, course_id) );
    

insert into user values (1, 100, 'First user');
insert into user values (1, 102, 'First user');
insert into user values (2,102, 'Second user' );
insert into user values (3,100, 'Third user' );
insert into user values (4,102, 'Fouth user' );
insert into user values (4,105, 'Fouth user' );


select * from user ;