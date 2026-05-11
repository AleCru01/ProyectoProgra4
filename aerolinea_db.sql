-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-05-2026 a las 17:48:26
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `aerolinea_db`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `boleto`
--

CREATE TABLE `boleto` (
  `id_boleto` int(11) NOT NULL,
  `id_vuelo` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL,
  `id_empleado` int(11) NOT NULL,
  `clase` enum('Económica','Ejecutiva','Primera Clase') NOT NULL,
  `folio` varchar(20) NOT NULL,
  `numAsiento` varchar(10) NOT NULL,
  `precio` decimal(10,2) NOT NULL,
  `fechaEmision` timestamp NOT NULL DEFAULT current_timestamp(),
  `estado` enum('Confirmado','Cancelado','Check-in') DEFAULT 'Confirmado'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudad`
--

CREATE TABLE `ciudad` (
  `id_ciudad` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `pais` varchar(100) NOT NULL,
  `ubicacion` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ciudad`
--

INSERT INTO `ciudad` (`id_ciudad`, `nombre`, `pais`, `ubicacion`) VALUES
(1, 'San Luis Potosi', 'Mexico', 'Norte America'),
(2, 'Monterrey', 'Mexico', 'Norte America'),
(3, 'New York', 'Estados Unidos', 'Norte America'),
(4, 'Toronto', 'Canada', 'Norte America'),
(5, 'Buenos Aires', 'Argentina', 'Sudamerica'),
(6, 'Sao Paulo', 'Brasil', 'Sudamerica'),
(7, 'Madrid', 'España', 'Europa'),
(8, 'Paris', 'Francia', 'Europa'),
(9, 'Berlin', 'Alemania', 'Europa'),
(10, 'Roma', 'Italia', 'Europa'),
(11, 'Londres', 'Reino Unido', 'Europa'),
(12, 'Tokio', 'Japón', 'Asia'),
(13, 'Seúl', 'Corea del Sur', 'Asia'),
(14, 'Beijing', 'China', 'Asia'),
(15, 'Nueva Delhi', 'India', 'Asia'),
(16, 'Bangkok', 'Tailandia', 'Asia'),
(17, 'Sídney', 'Australia', 'Oceanía'),
(18, 'Melbourne', 'Australia', 'Oceanía'),
(19, 'El Cairo', 'Egipto', 'África'),
(20, 'Johannesburgo', 'Sudáfrica', 'África'),
(21, 'Nairobi', 'Kenia', 'África'),
(22, 'Casablanca', 'Marruecos', 'África');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `id_empleado` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `usuario` varchar(50) NOT NULL,
  `codigoEmpleado` varchar(20) NOT NULL,
  `correo` varchar(100) NOT NULL,
  `telefono` varchar(20) NOT NULL,
  `contraseña` varchar(255) NOT NULL,
  `sexo` enum('M','F','Otro') NOT NULL,
  `rfc` varchar(13) NOT NULL,
  `fechaDeContratacion` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`id_empleado`, `nombre`, `apellido`, `usuario`, `codigoEmpleado`, `correo`, `telefono`, `contraseña`, `sexo`, `rfc`, `fechaDeContratacion`) VALUES
(2, 'Admin', '1', 'admin', 'ADMIN01', 'admin@aerolinea.com', '555-0000', '1234', 'M', 'ADMIN123456', '2026-04-20'),
(3, 'Eduardo', 'Cisneros', 'admin2', '10', '12@gmail.com', '4443718141', 'victor', 'M', 'BACV010406', '2006-01-04');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id_usuario` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `usuario` varchar(50) NOT NULL,
  `fechaDeNacimiento` date NOT NULL,
  `nacionalidad` varchar(50) NOT NULL,
  `pasaporte` varchar(20) NOT NULL,
  `correo` varchar(100) NOT NULL,
  `telefono` varchar(20) NOT NULL,
  `contraseña` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id_usuario`, `nombre`, `apellido`, `usuario`, `fechaDeNacimiento`, `nacionalidad`, `pasaporte`, `correo`, `telefono`, `contraseña`) VALUES
