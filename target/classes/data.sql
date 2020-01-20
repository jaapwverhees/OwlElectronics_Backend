DROP TABLE IF EXISTS product;


CREATE TABLE product(
  product_id int(11) NOT NULL AUTO_INCREMENT,
  image longtext NOT NULL,
  product_description varchar(600) NOT NULL,
  product_name varchar(30) NOT NULL,
  product_price varchar(7) NOT NULL,
  PRIMARY KEY (product_id)
);
--
--
INSERT INTO product(image, product_description, product_name, product_price) VALUES (
'../img/arduino-1.jpg','a cute arduino 2','arduino 2','12,99'),
('raspberry_pi_4_model_b_4GB.jpg','De Raspberry Pi 4 Model B 4GB is het nieuwste lid van de Raspberry Pi familie. De Raspberry Pi 4 biedt een baanbrekende toename in snelheid van de processor, multimedia prestaties, geheugen en connectiviteit in vergelijking met de Raspberry Pi 3 Model B+, met behoud van backwards compatibility en een bijna gelijk stroomverbruik. Voor de eindgebruiker biedt Raspberry Pi 4 Model B desktopprestaties vergelijkbaar met instapniveau x86 pc-systemen.','Raspberry Pi 4 Model B - 4GB','59,95'),
('raspberry_pi_4_model_b_2GB.jpg','De Raspberry Pi 4 Model B 2GB is het nieuwste lid van de Raspberry Pi familie. De Raspberry Pi 4 biedt een baanbrekende toename in snelheid van de processor, multimedia prestaties, geheugen en connectiviteit in vergelijking met de Raspberry Pi 3 Model B+, met behoud van backwards compatibility en een bijna gelijk stroomverbruik. Voor de eindgebruiker biedt Raspberry Pi 4 Model B desktopprestaties vergelijkbaar met instapniveau x86 pc-systemen. ','Raspberry Pi 4 Model B - 2GB','49,95'),
('rasclock.jpg','RasClock is een zeer nauwkeurige real-time klok die rechtstreeks op de Raspberry Pi wordt geplaatst en bevat een back-up batterij. De module wordt direct geïnstalleerd op de GPIO header pinnen zonder bedrading of solderen. Hij gebruikt de 3,3V, GND, SDA en SCL pinnen. De module blijft binnen de omtrek van de Raspberry Pi en zit lager dan video-uitgang, zodat hij in de meeste gevallen makkelijk is te plaatsen.','Raspberry pi Clock Module','12,99');

