CREATE DATABASE IF NOT EXISTS ria_sikhona;
USE ria_sikhona;

DROP TABLE IF EXISTS province_data;
CREATE TABLE province_data (
  `value` VARCHAR(255) NOT NULL PRIMARY KEY,
  `display-name` VARCHAR(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- ----------------------------
-- Records of province
-- ----------------------------
insert into province_data(`value`,`display-name`) values('EASTERN_CAPE','Eastern Cape');
insert into province_data(`value`,`display-name`) values('FREE_STATE','Free State');
insert into province_data(`value`,`display-name`) values('GAUTENG','Gauteng');
insert into province_data(`value`,`display-name`) values('KWAZULU_NATAL','KwaZulu-Natal');
insert into province_data(`value`,`display-name`) values('LIMPOPO','Limpopo');
insert into province_data(`value`,`display-name`) values('MPUMALANGA','Mpumalanga');
insert into province_data(`value`,`display-name`) values('NORTHERN_CAPE','Northern Cape');
insert into province_data(`value`,`display-name`) values('NORTH_WEST','North West');
insert into province_data(`value`,`display-name`) values('WESTERN_CAPE','Western Cape');

commit;
