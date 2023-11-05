-- PROVINCIAS
insert into provincias (nombreProvincia) values ('Buenos Aires');
insert into provincias (nombreProvincia) values ('CÃ³rdoba');
insert into provincias (nombreProvincia) values ('Santa Fe');
insert into provincias (nombreProvincia) values ('Mendoza');
insert into provincias (nombreProvincia) values ('TucumÃ¡n');
insert into provincias (nombreProvincia) values ('Entre RÃ­os');
insert into provincias (nombreProvincia) values ('Salta');
insert into provincias (nombreProvincia) values ('Chaco');
insert into provincias (nombreProvincia) values ('Corrientes');
insert into provincias (nombreProvincia) values ('Santiago del Estero');
insert into provincias (nombreProvincia) values ('Jujuy');
insert into provincias (nombreProvincia) values ('RÃ­o Negro');
insert into provincias (nombreProvincia) values ('NeuquÃ©n');
insert into provincias (nombreProvincia) values ('Formosa');
insert into provincias (nombreProvincia) values ('Chubut');

-- select * from provincia;

-- LOCALIDADES
insert into localidades (nombre, idProvincia) values ('Tigre',1);
insert into localidades (nombre, idProvincia) values ('Carlos Paz', 2);
insert into localidades (nombre, idProvincia) values ('Rosario', 3);
insert into localidades (nombre, idProvincia) values ('Ushuaia', 11);
insert into localidades (nombre, idProvincia) values ('La Plata', 1);
insert into localidades (nombre, idProvincia) values ('Mar del Plata', 1);
insert into localidades (nombre, idProvincia) values ('San Miguel de TucumÃ¡n', 5);
insert into localidades (nombre, idProvincia) values ('Iruya', 11);
insert into localidades (nombre, idProvincia) values ('Tafi', 5);
insert into localidades (nombre, idProvincia) values ('Corrientes', 7);
insert into localidades (nombre, idProvincia) values ('BahÃ­a Blanca', 1);
insert into localidades (nombre, idProvincia) values ('Resistencia', 8);
insert into localidades (nombre, idProvincia) values ('Rio Grande', 11);
insert into localidades (nombre, idProvincia) values ('San Martin de los Andes', 12);
insert into localidades (nombre, idProvincia) values ('Villa Gral Belgrano', 2);
-- select * from localidad;

