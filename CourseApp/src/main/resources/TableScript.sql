drop database if exists SpringBootPractice;

create database SpringBootPractice;
use SpringBootPractice;

create table course(
	course_id bigint primary key,
    course_name varchar(20),
    author varchar(20));
    

insert into course values (100, 'First Course', 'First author');
insert into course values (102, 'Second Course', 'Second author');
select * from course ;