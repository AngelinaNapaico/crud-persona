CREATE DATABASE banco_db; 
USE banco_db;  

CREATE TABLE cliente(
id int not null auto_increment primary key,
numero_cuenta VARCHAR(20) UNIQUE,
nombre_cliente VARCHAR (50),
saldo DECIMAL(10, 2),
tipo_cuenta VARCHAR(50)
); 
