INSERT INTO payment_type (payment_type_name,tx_date,tx_id_user,tx_host,tx_update)
VALUES ('tarjeta', now(),7,'127.0.0.1',now()),
       ('tarjeta', now(),4,'127.0.0.1',now()),
       ('tarjeta', now(),5,'127.0.0.1',now()),
       ('tarjeta', now(),6,'127.0.0.1',now()),
       ('tarjeta', now(),9,'127.0.0.1',now()),
       ('tarjeta', now(),8,'127.0.0.1',now()),
       ('tarjeta', now(),10,'127.0.0.1',now());
commit ;

INSERT INTO payment (id_payment_type,payment_name,cost,tx_date,tx_id_user,tx_host,tx_update)
VALUES (1,'Jorge Marca',000250.0000, now(),1,'127.0.0.1',now()),
       (2,'Marco Mamani',000150.0000, now(),4,'127.0.0.1',now()),
       (3,'Maria Certan',000100.5000, now(),5,'127.0.0.1',now()),
       (4,'Mariela Patzi',000235.0000, now(),6,'127.0.0.1',now()),
       (5,'Jaime,Condori',000050.0000, now(),2,'127.0.0.1',now()),
       (6,'Jesus Bascon',000200.0000, now(),1,'127.0.0.1',now()),
       (7,'Yuvinca Nina',000252.5000, now(),0,'127.0.0.1',now());
commit ;


INSERT INTO discount (chunk_name,percentage,status,tx_date,tx_id_user,tx_host,tx_update)
VALUES (1,000000.01,1, now(),7,'127.0.0.1',now()),
       (2,000000.10,2, now(),4,'127.0.0.1',now()),
       (3,000000.02,1, now(),5,'127.0.0.1',now()),
       (4,000000.10,1, now(),6,'127.0.0.1',now()),
       (5,000000.10,1, now(),9,'127.0.0.1',now()),
       (6,000000.03,1, now(),8,'127.0.0.1',now()),
       (7,000000.50,1, now(),10,'127.0.0.1',now());
commit ;

INSERT INTO geolocation (location, latitude, longitude ,status,tx_date,tx_id_user,tx_host,tx_update)
VALUES ('La Paz',    -16.5024448,-68.1192134,1, now(),7,'127.0.0.1',now()),
       ('Santa Cruz',-17.7608042,-63.2001639,1, now(),7,'127.0.0.1',now()),
       ('La Paz',    -16.5362826,-68.0766624,1, now(),7,'127.0.0.1',now()),
       ('Cochabamba',-17.3654399,-66.1616072,1, now(),7,'127.0.0.1',now()),
       ('La Paz',    -17.3812662,-66.1640012,1, now(),7,'127.0.0.1',now()),
       ('Cochabamba',-17.3977701,-66.1743101,1, now(),7,'127.0.0.1',now()),
       ('Cochabamba',-17.3893556,-66.1451207,1, now(),7,'127.0.0.1',now()),
       ('La Paz',    -16.5065467,-68.1144671,1, now(),7,'127.0.0.1',now()),
       ('La Paz',    -16.5207006,-68.1584125,1, now(),7,'127.0.0.1',now());
commit ;

