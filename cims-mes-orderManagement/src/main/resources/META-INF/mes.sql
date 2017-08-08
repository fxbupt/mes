CREATE DATABASE mes;
CREATE TABLE production_order (
id int PRIMARY KEY,
order_serial_number varchar(50) NOT NULL,
product_name varchar(50),
product_quantity int,
expected_start_time date,
expected_end_time date,
priority int
);
INSERT INTO production_order values
(1, 'cims001', 'foo', 200, '2017-08-08', '2018-01-01', 4);

CREATE TABLE gantt_task (
  id int PRIMARY KEY,
  text varchar(255),
  start_date date,
  duration int,
  progress double,
  parent int
);

CREATE TABLE gantt_link (
  id int PRIMARY KEY,
  source int,
  target int,
  type varchar(10)
);

INSERT INTO gantt_task VALUES (
1, 'task 1', '2017-08-08', 5, 0.8, 1);
INSERT INTO gantt_task VALUES (
2, 'task 2', '2017-08-09', 4, 0.2, 1);