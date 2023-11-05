-- Crear una base de datos llamada "banco"
CREATE DATABASE IF NOT EXISTS banco CHARACTER SET utf8 COLLATE utf8_general_ci;
-- Usar la base de datos "banco"
USE banco;

-- Crear una tabla llamada "provincia" con los campos idProvincia (entero, clave primaria) y nombreProvincia (texto)
CREATE TABLE provincias (
  idProvincia INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nombreProvincia VARCHAR(50) NOT NULL
);

-- Crear una tabla llamada "localidad" con los campos idLocalidad (entero, clave primaria), nombreLocalidad (texto) y idProvincia (entero, clave foránea que referencia a provincia.idProvincia)
CREATE TABLE localidades (
  idLocalidad INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(50) NOT NULL,
  idProvincia INT NOT NULL,
  FOREIGN KEY (idProvincia) REFERENCES provincias(idProvincia)
);

-- Crear una tabla llamada "cliente" con los campos idCliente (entero, clave primaria), nombreCliente (texto), direccionCliente (texto), telefonoCliente (texto), idLocalidad (entero, clave foránea que referencia a localidad.idLocalidad) y estadoCliente (texto)
CREATE TABLE clientes (
  idCliente INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  dni INT NOT NULL,
  nombre VARCHAR(50) NOT NULL,
  apellido VARCHAR(50) NOT NULL,
  idLocalidad INT NOT NULL,
  direccion VARCHAR(100) NOT NULL,
  correo VARCHAR(50) NOT NULL,
  cuit bigint NOT NULL,
  genero varchar(10) NOT NULL,
  telefonoCliente VARCHAR(20) NOT NULL,
  estadoCliente VARCHAR(10) NOT NULL, 
  FOREIGN KEY (idLocalidad) REFERENCES localidades(idLocalidad)
);

-- Crear una tabla llamada "tipo_usuario" con los campos idTipoUsuario (entero, clave primaria) y descripcionTipoUsuario (texto)
CREATE TABLE tipo_usuario (
  idTipoUsuario INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  descripcion VARCHAR(50) NOT NULL
);

-- Crear una tabla llamada "usuario" con los campos idUsuario (entero, clave primaria), nombreUsuario (texto), passwordUsuario (texto), idTipoUsuario (entero, clave foránea que referencia a tipo_usuario.idTipoUsuario) y idCliente (entero, clave foránea que referencia a cliente.idCliente)
CREATE TABLE usuarios (
  idUsuario INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(50) NOT NULL,
  apellido VARCHAR(20) NOT NULL,
  usuario VARCHAR(20) NOT NULL,
  clave VARCHAR(50) NOT NULL,
  idTipoUsuario INT NOT NULL,
  idCliente INT NOT NULL,
  estado INT NOT NULL,
  FOREIGN KEY (idTipoUsuario) REFERENCES tipo_usuario(idTipoUsuario),
  FOREIGN KEY (idCliente) REFERENCES clientes(idCliente)
);

-- Crear una tabla llamada "tipo_prestamo" con los campos idTipoPrestamo (entero, clave primaria) y descripcionTipoPrestamo (texto)
CREATE TABLE tipo_cuenta (
  idTipoCuenta INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  descripcion VARCHAR(50) NOT NULL
);

-- Crear una tabla llamada "prestamo" con los campos idPrestamo (entero, clave primaria), importePrestamo (decimal), fechaSolicitudPrestamo (fecha), valorPrestamo (decimal), numeroCuentaPrestamo (entero), idTipoPrestamo (entero, clave foránea que referencia a tipo_prestamo.idTipoPrestamo) y idCliente (entero, clave foránea que referencia a cliente.idCliente)
CREATE TABLE prestamos (
  idPrestamo INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  importe DECIMAL(10,2) NOT NULL,
  fechaSolicitud DATE NOT NULL,
  valorCuota DECIMAL(10,2) NOT NULL,
  plazo_Pago INT NOT NULL,
  idCuenta INT NOT NULL,
  idTipoPrestamo INT NOT NULL,
  idCliente INT NOT NULL,
  FOREIGN KEY (idCliente) REFERENCES clientes(idCliente)
) AUTO_INCREMENT = 1000;

-- Crear una tabla llamada "cuenta" con los campos numeroCuenta (entero, clave primaria), saldoActual (decimal) y idCliente (entero, clave foránea que referencia a cliente.idCliente)
CREATE TABLE cuentas (
  idCuenta INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  numeroCuenta INT(10) NOT NULL,
  fecha_alta DATE NOT NULL,
  cbu varchar(22) NOT NULL,
  saldo DECIMAL(10,2) NOT NULL,
  idCliente INT NOT NULL,
  idTipoCuenta INT NOT NULL,
  estado BOOLEAN NOT NULL DEFAULT true,
  FOREIGN KEY (idCliente) REFERENCES clientes(idCliente)
);

-- Crear una tabla llamada "tipo_movimiento" con los campos idTipoMovimiento (entero, clave primaria) y descripcionTipoMovimiento (texto)
CREATE TABLE tipo_movimiento (
  idTipoMovimiento INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  descripcionTipoMovimiento VARCHAR(50) NOT NULL
);

-- Crear una tabla llamada "movimiento" con los campos idMovimiento (entero, clave primaria), fechaHoraMovimiento (fecha y hora), importeMovimiento (decimal), numeroCuentaOrigen (entero), numeroCuentaDestino (entero), idTipoMovimiento (entero, clave foránea que referencia a tipo_movimiento.idTipoMovimiento) y idUsuario (entero, clave foránea que referencia a usuario.idUsuario)
CREATE TABLE movimientos (
  idMovimiento INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  fecha DATE NOT NULL,
  importe DECIMAL(10,2) NOT NULL,
  concepto varchar(20) NOT NULL,
  idTipoMovimiento INT NOT NULL,
  idUsuario INT NOT NULL,
  idCuenta int not null,
  FOREIGN KEY (idTipoMovimiento) REFERENCES tipo_movimiento(idTipoMovimiento),
  FOREIGN KEY (idUsuario) REFERENCES usuarios(idUsuario)
);