INSERT INTO person (id_geolocation,first_name,last_name,email,date_of_birth,phone_number,address,city,status,tx_date,tx_id_user,tx_host,tx_update)
VALUES (1,'Marco','Mamani','marco123@gmail.com','1994-02-19','6345678','Villa Dolores', 'La Paz',1, now(),2,'127.0.0.1',now()),
 (2,'Maria','Certan','maria23@gmail.com','1995-02-20','7456982','Villa armonia', 'La Paz',1, now(),1,'127.0.0.1',now()),
 (3,'Mariela','Patzi','marielapru123@gmail.com','1997-05-09','72311678','Irpavi', 'Cochabamba',1, now(),2,'127.0.0.1',now()),
 (4,'Jorge','Marca' ,'jorgito123@gmail.com','1992-02-15','6345600','Ipavi2','Santa Cruz',1, now(),1,'127.0.0.1',now()),
 (5,'Jesus','Bascon','chucho123@gmail.com','1992-06-15','72344600','Sopocachi', 'Tarija' ,1, now(),2,'127.0.0.1',now()),
 (6,'Jaime','Condori','jaimecondori@gmail.com','1992-12-15','62346900','El alto','La Paz' ,1, now(),3,'127.0.0.1',now()),
 (7,'Yuvinca','Nina','nina1213@gmail.com','1997-06-19','72346220','El Alto','La Paz',1, now(),2,'127.0.0.1',now()),
 (8,'Gael','Condori','gael1213@gmail.com','1996-02-23','72346140','El Alto','La Paz',1, now(),1,'127.0.0.1',now()),
 (9,'Rodrigo','Saravia','rodri12@gmail.com','1997-08-09','72346130','Miraflores', 'La Paz' ,1, now(),1,'127.0.0.1',now()),
 (10,'Jose','Gutierrez','guti00213@gmail.com','1992-10-09','72346252','villa Fatima','La Paz',1, now(),3,'127.0.0.1',now());
commit ;
INSERT INTO person (id_geolocation,first_name,last_name,email,date_of_birth,phone_number,address,city,status,tx_date,tx_id_user,tx_host,tx_update)
VALUES (1,'Marco','Mamani','marco123@gmail.com','1994-02-19','6345678','Villa Dolores', 'La Paz',1, now(),2,'127.0.0.1',now());
       commit ;


INSERT INTO owner (id_person,user_o,password_o,status,tx_date,tx_id_user,tx_host,tx_update)
VALUES (6,'Marco222','20345asdf',1, now(),2,'127.0.0.3',now()),
       (7,'Mario111','87465ygdh',1, now(),2,'127.0.0.3',now()),
       (8,'Mariela0','16545yetg',1, now(),2,'127.0.0.3',now()),
       (9,'Jorge331','0o89g56jy',1, now(),2,'127.0.0.4',now()),
       (3,'Jesus222','i5667hyrb',0, now(),2,'127.0.0.5',now()),
       (4,'Jaime666','ki34tnybr',0, now(),2,'127.0.0.5',now()),
       (5,'gael661','86jy33rtb',0, now(),2,'127.0.0.1',now());
commit ;

INSERT INTO pet (id_owner,name,sex,date_of_birth,status,tx_date,tx_id_user,tx_host,tx_update)
VALUES (1,'Copito','Macho','2019-10-01',1, now(),1,'127.0.0.3',now()),
       (2,'Choquita','Hembra','2018-02-05',1, now(),1,'127.0.0.3',now()),
       (3,'Perla','Hembra','2020-11-21',1, now(),1,'127.0.0.3',now()),
       (4,'Scott','Macho','2020-04-07',1, now(),1,'127.0.0.4',now()),
       (5,'Dulce','Hembra','2020-03-10',0, now(),1,'127.0.0.5',now()),
       (1,'Andy','Macho','2019-12-25',0, now(),1,'127.0.0.5',now()),
       (6,'Jack','Macho','2020-12-16',0, now(),1,'127.0.0.1',now()),
       (2,'Negrita','Hembra','2020-09-11',1, now(),1,'127.0.0.4',now()),
       (1,'Chuñito','Macho','2020-05-20',0, now(),1,'127.0.0.5',now()),
       (3,'Leo','Macho','2021-02-01',0, now(),1,'127.0.0.5',now()),
       (4,'Black','Macho','2021-01-15',0, now(),1,'127.0.0.1',now());
commit ;


INSERT INTO pet_type (id_pet,type_pet,tx_date,tx_id_user,tx_host,tx_update)
VALUES (1,'Perro', now(),1,'127.0.0.3',now()),
       (2,'Gato', now(),2,'127.0.0.3',now()),
       (3,'Hamster', now(),3,'127.0.0.3',now()),
       (4,'Pajaro', now(),5,'127.0.0.3',now()),
       (3,'Conejo', now(),3,'127.0.0.3',now()),
       (4,'pollo', now(),5,'127.0.0.3',now()),
       (5,'Peces', now(),7,'127.0.0.3',now());
