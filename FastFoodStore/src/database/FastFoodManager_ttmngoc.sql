Use FASTFOODMANAGE
go
create table Menu(
ID int primary key,
DishName nvarchar(100) not null,
DishType int not null,
Unit varchar(30) not null,
Price money not null,
Number int not null,
)
insert into Menu values
(1,'Pizza',1,N'Phần',35000,100),
(2,'Spagetti',1,N'Phần',25000,100),
(3,'Tiramisu',2,N'Phần',12000,100)

create table BookTable(
CustomerID int primary key, 
CustomerName varchar(100) not null,
PhoneNumber varchar(20) not null,
TableID int not null,
SetDate date not null,
Status[FASTFOODMANAGE]ST varchar(10) not null,
Note varchar(300) not null
)
insert into BookTable values
(1,'Ngoc Tram','0363377472',1,'03/03/2023','Paid','3 pieces of chicken,2 cocacola'),
(2,'Ngoc Dieu','036238972',2,'02/03/2023','Unpaid','7h is going to come')

create table Bill(
DishName varchar(100) primary key,
PriceForOne money not null,
Quantity int not null,
Total money not null
)
insert into Bill values
('Pizza',30000,1,30000)

create table TableList(
TableID int primary key,
StatusTable varchar(20) not null)

insert into TableList values
(1,'Booked'),
(2,'Full')

