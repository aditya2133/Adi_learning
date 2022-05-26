CREATE DATABASE IF NOT EXISTS DML_EX1;

USE DML_EX1;

CREATE TABLE customers (
customer_id INT AUTO_INCREMENT NOT NULL,
customer_name varchar(50) NOT NULL,
customer_surname varchar(50) NOT NULL,
customer_email varchar(50) NOT NULL UNIQUE,
PRIMARY KEY (customer_id)
);



INSERT INTO customers 
	VALUES ('1','John', 'Wick', 'j.w@gmail.com');
    SELECT * FROM customers;
    
    
INSERT INTO customers (customer_name, customer_surname, customer_email)
 VALUES ('Sarah', 'Jones', 's.j@hotmail.com'),('Spider','Man', 's.m@gmail.com'), ('Doctor','Strange', 'd.s@gmail.com'),('The','Hulk','t.h@gmail.com');
 
 SELECT * FROM customers;
 
 UPDATE customers
 SET customer_name = 'Tom'
 WHERE customer_id = '2';
 
 SELECT * FROM customers;
 
 UPDATE customers
 SET customer_surname = 'Hanks', customer_email = 't.h1@gmail.com'
 WHERE customer_id = '2'; 
 
DELETE FROM customers WHERE customer_id = '4';

SELECT * FROM customers;

DELETE FROM customers WHERE customer_name = "The";
SET SQL_SAFE_UPDATES = 1;
 
    