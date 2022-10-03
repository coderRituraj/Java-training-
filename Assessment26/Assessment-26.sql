Create database Assessment26;
use Assessment26;
Create table User(
userId int primary key,
first_name varchar(30),
last_name varchar(30),
 address varchar(30),
 mobile int,
 email varchar(50),
 username varchar(50),
 password varchar(30),
 referral_points int 
 );
 insert into user values(101,'Amit','Singh','New Kondali , Delhi',989898,'amitsingh@gmail.com','AmitSingh','Amit2509@',0);
 insert into user values(102,'Mohit','Malhotra','Mohali, Punjab',990000,'mohit@gmail.com','MohitS', 'mohit2309',0);
 insert into user values(103,'Ashish','Singh','Unna , Himachal',898774,'ashish@gmail.com','Ashish','Ashish@',0);
 insert into user values(104,'Anish','Saini','Srinagar, Uttarakhand',874634,'anish@gmail.com','AnishSaini','Anish@',0);
 insert into user values(105,'Vikram','Rathor','kota, Rajsathan',9766384,'vikram@gmail.com','VikramRathor','kiram',0);
 /*
 update user
 set referral_points =1000 where userId =101;
 */
Create table Referral( 
referalId int primary key,
referral_First_name varchar(30),
 referral_last_name varchar(30),
 mobile_Number int,
 email_Id varchar(30),
 userId int,
 foreign key(userId) references User(userId),
 date_of_referral date,
 status boolean
 );
 insert into Referral values(101,'Raj','Singh',9999998,'raj@gamil.com',101,'2022-09-10',true);
 insert into Referral values(102,'Sonu','Saimpla',9921218,'sonu@gamil.com',102,'2022-04-19',true);
 insert into Referral values(103,'Nekte','Kataria',9999121,'nekte@gamil.com',103,'2022-09-18',true);
 insert into Referral values(104,'Ajay','saimpla',99933342,'ajay@gamil.com',105,'2022-08-10',true);
 insert into Referral values(105,'Abhay','Badoriya',99332998,'abhay@gamil.com',104,'2022-06-10',false);
 
alter table Referral 
add primary key(referalId);


 Create table Customer(
 custermerId int primary key,
 firstName varchar(30),
 lastName varchar(30),
 emailId varchar(50),
 mobileNumber int
 );
 insert into Customer values(101,'Amit','Singh','amit@gamil.com',99999999);
 insert into Customer values(102,'Mohit','Malhotra','mohit@gamil.com',98388388);
 insert into Customer values(103,'Ashish','Singh','ashish@gamil.com',998834222);
 insert into Customer values(104,'Anish','Saini','Anish@gamil.com',9139320);
 insert into Customer values(105,'Vikaram','Malhotra','Vikram@gamil.com',91993233);
 

 Create table BuyingDetails( 
 custermerId int primary key,
 foreign key( custermerId )  references Customer(custermerId),
 userId int,
 foreign key(userId) references user(userId),
 purchase_date date,
 productName varchar(30)
 );
 insert into BuyingDetails values (101,101,'2022-09-10','Iphone14');
 insert into BuyingDetails values (102,102,'2022-08-19','Monitor');
 insert into BuyingDetails values (103,103,'2022-08-10','MicroPhone');
 insert into BuyingDetails values (104,104,'2022-09-20','Camera');
 insert into BuyingDetails values (105,105,'2022-06-15','Smart Tv');
desc user;
desc Referral;
desc Customer;
desc BuyingDetails;
/* Question 1.
Display total number of referral done by particular user by userId.
*/

SELECT User.userId, count(Referral.userId) as number_of_Referrals        
from User
left join Referral
on (User.userId=Referral.userId)
group by
    User.userId;
    
/*
Question 2
Display total number of points earned by user  
*/

-- Question3--
select first_name,mobile from User left join BuyingDetails 
on User.userId=BuyingDetails.userId where purchase_date =' 2022-08-19';

-- Question-4--
select * from BuyingDetails where productName='iphone14';
select first_name,last_name from User left join BuyingDetails on User.userId=BuyingDetails.userId  where productName='iphone14';
-- Question 5 --
delete custermerId,firstname,lastname,emailId,mobileNumber from customer 
left join  BuyingDetails on Customer.userId=BuyingDetails.userId 
where productName='iphone14';

-- Question 6--
create view userview as select user.first_name,user.last_name,user.email,user.mobile from user order by email,mobile;
select First_name from  userview;
show tables;
