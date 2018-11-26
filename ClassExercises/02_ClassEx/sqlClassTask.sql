create database test;
 
 use test;
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
   `customerID`    INT UNSIGNED  NOT NULL AUTO_INCREMENT,
   `name`   VARCHAR(8)    NOT NULL,
   `adress`   VARCHAR(8)    NOT NULL, 
   `email`   VARCHAR(8)    NOT NULL, 
   `phone`   VARCHAR(8)    NOT NULL, 
   `closingbal`   decimal(6,2)  NOT NULL default 9999.9, 
   PRIMARY KEY (`customerid`)
   );


   use test;
DROP TABLE IF EXISTS `salesorder`;
CREATE TABLE `salesorder` (
   `orderid`    INT UNSIGNED  NOT NULL AUTO_INCREMENT,
   `orderdate`   VARCHAR(8)    NOT NULL, 
   `customerid`   INT UNSIGNED  NOT NULL,
   `ordertot`   INT UNSIGNED  NOT NULL,
   PRIMARY KEY (`orderid`),
      FOREIGN KEY (`customerid`) references `customer` (`customerid`)
   ON DELETE RESTRICT ON UPDATE CASCADE
   );


use test;
DROP TABLE IF EXISTS `SalesOrderitem`;
CREATE TABLE `SalesOrderitem` (
   `lineitemid`    INT UNSIGNED  NOT NULL AUTO_INCREMENT,
   `orderid` int unsigned not null,
   `price`   int unsigned    NOT NULL, 
   `productid`   INT UNSIGNED  NOT NULL,
   `quantity`   INT UNSIGNED  NOT NULL,
   PRIMARY KEY (`lineitemid`),
   FOREIGN KEY (`orderid`) references `salesorder` (`orderid`)
   ON DELETE RESTRICT ON UPDATE CASCADE,
      FOREIGN KEY (`productid`) references `product` (`productid`)
   ON DELETE RESTRICT ON UPDATE CASCADE
   );

   
   use test;
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
   `productid`    INT UNSIGNED  NOT NULL AUTO_INCREMENT,
   `name`   VARCHAR(8)    NOT NULL, 
   `categoryId`   INT UNSIGNED  NOT NULL,
   `UnitPrice`   INT UNSIGNED  NOT NULL,
    `ClosingSTK`   INT UNSIGNED  NOT NULL,
   PRIMARY KEY (`productID`),
   
      FOREIGN KEY (`categoryID`) references `category` (`categoryid`)
   ON DELETE RESTRICT ON UPDATE CASCADE
   );
      
         use test;
DROP TABLE IF EXISTS `Category`;
CREATE TABLE `category` (
   `categoryID`    INT UNSIGNED  NOT NULL AUTO_INCREMENT,
   `name`   VARCHAR(8)    NOT NULL, 
   `description`   VARCHAR(8)    NOT NULL, 
   PRIMARY KEY (`categoryID`)
   );
   
   