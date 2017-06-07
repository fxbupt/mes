CREATE database mes;
CREATE table productionOrders(
id INTEGER AUTO_INCREMENT,
productName VARCHAR(50) NOT NULL,
number INTEGER NOT NULL,
PRIMARY KEY (id)
);
INSERT INTO productionOrders VALUES (1, "starter", 500);