create database autoria;
Create TABLE if not exists CAR(
  id int not null auto_increment primary key,
  name VARCHAR(50) NOT NULL,
  price DOUBLE,
  vendor VARCHAR(100) NOT NULL
);
SELECT idTo From CAR
GROUP BY 1;

