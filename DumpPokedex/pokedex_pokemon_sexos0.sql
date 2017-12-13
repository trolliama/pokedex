CREATE DATABASE  IF NOT EXISTS `pokedex` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `pokedex`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: pokedex
-- ------------------------------------------------------
-- Server version	5.7.19

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
-- Table structure for table `pokemon_sexos`
--

DROP TABLE IF EXISTS `pokemon_sexos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pokemon_sexos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_pokemon` int(11) DEFAULT NULL,
  `id_sexo` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_pokemon` (`id_pokemon`),
  KEY `id_sexo` (`id_sexo`),
  CONSTRAINT `pokemon_sexos_ibfk_1` FOREIGN KEY (`id_pokemon`) REFERENCES `pokemons` (`id`),
  CONSTRAINT `pokemon_sexos_ibfk_2` FOREIGN KEY (`id_sexo`) REFERENCES `sexos` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=121 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pokemon_sexos`
--

LOCK TABLES `pokemon_sexos` WRITE;
/*!40000 ALTER TABLE `pokemon_sexos` DISABLE KEYS */;
INSERT INTO `pokemon_sexos` VALUES (1,1,1),(2,1,2),(3,2,1),(4,2,2),(5,3,1),(6,3,2),(7,4,1),(8,4,2),(9,5,1),(10,5,2),(11,6,1),(12,6,2),(13,7,1),(14,7,2),(15,8,1),(16,8,2),(17,9,1),(18,9,2),(19,10,1),(20,10,2),(21,11,1),(22,11,2),(23,12,1),(24,12,2),(25,13,1),(26,13,2),(27,14,1),(28,14,2),(29,15,1),(30,15,2),(31,16,1),(32,16,2),(33,17,1),(34,17,2),(35,18,1),(36,18,2),(37,19,1),(38,19,2),(39,20,1),(40,20,2),(41,21,1),(42,21,2),(43,22,1),(44,22,2),(45,23,1),(46,23,2),(47,24,1),(48,24,2),(49,25,1),(50,25,2),(51,26,1),(52,26,2),(53,27,1),(54,27,2),(55,28,1),(56,28,2),(57,29,2),(58,30,2),(59,31,2),(60,32,1),(61,33,1),(62,34,1),(63,35,1),(64,35,2),(65,36,1),(66,36,2),(67,37,1),(68,37,2),(69,38,1),(70,38,2),(71,39,1),(72,39,2),(73,40,1),(74,40,2),(75,41,1),(76,41,2),(77,42,1),(78,42,2),(79,43,1),(80,43,2),(81,44,1),(82,44,2),(83,45,1),(84,45,2),(85,46,1),(86,45,2),(87,46,1),(88,46,2),(89,47,1),(90,47,2),(91,48,1),(92,48,2),(93,49,1),(94,49,2),(95,50,1),(96,50,2),(97,51,1),(98,51,2),(99,52,1),(100,52,2),(101,53,1),(102,53,2),(103,54,1),(104,54,2),(105,55,1),(106,55,2),(107,56,1),(108,56,2),(109,57,1),(110,57,2),(111,58,1),(112,58,2),(113,59,1),(114,59,2),(115,60,1),(116,60,2),(117,61,1),(118,61,2),(119,62,1),(120,62,2);
/*!40000 ALTER TABLE `pokemon_sexos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-11 23:57:36
