Electricity Billing System is a software-based application.
1.  This project aims at serving the department of electricity by computerizing the billing system.
2.  It mainly focuses on the calculation of units consumed during the specified time and the money to be charged by the electricity offices.
3.  This computerized system will make the overall billing system easy, accessible, comfortable, and effective for consumers.

---------------------------------------------------

Technologies Used: Core Java (Swing & AWT)
Database Used: MySQL
IDE used: Netbeans

---------------------------------------------------



---------------------------------------------------
Database Queries for ELECTRICITY BILLING SYSTEM Project
---------------------------------------------------


1 - Create database with in mysql

create database electricity;

2 - Select the database you just created

use electricity;

3 - Create our first Table in the selected database with name login

create table login(meter_no varchar(20), username varchar(30), name varchar(30), password varchar(20), user varchar(20)); 

4 - Create the second table to store more information of user

create table customer(name varchar(20), meter_no varchar(20), address varchar(50), city varchar(30), state varchar(30), email varchar(40), phone varchar(20));

5 - Create the third table to store the meter information of the user

create table meter_info(meter_no varchar(20), meter_location varchar(20), meter_type varchar(20), phase_code varchar(20), bill_type varchar(20), days varchar(20));

6 - Create the Tax table to store tax related information

create table tax(cost_per_unit varchar(20), meter_rent varchar(20), service_charge varchar(20), service_tax varchar(20), swacch_bharat_cess varchar(20), fixed_tax varchar(20));

7 - Now inset values in the tax table

insert into tax values('9','47','22','57','6','18');

8 - Create Bill table to store electricity bill information of the user

create table bill(meter_no varchar(20), month varchar(30), units varchar(20), totalbill varchar(20), status varchar(20));

---------------------------------------------------

Added files in Libraries:
  mysql-connector-j-8.3.0
  rs2xml

---------------------------------------------------
