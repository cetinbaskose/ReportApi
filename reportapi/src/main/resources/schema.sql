CREATE TABLE security_role (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  description varchar(100) DEFAULT NULL,
  role_name varchar(100) DEFAULT NULL
);


CREATE TABLE security_user (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  username varchar(255) NOT NULL,
  password varchar(255) NOT NULL
);


CREATE TABLE user_role (
  user_id BIGINT NOT NULL,
  role_id BIGINT NOT NULL,
  CONSTRAINT FK_SECURITY_USER_ID FOREIGN KEY (user_id) REFERENCES security_user (id),
  CONSTRAINT FK_SECURITY_ROLE_ID FOREIGN KEY (role_id) REFERENCES security_role (id)
);


CREATE TABLE customer
(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
	created_at Date,
	updated_at Date,
	deleted_at Date,
	number BIGINT,
	expiryMonth varchar(255),
	expiryYear varchar(255),
	startMonth varchar(255),
	startYear varchar(255) ,
	issueNumber BIGINT,
	email varchar(255),
	birthday Date,
	gender varchar(255),
	billingTitle varchar(255),
	billingFirstName varchar(255),
	billingLastName varchar(255),
	billingCompany varchar(255),
	billingaddress1 varchar(255),
	billingAddress2 varchar(255),
	billingCity varchar(255),
	billingPostcode varchar(255),
	billingState varchar(255),
	billingCountry varchar(255),
	billingPhone varchar(255),
	billingFax varchar(255),
	shippingTitle varchar(255),
	shippingFirstName varchar(255),
	shippingLastName varchar(255),
	shippingCompany varchar(255),
	shippingAddress1 varchar(255),
	shippingAddress2 varchar(255),
	shippingCity varchar(255),
	shippingPostcode varchar(255),
	shippingState varchar(255),
	shippingCountry varchar(255),
	shippingPhone varchar(255),
	shippingFax varchar(255)
);


CREATE TABLE transaction
(
 transactionid varchar(32),
 customerid BIGINT,
 currency varchar(10),
 amount BIGINT,
 transactiondate Date,
 acquirerid BIGINT
);

CREATE TABLE acquirer
(
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
 name varchar(255),
 code varchar(255),
 type varchar(255)

);





