-- MySQL dump 10.13  Distrib 5.7.23, for Win64 (x86_64)
--
-- Host: localhost    Database: gestionclient
-- ------------------------------------------------------
-- Server version	5.7.23-log

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
-- Table structure for table `client`
--

DROP TABLE IF EXISTS `client`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `client` (
  `code` varchar(6) NOT NULL,
  `nom` varchar(30) DEFAULT NULL,
  `prenom` varchar(30) DEFAULT NULL,
  `telephone` varchar(20) DEFAULT NULL,
  `adresse` varchar(50) DEFAULT NULL,
  `courriel` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `client`
--

LOCK TABLES `client` WRITE;
/*!40000 ALTER TABLE `client` DISABLE KEYS */;
INSERT INTO `client` VALUES ('CL-001','Pierre','Andre','514-310-0000','325 Rue Gouin','a@a.com'),('CL-002','Nicolas','Edouard','514-310-0001','326 Rue Gouin','b@a.com'),('CL-003','Tremblay','Antoine','514-310-0002','327 Rue Gouin','c@a.com'),('CL-004','Harrison','Judith','514-310-0003','328 Rue Gouin','d@a.com'),('CL-005','Labranche','Ariette','514-310-0004','329 Rue Gouin','e@a.com'),('CL-006','Horks','Millien','514-310-0005','320 Rue Gouin','f@a.com'),('CL-007','Melody','Peterson','514-310-0006','321 Rue Gouin','g@a.com'),('CL-009','Bambooza','Nicoletta','514-245-0001','532 Boul Maisonneuve','lavitrine@hotmail.com'),('CL-010','Bamboo','Nicolette','514-000-0008','185 Boul Gouin','lavitrine@hotmail.com'),('CL-016','Macron','Micheline','450-859-9658','La Fougere canada','micheline@macron.com'),('CL-017','Don','Antonio','450-963-7896','26 La tourelle','don@antonio.com'),('CL-018','Don','Antonio','450-963-7896','26 La tourelle','don@antonio.com'),('CL-019','Lebos','Jannine','450-025-9635','2600 La souffleuse','jannine@lebos.com'),('CL-021','Fouad','Leila','514-963-7895','La ville','leila@fouad.com'),('CL-022','hhh','hhhh','hhhhh','hhh','hhhh');
/*!40000 ALTER TABLE `client` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `department` (
  `numDept` int(11) NOT NULL AUTO_INCREMENT,
  `nameDept` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`numDept`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nombreclient`
--

DROP TABLE IF EXISTS `nombreclient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nombreclient` (
  `nombre` int(11) NOT NULL,
  PRIMARY KEY (`nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nombreclient`
--

LOCK TABLES `nombreclient` WRITE;
/*!40000 ALTER TABLE `nombreclient` DISABLE KEYS */;
INSERT INTO `nombreclient` VALUES (22);
/*!40000 ALTER TABLE `nombreclient` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-08 16:43:29
