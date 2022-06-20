DROP schema if EXISTS airline_test;
CREATE schema airline_test;
USE airline_test;


CREATE TABLE aircrafts (
	aircraft_name VARCHAR(255),
    total_seats INT,
    PRIMARY KEY (aircraft_name)
);

CREATE TABLE customers (
	ID INT NOT NULL auto_increment,
    customer_name VARCHAR(255),
    customer_status VARCHAR(255),
    customer_total_mileage INT,
    PRIMARY KEY (ID)
);

CREATE TABLE fligths (
	flight_number VARCHAR(5),
    aircraft_name VARCHAR(255),
    flight_mileage INT,
    PRIMARY KEY (flight_number)
);

CREATE TABLE airline (
	ID INT NOT NULL auto_increment,
    flight_number VARCHAR(5),
    customer_id INT,
    PRIMARY KEY (ID)
);

INSERT INTO aircrafts VALUES
	('Boeing-747', 400),
	('Boeing-777', 264),
	('Airbus-A330', 236);

INSERT INTO customers (customer_name, customer_status, customer_total_mileage)  VALUES
	('María Fernández', 'Silver', 115235),
	('Jaime de la Rosa', 'None', 6008),
	('Ignacio Fernández', 'Gold', 205767),
	('Laura de la Rosa', 'None', 2653),
	('Marta Huerta', 'Silver', 127656),
	('Jesus Huerta', 'Silver', 136773),
	('Fátima de la Rosa', 'Gold', 300582),
	('María Galiana', 'Silver', 14642);
    
INSERT INTO fligths VALUES
	('DL143', 'Boeing-747', 135),
	('DL122', 'Airbus-A330', 4370),
	('DL53', 'Boeing-777', 2078),
	('DL222', 'Boeing-777', 1765),
	('DL37', 'Boeing-747', 531);
    
INSERT INTO airline (flight_number, customer_id) VALUES
	('DL143', 1),('DL122', 1),('DL122', 2),('DL122', 3),('DL53', 3),('DL143', 4),('DL222', 3),('DL143', 5),('DL222', 6),('DL222', 7),('DL122', 5),('DL37', 4),('DL222', 8);
    