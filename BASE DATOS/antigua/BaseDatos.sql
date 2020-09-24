-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.4.13-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para ds2
CREATE DATABASE IF NOT EXISTS `ds2` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `ds2`;

-- Volcando estructura para tabla ds2.facultades
CREATE TABLE IF NOT EXISTS `facultades` (
  `idFacultad` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`idFacultad`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla ds2.facultades: ~7 rows (aproximadamente)
DELETE FROM `facultades`;
/*!40000 ALTER TABLE `facultades` DISABLE KEYS */;
INSERT INTO `facultades` (`idFacultad`, `nombre`) VALUES
	(1, 'Ciencias de la Administracion'),
	(2, 'Ciencias naturales y exactas'),
	(3, 'Ciencias sociales y economicas'),
	(4, 'Humanidades'),
	(5, 'Ingenieria'),
	(6, 'Salud'),
	(7, 'Educacion y Pedagogia');
/*!40000 ALTER TABLE `facultades` ENABLE KEYS */;

-- Volcando estructura para tabla ds2.funcionario
CREATE TABLE IF NOT EXISTS `funcionario` (
  `usuario` varchar(50) NOT NULL,
  `contraseña` varchar(50) NOT NULL,
  PRIMARY KEY (`usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla ds2.funcionario: ~0 rows (aproximadamente)
DELETE FROM `funcionario`;
/*!40000 ALTER TABLE `funcionario` DISABLE KEYS */;
INSERT INTO `funcionario` (`usuario`, `contraseña`) VALUES
	('funcionario@gmail.com', '123');
/*!40000 ALTER TABLE `funcionario` ENABLE KEYS */;

-- Volcando estructura para tabla ds2.novedades
CREATE TABLE IF NOT EXISTS `novedades` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `documento` int(11) NOT NULL,
  `temperatura` varchar(50) NOT NULL,
  `enfermedades_preexistente` varchar(50) NOT NULL,
  `convive_menores` varchar(50) NOT NULL,
  `convive_mayores` varchar(50) NOT NULL,
  `observaciones` varchar(50) NOT NULL,
  PRIMARY KEY (`codigo`),
  KEY `documento` (`documento`),
  CONSTRAINT `FK_novedades_personas` FOREIGN KEY (`documento`) REFERENCES `personas` (`documento`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla ds2.novedades: ~1 rows (aproximadamente)
DELETE FROM `novedades`;
/*!40000 ALTER TABLE `novedades` DISABLE KEYS */;
INSERT INTO `novedades` (`codigo`, `documento`, `temperatura`, `enfermedades_preexistente`, `convive_menores`, `convive_mayores`, `observaciones`) VALUES
	(1, 100, '36', 'no', 'no', 'no', 'algo');
/*!40000 ALTER TABLE `novedades` ENABLE KEYS */;

-- Volcando estructura para tabla ds2.personas
CREATE TABLE IF NOT EXISTS `personas` (
  `documento` int(11) NOT NULL,
  `tipo_documento` varchar(50) NOT NULL DEFAULT '',
  `nombre` varchar(50) NOT NULL DEFAULT '',
  `apellido` varchar(50) NOT NULL DEFAULT '',
  `telefono` int(11) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `ciudad` varchar(50) NOT NULL,
  `cargo` varchar(50) NOT NULL,
  `programa` int(11) DEFAULT NULL,
  `activo` tinyint(4) NOT NULL DEFAULT 1,
  PRIMARY KEY (`documento`),
  KEY `FK_personas_programas` (`programa`),
  CONSTRAINT `FK_personas_programas` FOREIGN KEY (`programa`) REFERENCES `programas` (`idPrograma`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla ds2.personas: ~0 rows (aproximadamente)
DELETE FROM `personas`;
/*!40000 ALTER TABLE `personas` DISABLE KEYS */;
INSERT INTO `personas` (`documento`, `tipo_documento`, `nombre`, `apellido`, `telefono`, `direccion`, `ciudad`, `cargo`, `programa`, `activo`) VALUES
	(100, '1', 'Aleja', 'Becerra', 315, 'cr 7D #31-15', 'Buga', 'Estudiante', 3841, 1);
/*!40000 ALTER TABLE `personas` ENABLE KEYS */;

-- Volcando estructura para tabla ds2.programas
CREATE TABLE IF NOT EXISTS `programas` (
  `idPrograma` int(11) NOT NULL,
  `idFacultad` int(11) DEFAULT NULL,
  `nombrePrograma` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idPrograma`),
  KEY `idFacultad` (`idFacultad`),
  CONSTRAINT `FK_programas_facultades` FOREIGN KEY (`idFacultad`) REFERENCES `facultades` (`idFacultad`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla ds2.programas: ~28 rows (aproximadamente)
DELETE FROM `programas`;
/*!40000 ALTER TABLE `programas` DISABLE KEYS */;
INSERT INTO `programas` (`idPrograma`, `idFacultad`, `nombrePrograma`) VALUES
	(2131, 2, 'Tecnología Química'),
	(2635, 6, 'Tecnología en atención prehospitalaria'),
	(2710, 5, 'Tecnología en electronica'),
	(2711, 5, 'Tecnología en sistemas de informacion'),
	(3146, 2, 'Fisica'),
	(3251, 4, 'Licenciatura en historia'),
	(3340, 3, 'Economia'),
	(3489, 7, 'Estudios políticos y resolución de conflitos'),
	(3490, 7, 'Licenciatura en Educacion fisica'),
	(3492, 7, 'Licenciatura en matematicas'),
	(3645, 6, 'Enfermeria'),
	(3646, 6, 'Fisioterapia'),
	(3647, 6, 'Bacteriología y laboratorio clínico'),
	(3648, 6, 'Fonoaudiología'),
	(3651, 6, 'Terapia ocupacional'),
	(3661, 6, 'Odontología'),
	(3743, 5, 'Ingenieria de sistemas'),
	(3744, 5, 'Ingenieria eléctrica'),
	(3745, 5, 'Ingenieria agrícola'),
	(3747, 5, 'Ingenieria civil'),
	(3748, 5, 'Ingenieria mecanica'),
	(3749, 5, 'Ingenieria quimica'),
	(3751, 5, 'Ingenieria industrial'),
	(3753, 5, 'Ingenieria de alimentos'),
	(3754, 5, 'Ingenieria sanitaria y ambiental'),
	(3841, 1, 'Contaduria pública'),
	(3845, 1, 'Administración de empresas'),
	(3857, 1, 'Comercio Exterior');
/*!40000 ALTER TABLE `programas` ENABLE KEYS */;

-- Volcando estructura para tabla ds2.registro_entrada_salida
CREATE TABLE IF NOT EXISTS `registro_entrada_salida` (
  `control` int(11) NOT NULL AUTO_INCREMENT,
  `horaEntrada` time NOT NULL,
  `fecha` date NOT NULL,
  `cedula` int(11) NOT NULL,
  `motivoVisita` varchar(50) NOT NULL,
  `horaSalida` time DEFAULT NULL,
  PRIMARY KEY (`control`),
  KEY `cedula` (`cedula`),
  CONSTRAINT `FK__personas` FOREIGN KEY (`cedula`) REFERENCES `personas` (`documento`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla ds2.registro_entrada_salida: ~3 rows (aproximadamente)
DELETE FROM `registro_entrada_salida`;
/*!40000 ALTER TABLE `registro_entrada_salida` DISABLE KEYS */;
INSERT INTO `registro_entrada_salida` (`control`, `horaEntrada`, `fecha`, `cedula`, `motivoVisita`, `horaSalida`) VALUES
	(2, '18:36:17', '2020-08-22', 100, 'Estudio', '18:45:34'),
	(6, '19:18:12', '2020-08-22', 100, 'Estudio', '19:19:54'),
	(7, '19:20:26', '2020-08-22', 100, 'Estudio', '19:24:15');
/*!40000 ALTER TABLE `registro_entrada_salida` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
