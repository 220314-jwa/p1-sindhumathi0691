

// =======create table Commands============================



create table event_type(
event_type_id serial primary key,
event_type_name varchar(50)
);  


create table status(
status_id serial primary key,
status_name varchar(50)
);  

create table manager(
manager_id serial primary key,
manager_firstname varchar(20),
manager_lastname varchar(20),
username varchar(20) not null,
password varchar(20) not null
); 


create table depthead(
dept_head_id serial primary key,
dept_head_firstname varchar(20),
dept_head_lastname varchar(20),
username varchar(20) not null,
password varchar(20) not null
); 


create table department(
dept_id serial primary key,
dept_name varchar(50),
dept_head_id integer not null  
);


create table employee (
	employee_id serial primary key,
	first_name varchar(100) not null,
	last_name varchar(30)  not null,
	username varchar(20) not null,
	password varchar(20) not null,
	manager_id integer not null references manager,
	dept_id integer not null references department
);


create table reimbursement_request (

	request_id serial primary key,
	employee_id integer not null references employee,
	event_type_id integer not null references event_type,
	status_id integer not null references status,
	event_date varchar(100) not null,
	cost int not null,
	description varchar(100),
	location varchar(50),
	submitted_at varchar(100) not null,
	comments varchar(50)
	
	);



//================alter table Commands============

alter table status
rename column id to status_id;


alter table employee 
rename column full_name  to first_name ;


alter table employee
add column username varchar(50);


alter table employee
add column password varchar(50);

alter table depthead 
rename column dept_head_username to username ;


alter table reimbursement_request 
drop constraint reimbursement_request_status_id_fkey;

alter table reimbursement_request
add column comments varchar(50);


//====================delete table commands===================

delete from status;

delete from status where status_id in (10,11); 
delete from department;

delete from event_type;

delete from reimbursement_request;

delete from reimbursement_request where request_id = 2;

delete from employee; 

drop table status; 

drop table event_type; 

drop table department;

drop table reimbursement_request;

drop table employee;


//======================select table commands===========================

select * from status;

select * from department;

select * from event_type;

select * from employee;

select * from manager;

select * from deptHead;

select * from reimbursement_request;


//========================insert table Commands====================


insert into status values (1,'Pending Manager Approval');
insert into status values (2,'Manager-Approved');
insert into status values (3,'Pending Dept Head Approval');
insert into status values (5,'Pending Manager Approval');
insert into status values (6,'Approved');
insert into status values (7,'Rejected');


insert into event_type values (1,'Certification');
insert into event_type values (2,'Class');
insert into event_type values (3,'Seminar/Conference');
insert into event_type values (4,'Other');



insert into department values (1,'Certification Dept',1);
insert into department values (2,'Class Dept',2);
insert into department values (3,'Seminar Dept',3);


insert into depthead values (1,'tom','hanks','tom01','password123');
insert into depthead values (2,'arnold','schwanegger','arnold01','password123');
insert into depthead values (3,'jackie','chan','jackie01','password123');
insert into depthead values (4,'bruce','lee','bruce01','password123');

insert into employee values (2,'narpavi','dinesh','narpavi01','password123',2,2);
insert into employee values (3,'indira','karthik','indira01','password123',3,3);
insert into employee values (4,'vidya','bale','vidya01','password123',3,3);


SELECT reimbursement_request.request_id, reimbursement_request.event_date, reimbursement_request.cost, reimbursement_request.description, reimbursement_request.location, reimbursement_request.submitted_at, reimbursement_request.comments,employee.first_name,employee.last_name,event_type.event_type_name,status.status_name  FROM reimbursement_requestInner join employee ON reimbursement_request.employee_id = employee.employee_idInner join event_type ON reimbursement_request.event_type_id = event_type.event_type_idInner join status ON reimbursement_request.status_id = status.status_idWHERE reimbursement_request.request_id =1;

SELECT reimbursement_request.request_id,reimbursement_request.cost,reimbursement_request.description, reimbursement_request.location, 
reimbursement_request.submitted_at, reimbursement_request.comments,employee.first_name,employee.last_name,event_type.event_type_name,status.status_name  FROM reimbursement_request 
Inner join employee ON reimbursement_request.employee_id = employee.employee_id 
Inner join event_type ON reimbursement_request.event_type_id = event_type.event_type_id 
Inner join status ON reimbursement_request.status_id = status.status_id 
WHERE reimbursement_request.request_id = 1

SELECT reimbursement_request.request_id,reimbursement_request.cost,reimbursement_request.description, reimbursement_request.location, 
reimbursement_request.submitted_at, reimbursement_request.comments,employee.first_name,employee.last_name,event_type.event_type_name,status.status_name  FROM reimbursement_request 
Inner join employee ON reimbursement_request.employee_id = employee.employee_id 
Inner join event_type ON reimbursement_request.event_type_id = event_type.event_type_id 
Inner join status ON reimbursement_request.status_id = status.status_id WHERE reimbursement_request.request_id = 1
