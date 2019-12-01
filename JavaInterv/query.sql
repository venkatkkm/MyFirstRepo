create database demodb

use demodb

create table employee(
id int PRIMARY KEY AUTO_INCREMENT,
First_Name varchar(20),
Last_Name varchar(30),
Gender varchar(10),
Date_Of_Birth datetime(30),
Department varchar(10)
)

select * from employee


<!-- <div class="alert alert-warning" *ngIf="registerForm.dirty && fName.invalid">Enter first name</div>
        <div class="alert alert-warning" *ngIf="registerForm.dirty && lName.invalid">Enter last name</div>
        <div class="alert alert-warning" *ngIf="registerForm.dirty && gender.invalid">Enter gender</div>
        <div class="alert alert-warning" *ngIf="registerForm.dirty && dob.invalid">Enter birth date</div>
        <div class="alert alert-warning" *ngIf="registerForm.dirty && department.invalid">Enter department name</div> -->
		
		
drop table if exists employee;

create table employee(
id BIGINT PRIMARY KEY AUTO_INCREMENT,
First_Name varchar(20),
Last_Name varchar(30),
Gender varchar(10),
Date_Of_Birth DATE(10),
Department varchar(10)
)