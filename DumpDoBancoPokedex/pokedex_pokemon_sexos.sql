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
) ENGINE=InnoDB AUTO_INCREMENT=254 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pokemon_sexos`
--

LOCK TABLES `pokemon_sexos` WRITE;
/*!40000 ALTER TABLE `pokemon_sexos` DISABLE KEYS */;
INSERT INTO `pokemon_sexos` VALUES (1,1,1),(2,1,2),(3,2,1),(4,2,2),(5,3,1),(6,3,2),(7,4,1),(8,4,2),(9,5,1),(10,5,2),(11,6,1),(12,6,2),(13,7,1),(14,7,2),(15,8,1),(16,8,2),(17,9,1),(18,9,2),(19,10,1),(20,10,2),(21,11,1),(22,11,2),(23,12,1),(24,12,2),(25,13,1),(26,13,2),(27,14,1),(28,14,2),(29,15,1),(30,15,2),(31,16,1),(32,16,2),(33,17,1),(34,17,2),(35,18,1),(36,18,2),(37,19,1),(38,19,2),(39,20,1),(40,20,2),(41,21,1),(42,21,2),(43,22,1),(44,22,2),(45,23,1),(46,23,2),(47,24,1),(48,24,2),(49,25,1),(50,25,2),(51,26,1),(52,26,2),(53,27,1),(54,27,2),(55,28,1),(56,28,2),(57,29,2),(58,30,2),(59,31,2),(60,32,1),(61,33,1),(62,34,1),(63,35,1),(64,35,2),(65,36,1),(66,36,2),(67,37,1),(68,37,2),(69,38,1),(70,38,2),(71,39,1),(72,39,2),(73,40,1),(74,40,2),(75,41,1),(76,41,2),(77,42,1),(78,42,2),(79,43,1),(80,43,2),(81,44,1),(82,44,2),(83,45,1),(84,45,2),(85,46,1),(86,45,2),(87,46,1),(88,46,2),(89,47,1),(90,47,2),(91,48,1),(92,48,2),(93,49,1),(94,49,2),(95,50,1),(96,50,2),(97,51,1),(98,51,2),(99,52,1),(100,52,2),(101,53,1),(102,53,2),(103,54,1),(104,54,2),(105,55,1),(106,55,2),(107,56,1),(108,56,2),(109,57,1),(110,57,2),(111,58,1),(112,58,2),(113,59,1),(114,59,2),(115,60,1),(116,60,2),(117,61,1),(118,61,2),(119,62,1),(120,62,2),(121,63,1),(122,63,2),(123,64,1),(124,64,2),(125,65,1),(126,65,2),(127,66,1),(128,66,2),(129,67,1),(130,67,2),(131,68,1),(132,68,2),(133,69,1),(134,69,2),(135,70,1),(136,70,2),(167,71,1),(168,71,2),(169,72,1),(170,72,2),(171,73,1),(172,73,2),(173,74,1),(174,74,2),(175,75,1),(176,75,2),(177,76,1),(178,76,2),(179,77,1),(180,77,2),(181,78,1),(182,78,2),(183,79,1),(184,79,2),(185,80,1),(186,80,2),(187,81,1),(188,81,2),(189,82,1),(190,82,2),(191,83,1),(192,83,2),(193,84,1),(194,84,2),(195,85,1),(196,85,2),(197,86,1),(198,86,2),(199,87,1),(200,87,2),(201,88,1),(202,88,2),(203,89,1),(204,89,2),(205,90,1),(206,90,2),(207,91,1),(208,91,2),(209,92,1),(210,92,2),(211,93,1),(212,93,2),(213,94,1),(241,94,2),(242,95,1),(243,95,2),(244,96,1),(245,96,2),(246,97,1),(247,97,2),(248,98,1),(249,98,2),(250,99,1),(251,99,2),(252,100,1),(253,100,2);
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

-- Dump completed on 2017-12-19 20:17:16
