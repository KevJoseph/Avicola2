-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: bd_avicola
-- ------------------------------------------------------
-- Server version	5.7.12-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `asistencias`
--

DROP TABLE IF EXISTS `asistencias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `asistencias` (
  `idpersonal` int(10) unsigned NOT NULL,
  `estado` int(11) DEFAULT '1',
  `hora_extra` int(11) DEFAULT '1',
  `fecha` date DEFAULT NULL,
  KEY `idpersonal` (`idpersonal`),
  CONSTRAINT `asistencias_ibfk_1` FOREIGN KEY (`idpersonal`) REFERENCES `personal` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asistencias`
--

LOCK TABLES `asistencias` WRITE;
/*!40000 ALTER TABLE `asistencias` DISABLE KEYS */;
INSERT INTO `asistencias` VALUES (1,1,1,'2017-01-11'),(2,1,1,'2017-01-11'),(3,1,1,'2017-01-11'),(4,1,1,'2017-01-11'),(1,1,1,'2017-01-12'),(2,1,1,'2017-01-12'),(3,1,1,'2017-01-12'),(4,1,1,'2017-01-12'),(1,1,1,'2017-01-13'),(2,1,1,'2017-01-13'),(3,1,1,'2017-01-13'),(4,1,1,'2017-01-13'),(1,1,1,'2017-01-14'),(2,1,1,'2017-01-14'),(3,1,1,'2017-01-14'),(4,1,1,'2017-01-14');
/*!40000 ALTER TABLE `asistencias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `descansos`
--

DROP TABLE IF EXISTS `descansos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `descansos` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nombre_p` varchar(100) DEFAULT NULL,
  `apellido_p` varchar(100) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `estado` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `descansos`
--

LOCK TABLES `descansos` WRITE;
/*!40000 ALTER TABLE `descansos` DISABLE KEYS */;
/*!40000 ALTER TABLE `descansos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `galpones`
--

DROP TABLE IF EXISTS `galpones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `galpones` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `numero_galpon` varchar(5) DEFAULT NULL,
  `descripcion` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `galpones`
--

LOCK TABLES `galpones` WRITE;
/*!40000 ALTER TABLE `galpones` DISABLE KEYS */;
INSERT INTO `galpones` VALUES (1,'11',NULL),(2,'22',NULL),(3,'33',NULL),(4,'44','Trabajan 2 personales');
/*!40000 ALTER TABLE `galpones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `personal`
--

DROP TABLE IF EXISTS `personal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `personal` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `codpersonal` varchar(8) DEFAULT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `apellido` varchar(100) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `tipo` varchar(100) DEFAULT NULL,
  `idgalpon` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_personal_galpones1_idx` (`idgalpon`),
  CONSTRAINT `fk_personal_galpones1` FOREIGN KEY (`idgalpon`) REFERENCES `galpones` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personal`
--

LOCK TABLES `personal` WRITE;
/*!40000 ALTER TABLE `personal` DISABLE KEYS */;
INSERT INTO `personal` VALUES (1,'77167125','Kevin','Ramos','2017-01-09','Fijo',1),(2,'12345678','Juan','Sanchez','2017-01-09','Fijo',2),(3,'87654321','Viviana','Rojas','2014-01-01','Volante',3),(4,'98712365','Luis ','Cañas','2011-07-23','Fijo',4);
/*!40000 ALTER TABLE `personal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `repo`
--

DROP TABLE IF EXISTS `repo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `repo` (
  `idpersonal` int(11) DEFAULT NULL,
  `codpersonal` varchar(8) DEFAULT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `apellido` varchar(100) DEFAULT NULL,
  `idgalpon` int(11) DEFAULT NULL,
  `estado` int(11) DEFAULT NULL,
  `hora_extra` int(11) DEFAULT NULL,
  `fecha` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `repo`
--

LOCK TABLES `repo` WRITE;
/*!40000 ALTER TABLE `repo` DISABLE KEYS */;
INSERT INTO `repo` VALUES (1,'77167125','Kevin','Ramos',1,1,1,'2017-01-11'),(2,'12345678','Juan','Sanchez',2,1,1,'2017-01-11'),(3,'87654321','Viviana','Rojas',3,1,1,'2017-01-11'),(4,'98712365','Luis ','Cañas',4,4,1,'2017-01-11'),(1,'77167125','Kevin','Ramos',1,1,1,'2017-01-12'),(2,'12345678','Juan','Sanchez',2,1,1,'2017-01-12'),(3,'87654321','Viviana','Rojas',3,1,1,'2017-01-12'),(4,'98712365','Luis ','Cañas',4,2,1,'2017-01-12'),(1,'77167125','Kevin','Ramos',1,1,1,'2017-01-13'),(2,'12345678','Juan','Sanchez',2,1,1,'2017-01-13'),(3,'87654321','Viviana','Rojas',3,1,1,'2017-01-13'),(4,'98712365','Luis ','Cañas',4,0,1,'2017-01-13'),(1,'77167125','Kevin','Ramos',1,1,1,'2017-01-14'),(2,'12345678','Juan','Sanchez',2,1,1,'2017-01-14'),(3,'87654321','Viviana','Rojas',3,1,1,'2017-01-14'),(4,'98712365','Luis ','Cañas',4,2,1,'2017-01-14');
/*!40000 ALTER TABLE `repo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'bd_avicola'
--

--
-- Dumping routines for database 'bd_avicola'
--
/*!50003 DROP PROCEDURE IF EXISTS `proc_asis` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `proc_asis`()
BEGIN
INSERT INTO asistencias 
(idpersonal,fecha)
SELECT id,curdate() from personal;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `proc_fantasma` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `proc_fantasma`()
BEGIN
INSERT INTO repo
(idpersonal,codpersonal,nombre,apellido,idgalpon,estado,hora_extra,fecha)
select  a.idpersonal,p.codpersonal,p.nombre,p.apellido,p.idgalpon,a.estado,a.hora_extra,a.fecha from asistencias a
inner join personal p on (a.idpersonal = p.id) where a.fecha=curdate();
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-01-11 17:49:44
