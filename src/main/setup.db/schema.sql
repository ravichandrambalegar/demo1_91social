CREATE DATABASE IF NOT EXISTS customer;
USE customer;

DROP TABLE IF EXISTS customer_info;
CREATE TABLE customer_info (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`first_name` VARCHAR(32) NOT NULL,
	`last_name` VARCHAR(32) NOT NULL,
	`contact` VARCHAR(10) NOT NULL,
	`c_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
	`touchtime` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;


CREATE INDEX customer_index
ON customer_info (id, first_name,last_name,contact,c_time,touchtime);