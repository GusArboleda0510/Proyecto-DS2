-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.4.6-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             10.3.0.5771
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
  `correo` varchar(50) NOT NULL,
  PRIMARY KEY (`idFacultad`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla ds2.facultades: ~7 rows (aproximadamente)
/*!40000 ALTER TABLE `facultades` DISABLE KEYS */;
INSERT IGNORE INTO `facultades` (`idFacultad`, `nombre`, `correo`) VALUES
	(1, 'Ciencias de la Administracion', 'becerra.alejandra@correounivalle.edu.co'),
	(2, 'Ciencias naturales y exactas', 'gustavo.arboleda@correounivalle.edu.co'),
	(3, 'Ciencias sociales y economicas', 'kevin.cuadros@correounivalle.edu.co'),
	(4, 'Humanidades', 'becerra.alejandra@correounivalle.edu.co'),
	(5, 'Ingenieria', 'gustavo.arboleda@correounivalle.edu.co'),
	(6, 'Salud', 'kevin.cuadros@correounivalle.edu.co'),
	(7, 'Educacion y Pedagogia', 'becerra.alejandra@correounivalle.edu.co');
/*!40000 ALTER TABLE `facultades` ENABLE KEYS */;

-- Volcando estructura para tabla ds2.funcionario
CREATE TABLE IF NOT EXISTS `funcionario` (
  `usuario` varchar(50) NOT NULL,
  `contraseña` varchar(50) NOT NULL,
  PRIMARY KEY (`usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla ds2.funcionario: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `funcionario` DISABLE KEYS */;
INSERT IGNORE INTO `funcionario` (`usuario`, `contraseña`) VALUES
	('funcionario@gmail.com', '123');
/*!40000 ALTER TABLE `funcionario` ENABLE KEYS */;

-- Volcando estructura para tabla ds2.info_mail
CREATE TABLE IF NOT EXISTS `info_mail` (
  `id_datos` int(11) NOT NULL AUTO_INCREMENT,
  `destino` varchar(50) NOT NULL,
  `clave_destino` varchar(50) NOT NULL,
  `host1` varchar(50) NOT NULL,
  `host2` varchar(50) NOT NULL,
  `puerto1` varchar(50) NOT NULL,
  `puerto2` varchar(50) NOT NULL,
  `correo_admin` varchar(50) NOT NULL,
  PRIMARY KEY (`id_datos`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla ds2.info_mail: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `info_mail` DISABLE KEYS */;
INSERT IGNORE INTO `info_mail` (`id_datos`, `destino`, `clave_destino`, `host1`, `host2`, `puerto1`, `puerto2`, `correo_admin`) VALUES
	(1, 'porteriaunivalle01@gmail.com', '01porteriaunivalle', 'mail.smtp.host', 'smtp.gmail.com', 'mail.smtp.port', '587', 'gustavo.arboleda@correounivalle.edu.co');
/*!40000 ALTER TABLE `info_mail` ENABLE KEYS */;

-- Volcando estructura para tabla ds2.novedades
CREATE TABLE IF NOT EXISTS `novedades` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `documento` int(11) NOT NULL,
  `temperatura` varchar(50) NOT NULL DEFAULT '',
  `enfermedades_preexistente` varchar(50) NOT NULL DEFAULT '',
  `convive_menores` varchar(50) NOT NULL DEFAULT '',
  `convive_mayores` varchar(50) NOT NULL DEFAULT '',
  `observaciones` varchar(50) NOT NULL DEFAULT '',
  `fecha` date NOT NULL,
  `hora` time NOT NULL,
  `usuario` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`codigo`),
  KEY `documento` (`documento`),
  KEY `FK_novedades_funcionario` (`usuario`),
  CONSTRAINT `FK_novedades_funcionario` FOREIGN KEY (`usuario`) REFERENCES `funcionario` (`usuario`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_novedades_personas` FOREIGN KEY (`documento`) REFERENCES `personas` (`documento`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla ds2.novedades: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `novedades` DISABLE KEYS */;
INSERT IGNORE INTO `novedades` (`codigo`, `documento`, `temperatura`, `enfermedades_preexistente`, `convive_menores`, `convive_mayores`, `observaciones`, `fecha`, `hora`, `usuario`) VALUES
	(4, 100, '10', 'Ninguno', 'SI', 'SI', '0000', '2019-12-30', '21:35:25', 'funcionario@gmail.com'),
	(5, 100, '15', 'Ninguno', 'SI', 'SI', 'Final', '2019-12-30', '21:45:30', 'funcionario@gmail.com');
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

-- Volcando datos para la tabla ds2.personas: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `personas` DISABLE KEYS */;
INSERT IGNORE INTO `personas` (`documento`, `tipo_documento`, `nombre`, `apellido`, `telefono`, `direccion`, `ciudad`, `cargo`, `programa`, `activo`) VALUES
	(100, 'TI', 'Aleja', 'Becerra', 315, 'cr 7D #31-15', 'Buga', 'Estudiante', 3841, 1),
	(108, 'CC', 'Alejandra', 'Becerra', 315606, 'av 4', 'Buga', 'Docente', 3744, 0);
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
/*!40000 ALTER TABLE `programas` DISABLE KEYS */;
INSERT IGNORE INTO `programas` (`idPrograma`, `idFacultad`, `nombrePrograma`) VALUES
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
  `horaSalida` time DEFAULT NULL,
  PRIMARY KEY (`control`),
  KEY `cedula` (`cedula`),
  CONSTRAINT `FK__personas` FOREIGN KEY (`cedula`) REFERENCES `personas` (`documento`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla ds2.registro_entrada_salida: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `registro_entrada_salida` DISABLE KEYS */;
INSERT IGNORE INTO `registro_entrada_salida` (`control`, `horaEntrada`, `fecha`, `cedula`, `horaSalida`) VALUES
	(2, '18:36:17', '2020-08-22', 100, '18:45:34'),
	(6, '19:18:12', '2020-08-22', 100, '19:19:54');
/*!40000 ALTER TABLE `registro_entrada_salida` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