-- CLIENTES
insert into clientes (dni, nombre, apellido, idLocalidad, direccion, correo, cuit, genero, telefonoCliente, estadoCliente) values ('23456789', 'Martín', 'González', 9, 'Av. Rivadavia 1234', 'ofesby0@over-blog.com', 24513788842, 'masculino', 1580926353, 1);
insert into clientes (dni, nombre, apellido, idLocalidad, direccion, correo, cuit, genero, telefonoCliente, estadoCliente) values ('98765432', 'Lucía', 'Rodríguez', 8, 'Calle San Martín 567', 'amarkey1@reuters.com', 22675680800, 'femenino', 1501631829, 1);
insert into clientes (dni, nombre, apellido, idLocalidad, direccion, correo, cuit, genero, telefonoCliente, estadoCliente) values ('45678901', 'Santiago', 'López', 8, 'Av. Corrientes 890', 'kboshere2@wordpress.org', 20852407145, 'no binario', 1522843090, 0);
insert into clientes (dni, nombre, apellido, idLocalidad, direccion, correo, cuit, genero, telefonoCliente, estadoCliente) values ('12345678', 'Valentina', 'Martínez', 13, 'Calle Belgrano 432', 'hmccomiskie3@home.pl', 22451633770, 'masculino', 1551096941, 1);
insert into clientes (dni, nombre, apellido, idLocalidad, direccion, correo, cuit, genero, telefonoCliente, estadoCliente) values ('76543210', 'Mateo', 'Pérez', 15, 'Av. Santa Fe 987', 'gnoirel4@hhs.gov', 21812713017, 'femenino', 1563743033, 0);
insert into clientes (dni, nombre, apellido, idLocalidad, direccion, correo, cuit, genero, telefonoCliente, estadoCliente) values ('78901234', 'Sofía', 'Gómez', 2, 'Calle Florida 654', 'bheintzsch5@twitter.com', 21690576804, 'no binario', 1547686334, 0);
insert into clientes (dni, nombre, apellido, idLocalidad, direccion, correo, cuit, genero, telefonoCliente, estadoCliente) values ('12345678', 'Benjamín', 'Fernández', 9, 'Av. Cabildo 321', 'gedelmann6@godaddy.com', 21589089585, 'masculino', 1511140058, 0);
insert into clientes (dni, nombre, apellido, idLocalidad, direccion, correo, cuit, genero, telefonoCliente, estadoCliente) values ('56789012', 'Isabella', 'Sánchez', 9, 'Calle Lavalle 876', 'rmcgeaney7@addtoany.com', 22707407745, 'femenino', 1560521344, 0);
insert into clientes (dni, nombre, apellido, idLocalidad, direccion, correo, cuit, genero, telefonoCliente, estadoCliente) values ('65432109', 'Nicolás', 'Ramírez', 4, 'Av. Pueyrredón 543', 'smcbeth8@e-recht24.de', 21417041577, 'no binario', 1584956508, 1);
insert into clientes (dni, nombre, apellido, idLocalidad, direccion, correo, cuit, genero, telefonoCliente, estadoCliente) values ('90123456', 'Emma', 'Torres', 5, 'Calle Reconquista 210', 'rtiuit9@canalblog.com', 20832722451, 'masculino', 1585105222, 0);
insert into clientes (dni, nombre, apellido, idLocalidad, direccion, correo, cuit, genero, telefonoCliente, estadoCliente) values ('56789012', 'Sebastián', 'Flores', 13, 'Av. Callao 765', 'jlubea@woothemes.com', 23004485667, 'femenino', 1500171169, 1);
insert into clientes (dni, nombre, apellido, idLocalidad, direccion, correo, cuit, genero, telefonoCliente, estadoCliente) values ('89012345', 'Mía', 'Rivera', 7, 'Calle Sarmiento 432', 'gbrendishb@ezinearticles.com', 22834902041, 'no binario', 1558003216, 1);
insert into clientes (dni, nombre, apellido, idLocalidad, direccion, correo, cuit, genero, telefonoCliente, estadoCliente) values ('34567890', 'Joaquín', 'Gutiérrez', 6, 'Av. CÃ³rdoba 1098', 'rdinningtonc@liveinternet.ru', 24634478002, 'masculino', 1543168939, 0);
insert into clientes (dni, nombre, apellido, idLocalidad, direccion, correo, cuit, genero, telefonoCliente, estadoCliente) values ('76543210', 'Valeria', 'Romero', 2, 'Calle Maipú 567', 'nsailord@phoca.cz', 23379556608, 'femenino', 1512055112, 0);
insert into clientes (dni, nombre, apellido, idLocalidad, direccion, correo, cuit, genero, telefonoCliente, estadoCliente) values ('89012345', 'Lautaro', 'Navarro', 10, 'Av. 9 de Julio 876', 'kmayhoue@auda.org.au', 21232357081, 'no binario', 1535438550, 1);

insert into tipo_cuenta (descripcion) values ('Caja de ahorro');
insert into tipo_cuenta (descripcion) values ('Cuenta corriente');

insert into cuentas (numeroCuenta, fecha_alta, cbu, saldo, idCliente, idTipoCuenta) values (1000,'2023-11-01','3400', 41203.21, 1, 1);
insert into cuentas (numeroCuenta, fecha_alta, cbu, saldo, idCliente, idTipoCuenta) values (1001,'2023-11-02','3401', 9676.21, 2, 2);
insert into cuentas (numeroCuenta, fecha_alta, cbu, saldo, idCliente, idTipoCuenta) values (1002,'2023-10-21','3403', 96657.21, 3, 1);
insert into cuentas (numeroCuenta, fecha_alta, cbu, saldo, idCliente, idTipoCuenta) values (1003,'2023-10-22','3402', 56454.21, 4, 1);
insert into cuentas (numeroCuenta, fecha_alta, cbu, saldo, idCliente, idTipoCuenta) values (1004,'2023-10-17','3404', 6456.21, 5, 2);
insert into cuentas (numeroCuenta, fecha_alta, cbu, saldo, idCliente, idTipoCuenta) values (1005,'2023-10-14','3405', 446.21, 6, 1);
insert into cuentas (numeroCuenta, fecha_alta, cbu, saldo, idCliente, idTipoCuenta) values (1006,'2023-10-13','3406', 645.21, 7, 2);