(3, 'Marissa', 'Perez', 'Mari', '2005-01-11', 'Mexicana', 'dshnsjk', '1233@gmail.com', '4813468723', '123456'),
(4, 'Manuel', 'Lara', 'Manu', '2004-04-21', 'Mexicana', 'skj', '1343@gmail.com', '29462937', '654321'),
(5, 'Hugo', 'Herrera', 'HuguitoCrack', '2000-04-01', 'Mexicana', 'Mexicano', 'Huguito@gmail.com', '4443718141', '246810'),
(6, 'angie', 'espinosa', 'anyi', '2006-02-14', 'mexicana', 'jajajajaja', 'hola@gmail.com', '1818181818', '123456'),
(7, 'Franco', 'Huerta', 'FraHu', '2000-05-02', 'Mexicana', '12123adfq', 'fahu@gmail.com', '4443718141', '123456');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vuelo`
--

CREATE TABLE `vuelo` (
  `id_vuelo` int(11) NOT NULL,
  `id_origen` int(11) NOT NULL,
  `id_destino` int(11) NOT NULL,
  `numVuelo` varchar(20) NOT NULL,
  `horarioSalida` datetime NOT NULL,
  `horarioLlegada` datetime NOT NULL,
  `capacidadTotal` int(11) NOT NULL,
  `precioBoleto` decimal(10,2) NOT NULL,
  `fecha` date DEFAULT NULL,
  `estado` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `vuelo`
--

INSERT INTO `vuelo` (`id_vuelo`, `id_origen`, `id_destino`, `numVuelo`, `horarioSalida`, `horarioLlegada`, `capacidadTotal`, `precioBoleto`, `fecha`, `estado`) VALUES
(1, 1, 3, '19000', '2026-04-30 17:57:02', '2026-04-30 09:57:02', 51, 400.00, '2026-04-30', 'Activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vuelo_ocupacion`
--

CREATE TABLE `vuelo_ocupacion` (
  `id_ocupacion` int(11) NOT NULL,
  `id_vuelo` int(11) NOT NULL,
  `indice` int(11) NOT NULL,
  `estado` tinyint(4) NOT NULL,
  `id_usuario` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `boleto`
--
ALTER TABLE `boleto`
  ADD PRIMARY KEY (`id_boleto`),
  ADD UNIQUE KEY `folio` (`folio`),
  ADD UNIQUE KEY `unique_asiento` (`id_vuelo`,`numAsiento`),
  ADD KEY `id_usuario` (`id_usuario`),
  ADD KEY `id_empleado` (`id_empleado`);

--
-- Indices de la tabla `ciudad`
--
ALTER TABLE `ciudad`
  ADD PRIMARY KEY (`id_ciudad`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`id_empleado`),
  ADD UNIQUE KEY `codigoEmpleado` (`codigoEmpleado`),
  ADD UNIQUE KEY `correo` (`correo`),
  ADD UNIQUE KEY `rfc` (`rfc`),
  ADD UNIQUE KEY `usuario` (`usuario`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_usuario`),
  ADD UNIQUE KEY `pasaporte` (`pasaporte`),
  ADD UNIQUE KEY `correo` (`correo`),
  ADD UNIQUE KEY `usuario` (`usuario`);

--
-- Indices de la tabla `vuelo`
--
ALTER TABLE `vuelo`
  ADD PRIMARY KEY (`id_vuelo`),
  ADD UNIQUE KEY `numVuelo` (`numVuelo`),
  ADD KEY `id_origen` (`id_origen`),
  ADD KEY `id_destino` (`id_destino`);

--
-- Indices de la tabla `vuelo_ocupacion`
--
ALTER TABLE `vuelo_ocupacion`
  ADD PRIMARY KEY (`id_ocupacion`),
  ADD KEY `id_vuelo` (`id_vuelo`),
  ADD KEY `id_usuario` (`id_usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `boleto`
--
ALTER TABLE `boleto`
  MODIFY `id_boleto` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `ciudad`
--
ALTER TABLE `ciudad`
  MODIFY `id_ciudad` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT de la tabla `empleado`
--
ALTER TABLE `empleado`
  MODIFY `id_empleado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `vuelo`
--
ALTER TABLE `vuelo`
  MODIFY `id_vuelo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `vuelo_ocupacion`
--
ALTER TABLE `vuelo_ocupacion`
  MODIFY `id_ocupacion` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `boleto`
--
ALTER TABLE `boleto`
  ADD CONSTRAINT `boleto_ibfk_1` FOREIGN KEY (`id_vuelo`) REFERENCES `vuelo` (`id_vuelo`),
  ADD CONSTRAINT `boleto_ibfk_2` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`),
  ADD CONSTRAINT `boleto_ibfk_3` FOREIGN KEY (`id_empleado`) REFERENCES `empleado` (`id_empleado`);

--
-- Filtros para la tabla `vuelo`
--
ALTER TABLE `vuelo`
  ADD CONSTRAINT `vuelo_ibfk_1` FOREIGN KEY (`id_origen`) REFERENCES `ciudad` (`id_ciudad`),
  ADD CONSTRAINT `vuelo_ibfk_2` FOREIGN KEY (`id_destino`) REFERENCES `ciudad` (`id_ciudad`);

--
-- Filtros para la tabla `vuelo_ocupacion`
--
ALTER TABLE `vuelo_ocupacion`
  ADD CONSTRAINT `vuelo_ocupacion_ibfk_1` FOREIGN KEY (`id_vuelo`) REFERENCES `vuelo` (`id_vuelo`),
  ADD CONSTRAINT `vuelo_ocupacion_ibfk_2` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
