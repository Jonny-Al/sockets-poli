CREATE DATABASE poli_personas;
USE poli_personas;

DROP TABLE CIUDAD;

CREATE TABLE `CIUDAD` (
  `ciud_id` INT(11) NOT NULL AUTO_INCREMENT,
  `ciud_nombre` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`ciud_id`)
);

CREATE TABLE `PERSONAS` (
  `person_id` INT(11) NOT NULL AUTO_INCREMENT,
  `dir_tel` VARCHAR(20) NOT NULL,
  `dir_tipo_tel` INT(2) NOT NULL,
  `dir_nombre` VARCHAR(100) NOT NULL,
  `dir_direccion` VARCHAR(100) NOT NULL,
  `dir_ciud_id` INT(2) NOT NULL,
  PRIMARY KEY (`person_id`),
  CONSTRAINT `Fk_ciudad` FOREIGN KEY (`dir_ciud_id`) REFERENCES `CIUDAD` (`ciud_id`)
);

/*  INSERT CIUDAD */

INSERT INTO CIUDAD (ciud_nombre) VALUES ('Bogotá');
INSERT INTO CIUDAD (ciud_nombre) VALUES ('Medellin');
INSERT INTO CIUDAD (ciud_nombre) VALUES ('Cali');
INSERT INTO CIUDAD (ciud_nombre) VALUES ('Cartagena');
INSERT INTO CIUDAD (ciud_nombre) VALUES ('Barranquilla');


SELECT * FROM CIUDAD;

/* INSERT PERSONA */

INSERT INTO PERSONAS (dir_tel,dir_tipo_tel,dir_nombre,dir_direccion,dir_ciud_id) VALUES ('111111111',1,'Mateo Pedraza','Calle 7 # 14',1);
INSERT INTO PERSONAS (dir_tel,dir_tipo_tel,dir_nombre,dir_direccion,dir_ciud_id) VALUES ('22222222',1,'Camilo Garcia','Tv 7 # 14',2);
INSERT INTO PERSONAS (dir_tel,dir_tipo_tel,dir_nombre,dir_direccion,dir_ciud_id) VALUES ('33333333',0,'Pedro Salazar','Carrera 15 # 19',3);
INSERT INTO PERSONAS (dir_tel,dir_tipo_tel,dir_nombre,dir_direccion,dir_ciud_id) VALUES ('44444444',0,'Jenny Perez','Calle 10 # 6',4);
INSERT INTO PERSONAS (dir_tel,dir_tipo_tel,dir_nombre,dir_direccion,dir_ciud_id) VALUES ('55555555',0,'Cristian Diaz','Tv 146 # 78 56',5);

SELECT * FROM PERSONAS;
