CREATE DATABASE IF NOT EXISTS gameshopwoo;

USE gameshopwoo;

CREATE TABLE IF NOT EXISTS Customers (
	Customer_id INT PRIMARY KEY AUTO_INCREMENT,
    First_name varchar(50) NOT NULL,
    Surname varchar(50) NOT NULL
    
);

CREATE TABLE IF NOT EXISTS Products (
	Product_id INT PRIMARY KEY AUTO_INCREMENT,
    Product_Name varchar(250) NOT NULL,
    Product_Description varchar(500) NOT NULL,
    Product_Price decimal(10,2) NOT NULL
    
);

CREATE TABLE IF NOT EXISTS Orders (
	Order_id INT PRIMARY KEY AUTO_INCREMENT,
    Order_date DATE NOT NULL,
    fk_Customer_id INT NOT NULL,
    fk_Product_id INT NOT NULL,
    Order_address Varchar(250) NOT NULL,
    FOREIGN KEY (fk_Customer_id) REFERENCES Customers (Customer_id),
    FOREIGN KEY (fk_Product_id) REFERENCES Products (Product_id)
);


