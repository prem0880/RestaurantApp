show databases;

use rms;

show tables;

desc menu;


CREATE TABLE Menu(
	FoodId int primary key not null,
	FoodName varchar(20) not null,
	FoodType varchar(20) not null,
	FoodPrice int not null
);


select * from Menu;
