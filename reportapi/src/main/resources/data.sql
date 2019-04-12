-- USER
-- hashed password: letmein
INSERT INTO security_user (id, username, password) VALUES
(1,  'merchant@test.com', '$2a$12$ZhGS.zcWt1gnZ9xRNp7inOvo5hIT0ngN7N.pN939cShxKvaQYHnnu')
;

-- ROLES

INSERT INTO security_role (id, role_name, description) VALUES
(1, 'ROLE_ADMIN', 'Administrator');


INSERT INTO user_role(user_id, role_id) VALUES
 (1, 1);  -- give merchant@test.com ROLE_ADMIN
  
  
 
 INSERT INTO transaction
  (transactionid,customerid,currency,amount,transactiondate,acquirerid) VALUES
   ('529-1438673740-2',1,'USD',110,'2019-02-01',1),
    ('529-1438673740-3',2,'GBP',125,'2019-02-01',2),
    ('529-1438673740-4',3,'TL',5085,'2019-02-01',3),
    ('529-1438673740-5',2,'USD',378,'2019-02-01',1),
    ('529-1438673740-6',3,'GBP',7657,'2019-02-01',2),
    ('529-1438673740-6',1,'TL',1238989,'2019-02-01',3)
  ;

  
  INSERT INTO customer
  (id ,created_at ,updated_at ,deleted_at ,number ,expiryMonth ,expiryYear ,startMonth ,startYear  ,issueNumber ,
   email ,birthday ,gender ,billingTitle ,billingFirstName ,billingLastName ,billingCompany ,billingaddress1 ,billingAddress2 ,
   billingCity ,billingPostcode ,billingState ,billingCountry ,billingPhone ,billingFax ,shippingTitle ,shippingFirstName ,
   shippingLastName ,shippingCompany ,shippingAddress1 ,shippingAddress2 ,shippingCity ,shippingPostcode ,shippingState ,shippingCountry ,shippingPhone ,shippingFax )
  VALUES
  (1,NULL,NULL,NULL,342,NULL,NULL,NULL,NULL,123,
  'c@g.com',NULL,'M','Home','cetin','baskose',NULL,'London',NULL,
  'London','E14 XXX', NULL, 'UK',NULL,NULL,NULL,NULL,
  NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL
  ),
  (2,NULL,NULL,NULL,231,NULL,NULL,NULL,NULL,3453,
  'ali@ht.com',NULL,'M','Home','ali','deneme',NULL,'ankara',NULL,
  'London','06 XXX', NULL, 'UK',NULL,NULL,NULL,NULL,
  NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL
  ),
  (3,NULL,NULL,NULL,435,NULL,NULL,NULL,NULL,98080,
  'veli@g.com',NULL,'M','Home','veli','yılmaz',NULL,'istanbul',NULL,
  'Merkez','34 XXX', NULL, 'UK',NULL,NULL,NULL,NULL,
  NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL
  );
 
 
 INSERT INTO acquirer
   (id, name, code, type )
  VALUES
  (1,'Mergen Bank','MB','CREDITCARD'),
  (2,'ABC Bank','AB','DEBITCARD'),
  (3,'XYZ Bank','XY','VIRTUALCARD');
  
  
  
  
  
  
 
 
 
 