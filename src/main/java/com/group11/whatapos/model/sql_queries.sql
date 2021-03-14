--select recommendations for customer
-- out << "We think you might like these items"
SELECT
	itemcode
FROM
	recommendations
WHERE
	customerid = "";

--delete oldest record if max rn > 
DELETE FROM
	recommendations
WHERE
	customerid = curr_custid;
	
--add new recommendations
INSERT INTO recommendations(customerid, itemcode, orderdate)
VALUES (curr_custid, curr_itemcode, curr_orderdate);


--add new item
INSERT INTO item(itemname, itemcode, price)
VALUES (new_itemname, new_itemcode, new_price);

INSERT INTO "order count"(itemcode, ordercount)
VALUES (new_itemcode, 0);

--change item price
UPDATE item
SET price = new_price
WHERE itemcode = curr_item;
	
--add order
--this repeats until checkout == true
INSERT INTO orders(orderid, customerid, orderdate, itemcode, itemnum)
VALUES (new_orderid, curr_custid, curr_orderdate, curr_itemcode, curr_itemnum);

INSERT INTO "item attributes"(orderid, itemnum, attributelist, othercomments)
VALUES (new_orderid, curr_itemnum, get_attributes(), get_comments());
	
--if an item is removed from the order it is deleted
-- NOTE: itemnum will have to be updated if preceding items are deleted.
-- i = i - 1 beginning at j or something like that
DELETE FROM orders
WHERE orderid = new_orderid, itemnum = curr_itemnum;

DELETE FROM "item attributes"
WHERE orderid = new_orderid, itemnum = curr_itemnum;

--use of allowed item attributes
--this information will be used to display the attributes for an item
SELECT attributename
FROM "allowed item attributes"
WHERE itemcode = curr_item;

--display orders
--curr_offset increments and decrements based on page number (by 500 or however many records we want to display)
SELECT * FROM orders LIMIT 501 OFFSET curr_offset;

--search field for orders
SELECT *
FROM orders
WHERE search_field = LIKE gen_str
LIMIT 501 OFFSET curr_offset;

--display orders
--curr_offset increments and decrements based on page number (by 500 or however many records we want to display)
SELECT * FROM customers LIMIT 501 OFFSET curr_offset;
	
--search field for customers
SELECT *
FROM customers
WHERE search_field = LIKE gen_str
LIMIT 501 OFFSET curr_offset;

--sql used to calculate revenue
SELECT COUNT(itemCode)
FROM orders
WHERE orderdate BETWEEN date1 and date2;

--sql for trending items
--gets top 2 and bottom 2
SELECT itemcode FROM "order count"
ORDER BY DESC
LIMIT 2
UNION ALL
SELECT itemcode FROM "order count"
ORDER BY ASC
LIMIT 2;

--sql used for recommendation table
SELECT
    customerid, itemcode, orderdate, rn
FROM
     ( SELECT customerid, itemcode, orderdate, ROW_NUMBER()
         over (PARTITION BY customerid ORDER BY MAX(orderdate) DESC)
         AS rn
         FROM orders
         GROUP BY customerid, itemcode, orderdate
         ) AS t
WHERE
    rn <= 5
ORDER BY
    customerid, rn;
