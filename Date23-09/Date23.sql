Create database ComBhavnaOffice ;
Use ComBhavnaOffice;
Create table Employee (
E_id Int Primary key ,
E_Name Varchar(50),
Address Varchar(50),
gender varchar(10),
contact int,
dob date,
salary int
);
insert into Employee values(1,'Amit Kuamr','Gurugram','Male',99999999,'2001-06-12',500000);
insert into Employee values(2,'Akhilesh','Noida','Male',99999999,'1982-06-12',600000);
insert into Employee values(3,'Nikhil','Pune','Male',99999999,'2001-06-10',880000);
insert into Employee values(4,'Ankit ','Pongal','Male',99999999,'2002-06-12',900000);
insert into Employee values(5,'Mulkit','Ambala','Male',99999999,'2003-07-10',540000);

select * from Employee;
Create table Department (
D_id Int primary key,
D_name Varchar(30),
D_Description varchar(50),
D_contactNumber int
);
insert into Department values(101, 'HR','manage human resource ', 889911212);
insert into Department values(102, 'IT','Work on client task', 990011212);
insert into Department values(103, 'Accoutant','Manage all acoout related ', 999911992);
insert into Department values(104, 'Back Desk','all detail', 900911212);

create table JobBoard( 
J_id int primary key,
D_id int,
E_id int ,
FOREIGN KEY (e_id) REFERENCES Employee(E_id),
FOREIGN KEY (D_id) REFERENCES Department(D_id)
);

insert into JobBoard values(100,1,101);




