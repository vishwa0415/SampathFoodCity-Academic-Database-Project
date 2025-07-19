--database creation---
CREATE DATABASE SampathFood;
USE SampathFood;

---table creation---
CREATE TABLE Customer_City(
Citycode VARCHAR(50) PRIMARY KEY,
City VARCHAR(100) NOT NULL,
);




CREATE TABLE Customer(
Customer_Id VARCHAR(100) PRIMARY KEY,
Firstname VARCHAR(100) NOT NULL,
Lastname VARCHAR(100),
Gender VARCHAR(10),
Email VARCHAR(100),
Dateofbirth DATE,
Citycode VARCHAR(50) FOREIGN KEY (Citycode) REFERENCES Customer_City(Citycode),
Street VARCHAR(100),
Number VARCHAR(100)
);


CREATE TABLE Customer_Contact(
Customer_Id VARCHAR (100) FOREIGN KEY (Customer_Id) REFERENCES Customer(Customer_Id),
ContactNo VARCHAR (100) NOT NULL,
);


CREATE TABLE Orderr(
Order_Id VARCHAR(100) PRIMARY KEY,
Orderdate DATE NOT NULL,
Ordertime TIME,
Customer_Id VARCHAR (100) FOREIGN KEY (Customer_Id) REFERENCES Customer(Customer_Id),
);


CREATE TABLE Payment(
Payment_Id VARCHAR (100) PRIMARY KEY,
PaymentDate DATE,
PaymentMethod VARCHAR (100) NOT NULL,
Amount VARCHAR (50) NOT NULL,
Order_Id VARCHAR (100) FOREIGN KEY (Order_Id) REFERENCES Orderr(Order_Id),
);

CREATE TABLE Supplier(
Supplier_Id VARCHAR (100) PRIMARY KEY,
SupplierName VARCHAR (100) NOT NULL,
City VARCHAR(50),
Street VARCHAR(50),
Email VARCHAR(100),
);

CREATE TABLE Supplier_Contact(
Supplier_Id VARCHAR(100) FOREIGN KEY (Supplier_Id) REFERENCES Supplier(Supplier_Id),
ContactNo VARCHAR(100) NOT NULL,
);


CREATE TABLE Category(
Category_Id VARCHAR(100) PRIMARY KEY,
CategoryName VARCHAR(100) NOT NULL,
Description VARCHAR(100),
);


CREATE TABLE Product(
Product_Id VARCHAR(100) PRIMARY KEY,
ProductName VARCHAR(100) NOT NULL,
Unitprice VARCHAR(50) NOT NULL,
Totalquantity VARCHAR(50),
Category_Id VARCHAR(100) FOREIGN KEY (Category_Id) REFERENCES Category(Category_Id),
Supplier_Id VARCHAR(100) FOREIGN KEY (Supplier_Id) REFERENCES Supplier(Supplier_Id),
);

CREATE TABLE Order_Contain_Product(
Order_Id VARCHAR(100) FOREIGN KEY (Order_Id) REFERENCES Orderr(Order_Id),
Product_Id VARCHAR(100) FOREIGN KEY (Product_Id) REFERENCES Product(Product_Id),
);

---data insert in to tables------

INSERT INTO Customer_City
VALUES
('001','Kandy'),
('005','Anuradhapura'),
('023','Matara'),
('011','Colombo'),
('022','Kalutara');

INSERT INTO Customer
VALUES
('1101','Vishwa','Gautham','Male','vishwa@gmail.com','2000-04-15','005','Mainstreet','26'),
('1102','Bihandu','Perera','Male','Bihandu@gmail.com','2005-02-12','023','secondstreet','3342'),
('1103','Kamal','Perera','Male','Kamal@gmail.com','2009-09-29','011','marinaavenue','0097'),
('1104','Ann','Jennifer','female','ann@gmail.com','2010-03-15','022','third street','5542'),
('1105','Jane','dafny','female','jane@gmail.com','2000-01-01','001','townstreet','122');

INSERT INTO Customer_Contact
VALUES
('1101','023441332,071332562'),
('1102','08955343673'),
('1103','0984353426'),
('1104','0773242526'),
('1105','0724363748');


INSERT INTO Orderr
VALUES
('224','2025-01-01','09:00:00','1101'),
('225','2025-01-02','11:00:00','1103'),
('226','2025-01-09','12:00:00','1104'),
('227','2025-01-10','08:00:00','1102'),
('228','2025-01-11','15:00:00','1105');

INSERT INTO Payment
VALUES
('0001','2025-01-01','cash','2300','224'),
('0002','2025-01-02','card','5450','225'),
('0003','2025-01-09','cash','1500','226'),
('0004','2025-01-10','cash','250','227'),
('0005','2025-01-11','card','595','228');


INSERT INTO Supplier
VALUES
('991','jeny','kandy','townstreet','jeny@gmail.com'),
('992','anny','kalutara','mainstreet','anny@gmail.com'),
('993','stew','colombo','avenrastreet','stew@gmail.com'),
('994','bart','jaffna','secondlane','bart@gmail.com'),
('995','liza','dehiwala','ninthstreet','liza@gmail.com');

INSERT INTO Supplier_Contact
VALUES
('991','099425433,071332562,071423737'),
('992','0785464784,098435337'),
('993','0603436373'),
('994','0324533648'),
('995','054648444');

INSERT INTO Category
VALUES
('331','Drinks','all the types of drinks in this category'),
('332','Grocery','all the types of grocery items in this category'),
('333','Cosmetics','all the types of cosmetics in this category'),
('334','Foods','all the types of foods in this category'),
('335','dairy','all the types of dairy products in this category');


INSERT INTO Product
VALUES
('554','Necto','300','2','331','991'),
('555','Yought','80','10','335','993'),
('556','babypowder','580','2','333','995'),
('557','toothpaste','155','1','332','993'),
('558','chocolate','700','5','334','994');

INSERT INTO Order_Contain_Product
VALUES
('224','555'),
('225','558'),
('226','554'),
('227','557'),
('228','556');

---view the inserted data----

SELECT * FROM Customer;
SELECT * FROM Customer_City;
SELECT * FROM Customer_Contact;
SELECT * FROM Orderr;
SELECT * FROM Payment;
SELECT * FROM Supplier;
SELECT * FROM Supplier_Contact;
SELECT * FROM Product;
SELECT * FROM Category;
SELECT * FROM Order_Contain_Product;


SELECT * FROM Customer WHERE Customer_Id = '1104';

SELECT * FROM Supplier WHERE Supplier_Id = '995';
SELECT City FROM Supplier;
SELECT Description FROM Category;

set statistics time on 

SELECT * FROM Customer WHERE Customer_Id = '1104';

SELECT * FROM Supplier WHERE Supplier_Id = '995';

set statistics time off

SELECT * FROM Payment WHERE Payment_Id = '0005';
DELETE  FROM Product WHERE Product_Id = '558';

set statistics time on 

SELECT * FROM Category WHERE Category_Id = '334';

set statistics time off
DELETE  FROM Orderr WHERE Order_Id = '231';