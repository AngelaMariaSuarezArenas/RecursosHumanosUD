/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  USUARIO
 * Created: 11/11/2022
 */
DROP DATABASE gestiónpersonaliud;

CREATE DATABASE IF NOT EXISTS gestiónpersonaliud;--crear la BBDD

USE gestiónpersonaliud;--seleccionar la BD

--creacion de tablas
CREATE TABLE tipos_identificacion(   
id INT NOT NULL AUTO_INCREMENT,
nombre VARCHAR(45) NOT NULL,
descripcion VARCHAR(250),
PRIMARY KEY(id_tipos_identificacion)
);

CREATE TABLE estados_civil(
id INT NOY NULL AUTO_INCREMENT,
nombre VARCHAR(45),
descripcion VARCHAR(250),
PRIMARY KEY(id_estados_civil)
);

CREATE TABLE funcionarios(
id INT NOT NULL AUTO_INCREMENT,
numero_identificador VARCHAR(45) NOT NULL,
nombres VARCHAR(120) NOT NULL,
apellidos VARCHAR(120) NOT NULL,
sexo CHAR(2),
direccion VARCHAR(45),
telefono VARCHAR(45),
fecha_nacimiento DATE,
fecha_creacion DATETIME DEFAULT NOW(),
fecha_actualizacion DATETIME DEFAULT NOW(),
id_tipos_identificacion INT NOT NULL,
id_estados_civil INT NOT NULL,
PRIMARY KEY(id_funcionarios),
UNIQUE(numero_identificacion),
FOREIGN KEY(id_tipos_identificacion)REFERENCES tipos_identificacion(id),
FOREIGN KEY(id_estados_civil) REFERENCES estados_civil(id) 
);

CREATE TABLE parentescos(
id INT NOT NULL AUTO_INCREMENT,
nombre VARCHAR(120) NOT NULL,
descripcion VARCHAR(120),
PRIMARY KEY(id_parentescos)
);
CREATE TABLE grupo_familiares(
id INT NOT NULL AUTO_INCREMENT,
nombre VARCHAR(120) NOT NULL,
apellido VARCHAR(120) NOT NULL,
direccion VARCHAR(45) NOT NULL,
fecha_creacion DATETIME DEFAULT NOW(),
fecha_actualizacion DATETIME DEFAULT NOW(),
id_parentescos INT NOT NULL,
PRIMARY KEY (id),
UNIQUE(nombre),
FOREIGN KEY(id_funcionarios) REFERENCES funcionarios(id),
FOREIGN KEY(id_parentescos) REFERENCES parentescos(id)
);

CREATE TABLE niveles_educativos(
id INT NOT NULL AUTO_INCREMENT,
nombre VARCHAR(120) NOT NULL,
descripcion VARCHAR(120),
PRIMARY KEY(idniveles_educativos)
);

CREATE TABLE universidades(
id INT NOT NULL AUTO_INCREMENT,
nombre VARCHAR(120) NOT NULL,
descripcion VARCHAR(250),
fecha_creacion DATETIME DEFAULT NOW(),
fecha_actualizacion DATETIME DEFAULT NOW(),
PRIMARY KEY(id_universidades)
);

CREATE TABLE estados_formacion(
id INT NOT NULL AUTO_INCREMENT,
nombre VARCHAR(120) NOT NULL,
descripcion VARCHAR(250),
PRIMARY KEY(id_estados_formacion)
);

CREATE TABLE formaciones_academicas(
id INT NOT NULL AUTO_INCREMENTABLE,
fecha_inicio DATETIME DEFAULT NOW(),
fecha_creacion DATETIME DEFAULT NOW(),
id_niveles_educativos INT NOT NULL,
id_universidades INT NOT NULL,
id_estados_formacion INT NOT NULL,
PRIMARY KEY(id_formaciones_academicas),
FOREIGN KEY(id_niveles_educativos)REFERENCES niveles_educativos(id),
FOREIGN KEY(id_universidades)REFERENCES universidades(id),
FOREIGN KEY(id_estados_formacion)REFERENCES estados_formacion(id)
);

/*
POPULATION (llenado) DE TABLAS
*/
-- llenado tabla tipos de identificación
INSERT INTO tipos_identificacion(nombre, descripcion)
VALUES('CC', 'Cédula de ciudadania');
INSERT INTO tipos_identificacion(nombre, descripcion)
VALUES('TI', 'Tarjeta de Identidad');
INSERT INTO tipos_identificacion(nombre,descripcion) 
VALUES ('CE', 'Tarjeta de extranjería');
INSERT INTO tipos_identificacion(nombre,descripcion) 
VALUES ('PS', 'Pasaporte');
INSERT INTO tipos_identificacion(nombre,descripcion) 
VALUES ('OT', 'Otro documento de identificación');

-- llenado tabla estados civiles
INSERT INTO estados_civiles(nombre, descripcion)
VALUES ('SOL', 'Solterito y a la orden');
INSERT INTO estados_civil(nombre,descripcion) 
VALUES ('CAS', 'Casado y no a la orden');
INSERT INTO estados_civil(nombre,descripcion) 
VALUES ('ULB', 'En Unión libre');
INSERT INTO estados_civil(nombre,descripcion) 
VALUES ('VAC', 'Vacilando con la muchacha de al lado');
INSERT INTO estados_civil(nombre,descripcion) 
VALUES ('OTR', 'Otro estado civil');

-- llenado tabla funcionarios
INSERT INTO funcionarios(numero_identificacion,nombres,apellidos,sexo,direccion,
    telefono,fecha_nacimiento,tipos_identificacion_id,estados_civil_id) 
VALUES ('111111', 'Julio', 'Martinez', 'M', 'Calle 20','603522222',
'1985-08-05', 1, 2);
