-- SQL file for phase 2 database correctness demonstration
-- CSCE 315 Project 2, Group 11, Spring 2021
-- We verify that this code was jointly written in adherence to the Aggie Code of Honor
--
-- Copyright notice: This code is for academic use only. No license or warranty is provided.
-- Invoke this from the psql command line using \i <path_to_sql_file>

-- Here are 20 test case queries that demonstrate the correctness of our database!

-- Querying order information from orders table
SELECT * FROM orders WHERE orderid="order-eee7698a-2d34-4630-a461-da445d832477";
SELECT * FROM orders WHERE orderdate CONTAINS '2017';
SELECT * FROM orders WHERE itemcode="E2";
SELECT orderid FROM orders WHERE itemcode="D1";

-- Querying customer information from customers table
SELECT * FROM customers WHERE lname="SMITH";
SELECT lname, fname, WHERE lname="MILLER";
SELECT fname WHERE fname CONTAINS 'y';
SELECT orders.itemcode, customers.lname FROM orders JOIN customers ON customers.customerid=orders.customerid;

-- Querying item information from items table
SELECT itemname FROM items WHERE price > 2;
SELECT ordercount FROM items WHERE itemcode CONTAINS 'E';
SELECT itemname FROM items WHERE itemname CONTAINS 'meat';
SELECT itemcode FROM items WHERE itemname CONTAINS 'shake';

-- Querying recommendation information from recommendations table
SELECT recommendations.itemname, customers.lname FROM recommendations JOIN customers ON customers.customerid = recommendations.customerid;
SELECT price FROM recommendations WHERE itemname CONTAINS 'WHATA';

-- Querying condiments information from condiments table
SELECT orderid FROM condiments WHERE condimentslist CONTAINS 'pickles';
SELECT otherComments FROM condiments;

-- Querying allowed item condiments fom aicondiments table
SELECT itemcode WHERE condimentName='mustard';
SELECT condimentname WHERE itemcode CONTAINS 'D';

-- Querying trending items from trending table
SELECT itemname FROM trending WHERE trendingrank >= 5;
