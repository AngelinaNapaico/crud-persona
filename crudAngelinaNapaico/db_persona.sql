CREATE DATABASE db_persona; 
USE db_persona; 

CREATE TABLE personaCrud(
id int not null auto_increment primary key,
nombre VARCHAR (50),
apellido VARCHAR (100),
dni VARCHAR (10)
);