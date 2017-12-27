CREATE DATABASE  IF NOT EXISTS `pokedex` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `pokedex`;
-- MySQL dump 10.13  Distrib 5.5.58, for debian-linux-gnu (x86_64)
--
-- Host: 127.0.0.1    Database: pokedex
-- ------------------------------------------------------
-- Server version	5.5.58-0+deb8u1

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
-- Table structure for table `pokemon_tipos`
--

DROP TABLE IF EXISTS `pokemon_tipos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pokemon_tipos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_pokemon` int(11) DEFAULT NULL,
  `id_tipo` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `pokemon_tipos_ibfk_2` (`id_tipo`),
  KEY `pokemon_tipos_ibfk_1` (`id_pokemon`),
  CONSTRAINT `pokemon_tipos_ibfk_1` FOREIGN KEY (`id_pokemon`) REFERENCES `pokemons` (`id`),
  CONSTRAINT `pokemon_tipos_ibfk_2` FOREIGN KEY (`id_tipo`) REFERENCES `tipos` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=131 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pokemon_tipos`
--

LOCK TABLES `pokemon_tipos` WRITE;
/*!40000 ALTER TABLE `pokemon_tipos` DISABLE KEYS */;
INSERT INTO `pokemon_tipos` VALUES (1,1,5),(2,1,6),(3,2,5),(4,2,6),(5,3,5),(6,3,6),(7,4,1),(8,5,1),(9,6,1),(13,7,9),(14,8,9),(15,9,9),(16,10,11),(17,11,11),(18,12,11),(19,13,12),(20,14,12),(21,15,12),(22,16,2),(23,17,2),(24,18,2),(25,19,13),(26,20,13),(27,21,2),(28,22,2),(29,23,12),(30,24,12),(31,25,10),(32,26,10),(33,27,7),(34,28,7),(35,29,12),(36,30,12),(37,31,12),(38,31,7),(39,32,12),(40,33,12),(41,34,12),(42,34,7),(43,35,16),(44,36,16),(45,37,2),(46,38,2),(47,39,16),(48,40,16),(49,41,2),(50,41,12),(51,42,12),(52,42,2),(53,43,5),(54,43,12),(55,44,5),(56,44,12),(57,45,5),(58,45,12),(59,46,5),(60,47,5),(61,48,12),(62,49,12),(63,50,7),(64,51,7),(65,52,13),(66,53,13),(67,54,9),(68,55,9),(69,56,14),(70,57,14),(71,58,1),(72,59,1),(73,60,9),(74,61,9),(75,62,9),(76,63,4),(77,64,4),(78,65,4),(79,66,14),(80,67,14),(81,68,14),(82,69,11),(83,69,12),(84,70,11),(85,70,12),(86,71,11),(87,71,12),(88,72,9),(89,72,12),(90,73,9),(91,73,12),(92,74,8),(93,74,7),(94,75,8),(95,75,7),(96,76,8),(97,76,7),(98,77,1),(99,78,1),(100,79,9),(101,79,4),(102,80,9),(103,80,4),(104,81,10),(105,81,15),(106,82,10),(107,82,15),(108,83,13),(109,83,2),(110,84,2),(111,85,2),(112,86,9),(113,87,9),(114,88,12),(115,89,12),(116,90,9),(117,91,9),(118,92,18),(119,92,6),(120,93,18),(121,93,6),(122,94,18),(123,94,6),(124,95,8),(125,95,7),(126,96,4),(127,97,4),(128,98,9),(129,99,9),(130,100,10);
/*!40000 ALTER TABLE `pokemon_tipos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-27  0:58:51
