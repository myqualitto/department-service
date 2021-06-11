CREATE TABLE Department (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  code varchar(20) NOT NULL,
  name varchar(250) NOT NULL,
  address varchar(4000) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY UK_dept_code (code)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;