commit;

INSERT INTO races (id_pet_type,name,tx_date,tx_id_user,tx_host,tx_update)
VALUES (1,'Beagle', now(),1,'127.0.0.3',now()),
       (2,'Golden', now(),2,'127.0.0.3',now()),
       (3,'Pastor Aleman ', now(),3,'127.0.0.3',now()),
       (4,'Boxer', now(),5,'127.0.0.3',now()),
       (5,'Pug', now(),3,'127.0.0.3',now()),
       (6,'Persa', now(),5,'127.0.0.3',now()),
       (7,'Angora', now(),7,'127.0.0.3',now()),
       (1,'Siames', now(),3,'127.0.0.3',now()),
       (2,'Manx', now(),5,'127.0.0.3',now()),
       (3,'Arlequin', now(),3,'127.0.0.3',now()),
       (4,'Zelanda', now(),5,'127.0.0.3',now());
commit;


INSERT INTO service (id_discount,id_payment,id_clinic,name_service,status,tx_date,tx_id_user,tx_host,tx_update)
VALUES (1,2,7,'tratamiento',1,now(),2,'127.0.0.2',now()),
       (2,4,6,'vacunas',1,now(),2,'127.0.0.2',now()),
       (3,6,5,'radiografia',1,now(),2,'127.0.0.2',now()),
       (4,1,4,'ultrasonido',1,now(),2,'127.0.0.2',now()),
       (5,2,3,'cirugia',1,now(),2,'127.0.0.2',now()),
       (6,3,2,'ortopedia',1,now(),2,'127.0.0.2',now()),
       (7,5,1,'laboratorio',1,now(),2,'127.0.0.2',now());
commit;


INSERT INTO customer_service (id_service,id_owner,status,tx_date,tx_id_user,tx_host,tx_update)
VALUES (1,2,1,now(),1,'127.0.0.2',now()),
       (2,3,1,now(),2,'127.0.0.2',now()),
       (3,4,1,now(),1,'127.0.0.2',now()),
       (4,5,1,now(),2,'127.0.0.2',now()),
       (5,6,1,now(),1,'127.0.0.2',now()),
       (6,7,1,now(),1,'127.0.0.2',now()),
       (7,1,1,now(),1,'127.0.0.2',now());
commit;

INSERT INTO volunteers (id_person,user_v,password_v,volunteer,status,tx_date,tx_id_user,tx_host,tx_update)
VALUES (4,'Marco23_2','12345asdf','2021-04-15 10:00:00',1, now(),2,'127.0.0.1',now()),
       (5,'Maria112','45465ygdh','2021-05-10 11:30:00',1, now(),2,'127.0.0.1',now()),
       (6,'Mariela0003','145tetg','2021-06-11 12:00:00',1, now(),2,'127.0.0.1',now()),
       (7,'Jorge321','0o89ikujy','2021-05-08 11:00:00',1, now(),2,'127.0.0.1',now()),
       (8,'Jesus23_2','i8j67hyrb','2021-04-22 10:30:00',1, now(),2,'127.0.0.1',now()),
       (9,'Jaime777','kiutnybr','2021-04-15 14:00:00',1, now(),2,'127.0.0.1',now()),
       (10,'yuvinca555','86jyrtb','2021-05-05 13:30:00',1, now(),2,'127.0.0.1',now());
commit ;

