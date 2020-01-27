DROP TABLE IF EXISTS product;


CREATE TABLE product(
  product_id int(11) NOT NULL AUTO_INCREMENT,
  image BLOB,
  product_description varchar(600) NOT NULL,
  product_name varchar(30) NOT NULL,
  product_price float(7) NOT NULL,
  PRIMARY KEY (product_id)
);
--
--
INSERT INTO product(product_description, product_name, product_price) VALUES (
'De Arduino Uno R3 is het meest gebruikte Arduino board. Dit board is geschikt voor beginners en gevorderde gebruikers. De Uno is gebaseerd op de ATmega328 chip en heeft 14 digitale input/output pinnen (waarvan er 6 voor PWM kunnen worden gebruikt), 6 analoge input pinnen, een 16 MHz resonator, een USB-aansluiting, een power jack, een ICSP header en een reset knop. Het board bevat alles wat nodig is om de ATmega328 microcontroller te ondersteunen. Sluit de Arduino Uno aan op een computer met een USB-kabel, met een DC-voeding of gebruik een batterij om te beginnen.','Arduino Uno Rev3', 12.99),
('De Raspberry Pi 4 Model B 4GB is het nieuwste lid van de Raspberry Pi familie. De Raspberry Pi 4 biedt een baanbrekende toename in snelheid van de processor, multimedia prestaties, geheugen en connectiviteit in vergelijking met de Raspberry Pi 3 Model B+, met behoud van backwards compatibility en een bijna gelijk stroomverbruik. Voor de eindgebruiker biedt Raspberry Pi 4 Model B desktopprestaties vergelijkbaar met instapniveau x86 pc-systemen.','Raspberry Pi 4 Model B - 4GB', 59.95),
('De Raspberry Pi 4 Model B 2GB is het nieuwste lid van de Raspberry Pi familie. De Raspberry Pi 4 biedt een baanbrekende toename in snelheid van de processor, multimedia prestaties, geheugen en connectiviteit in vergelijking met de Raspberry Pi 3 Model B+, met behoud van backwards compatibility en een bijna gelijk stroomverbruik. Voor de eindgebruiker biedt Raspberry Pi 4 Model B desktopprestaties vergelijkbaar met instapniveau x86 pc-systemen. ','Raspberry Pi 4 Model B - 2GB', 49.95),
('RasClock is een zeer nauwkeurige real-time klok die rechtstreeks op de Raspberry Pi wordt geplaatst en bevat een back-up batterij. De module wordt direct geïnstalleerd op de GPIO header pinnen zonder bedrading of solderen. Hij gebruikt de 3,3V, GND, SDA en SCL pinnen. De module blijft binnen de omtrek van de Raspberry Pi en zit lager dan video-uitgang, zodat hij in de meeste gevallen makkelijk is te plaatsen.','Raspberry pi Clock Module', 12.99),
('DOBOT Magician is een multifunctionele desktop robot arm gericht op educatie. Door de verschillende tools kan de DOBOT Magician verschillende taken uitvoeren zoals pick & place, 3D printen, lasergraveren, schrijven en tekenen. Er kan op verschillende manieren mee ontwikkeld worden door de 13 uitbreidbare interfwaces en ondersteuning voor meer dan 20 programmeertalen. Hiermee heb je bijna eindeloze mogelijkheden. Door zijn goede prestaties in zowel hardware ontwerp als software heeft de DOBOT Magician de CES 2018 Innovation Award en de iF Design Award 2018 gewonnen.', 'Dobot Magician', 1299.99),
('Bescherm je Raspberry Pi 4 met de Multicomp Pro Raspberry Pi 4 case - Power knop - Doorzichtig. Klik de Pi op de bodem van de case. Deze behuizing is voorzien van een power knop, zodat je jouw Raspberry Pi gemakkelijk aan en uit zet. Voor elke aansluiting op de printplaat is een uitsparing in de case. Door de ingegraveerde namen zie je duidelijk waar elke kabel in moet, zonder de case te openen. Dankzij de rubberen voetjes plaats je de case ook op je glanzende tv meubel, zonder deze te beschadigen. Zo gebruik je jouw Raspberry Pi ook als mediaspeler.', 'Raspberry Pi 4 Behuizing', 14.99)

