# portal
Implementation of JPA repository for use case of customer, product and order request.

Requests
http://localhost:8124/customer/requestOrder
{
  "cust_id":3,
  "productList":["mbl","ltp"]
}
Response:
Ok

http://localhost:8124/customer/findAll


DB Script
MYSQL DATABASE
Schema:portal
/*
-- Query: SELECT * FROM portal.cust
LIMIT 0, 1000

-- Date: 2020-02-22 15:41
*/
INSERT INTO `cust` (`cust_id`,`custname`,`custpoints`) VALUES (1,'John','7000');
INSERT INTO `cust` (`cust_id`,`custname`,`custpoints`) VALUES (2,'Rose','12000');
INSERT INTO `cust` (`cust_id`,`custname`,`custpoints`) VALUES (3,'Roy','15000');
/*
-- Query: SELECT * FROM portal.product
LIMIT 0, 1000

-- Date: 2020-02-22 15:41
*/
INSERT INTO `product` (`product_id`,`productCode`,`productName`,`productRate`,`productStock`) VALUES (1,'mbl','mobile','5000',NULL);
INSERT INTO `product` (`product_id`,`productCode`,`productName`,`productRate`,`productStock`) VALUES (2,'ltp','laptop','10000',NULL);