INSERT INTO h_volunteers (id_person,user_v,password_v,volunteer,status,tx_date,tx_id_user,tx_host,tx_update)
VALUES (4,'Marco23_2','12345asdf','2021-04-15 10:00:00',1, now(),2,'127.0.0.1',now()),
       (5,'Maria112','45465ygdh','2021-05-10 11:30:00',1, now(),2,'127.0.0.1',now()),
       (6,'Mariela0003','145tetg','2021-06-11 12:00:00',1, now(),2,'127.0.0.1',now()),
       (7,'Jorge321','0o89ikujy','2021-05-08 11:00:00',1, now(),2,'127.0.0.1',now()),
       (8,'Jesus23_2','i8j67hyrb','2021-04-22 10:30:00',1, now(),2,'127.0.0.1',now()),
       (9,'Jaime777','kiutnybr','2021-04-15 14:00:00',1, now(),2,'127.0.0.1',now()),
       (10,'yuvinca555','86jyrtb','2021-05-05 13:30:00',1, now(),2,'127.0.0.1',now());
commit ;

INSERT INTO volunteers_service (id_volunteer,id_service,status,tx_date,tx_id_user,tx_host,tx_update)
VALUES (2,2,1,now(),1,'127.0.0.2',now()),
       (4,3,1,now(),2,'127.0.0.2',now()),
       (6,4,1,now(),1,'127.0.0.2',now()),
       (1,5,1,now(),2,'127.0.0.2',now()),
       (3,6,1,now(),1,'127.0.0.2',now()),
       (6,7,1,now(),1,'127.0.0.2',now()),
       (7,1,1,now(),1,'127.0.0.2',now());
commit;


INSERT INTO medical_appointment (id_clinic,id_owner,id_pet, appointment, appointment_status,status,tx_date,tx_id_user,tx_host,tx_update)
VALUES (1,2,1,'2021-04-01 10:00:00',1,1,now(),2,'127.0.0.2',now()),
       (2,4,2,'2021-04-02 14:00:00',1,1,now(),2,'127.0.0.2',now()),
       (3,6,3,'2021-04-03 09:00:00',1,1,now(),2,'127.0.0.2',now()),
       (4,7,4,'2021-04-03 15:00:00',1,1,now(),2,'127.0.0.2',now()),
       (5,1,4,'2021-04-04 16:30:00',1,1,now(),2,'127.0.0.2',now()),
       (6,2,5,'2021-04-01 11:20:00',1,1,now(),2,'127.0.0.2',now()),
       (7,1,6,'2021-04-05 14:30:00',1,1,now(),2,'127.0.0.2',now()),
       (1,3,7,'2021-04-10 10:00:00',1,1,now(),2,'127.0.0.2',now()),
       (2,5,8,'2021-04-09 09:00:00',1,1,now(),2,'127.0.0.2',now()),
       (3,7,9,'2021-04-08 15:30:00',1,1,now(),2,'127.0.0.2',now()),
       (4,3,10,'2021-04-07 12:00:00',1,1,now(),2,'127.0.0.2',now());
commit ;
drop table medical_appointment;



INSERT INTO perso (id_person,first_name,last_name,email,date_of_birth,phone_number,address,city)
VALUES (1,'Marco','Mamani','marco123@gmail.com','1994-02-19','6345678','Villa Dolores', 'La Paz'),
 (2,'Maria','Certan','maria23@gmail.com','1995-02-20','7456982','Villa armonia', 'La Paz'),
 (3,'Mariela','Patzi','marielapru123@gmail.com','1997-05-09','72311678','Irpavi', 'Cochabamba'),
 (4,'Jorge','Marca' ,'jorgito123@gmail.com','1992-02-15','6345600','Ipavi2','Santa Cruz'),
 (5,'Jesus','Bascon','chucho123@gmail.com','1992-06-15','72344600','Sopocachi', 'Tarija' ),
 (6,'Jaime','Condori','jaimecondori@gmail.com','1992-12-15','62346900','El alto','La Paz'),
 (7,'Yuvinca','Nina','nina1213@gmail.com','1997-06-19','72346220','El Alto','La Paz'),
 (8,'Gael','Condori','gael1213@gmail.com','1996-02-23','72346140','El Alto','La Paz'),
 (9,'Rodrigo','Saravia','rodri12@gmail.com','1997-08-09','72346130','Miraflores', 'La Paz'),
 (10,'Jose','Gutierrez','guti00213@gmail.com','1992-10-09','72346252','villa Fatima','La Paz');
commit ;