CREATE DATABASE if not exists tester2;

USE tester2;

CREATE TABLE testing(
	id INT PRIMARY KEY auto_increment,
	`name` varchar(50) not null,
    email varchar(255) unique,
    drink varchar(30) default 'water'
    );
    
    INSERT INTO testing(`name`, email, drink) VALUES ('Aditya', 'ap@gmail.com','fanta')
    