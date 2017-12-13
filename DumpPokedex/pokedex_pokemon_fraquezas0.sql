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
-- Table structure for table `pokemon_fraquezas`
--

DROP TABLE IF EXISTS `pokemon_fraquezas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pokemon_fraquezas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_pokemon` int(11) DEFAULT NULL,
  `id_tipo` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_pokemon_idx` (`id_pokemon`),
  KEY `id_tipo_idx` (`id_tipo`),
  CONSTRAINT `id_pokemon` FOREIGN KEY (`id_pokemon`) REFERENCES `pokemons` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `id_tipo` FOREIGN KEY (`id_tipo`) REFERENCES `tipos` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=179 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pokemon_fraquezas`
--

LOCK TABLES `pokemon_fraquezas` WRITE;
/*!40000 ALTER TABLE `pokemon_fraquezas` DISABLE KEYS */;
INSERT INTO `pokemon_fraquezas` VALUES (1,3,1),(2,3,2),(3,3,3),(4,3,4),(5,2,1),(6,2,2),(7,2,3),(8,2,4),(9,1,1),(10,1,2),(11,1,3),(12,1,4),(13,4,7),(14,4,8),(15,4,9),(16,5,7),(17,5,8),(18,5,9),(19,6,8),(20,6,10),(21,6,9),(22,7,10),(23,7,5),(24,8,10),(25,8,5),(26,9,10),(27,9,5),(28,10,1),(29,10,2),(30,10,8),(31,11,1),(32,11,2),(33,11,8),(34,12,8),(35,12,10),(36,12,1),(37,12,2),(38,12,3),(39,13,1),(40,13,2),(41,13,4),(42,13,8),(43,14,1),(44,14,2),(45,14,4),(46,14,8),(47,14,1),(48,15,1),(49,15,2),(50,15,4),(51,15,8),(52,16,10),(53,16,4),(54,16,8),(55,17,10),(56,17,4),(57,17,8),(58,18,10),(59,18,4),(60,18,8),(61,19,14),(62,20,14),(63,21,10),(64,21,3),(65,21,8),(66,22,10),(67,22,3),(68,22,8),(69,23,7),(70,23,4),(71,24,7),(72,24,4),(73,26,7),(74,26,4),(75,27,5),(76,27,3),(77,27,9),(78,28,5),(79,28,3),(80,28,9),(81,29,7),(82,29,4),(83,30,7),(84,30,4),(85,31,7),(86,31,3),(87,31,4),(88,31,9),(89,32,7),(90,32,4),(91,33,9),(92,33,7),(93,33,4),(94,34,7),(95,34,3),(96,34,4),(97,34,9),(98,35,15),(99,35,12),(100,36,15),(101,36,12),(102,37,7),(103,37,8),(104,37,9),(105,38,7),(106,38,8),(107,38,9),(108,39,15),(109,39,12),(110,40,15),(111,40,12),(112,41,10),(113,41,3),(114,41,4),(115,41,8),(116,42,3),(117,42,4),(118,42,8),(119,43,1),(120,43,2),(121,43,3),(122,43,4),(123,44,1),(124,44,2),(125,44,3),(126,44,4),(127,45,1),(128,45,2),(129,45,3),(130,45,4),(131,46,1),(132,46,2),(133,46,3),(134,46,12),(135,46,8),(136,47,1),(137,47,2),(138,47,3),(139,47,12),(140,47,8),(141,48,1),(142,48,2),(143,48,4),(144,48,8),(145,49,1),(146,49,2),(147,49,4),(148,49,8),(149,50,5),(150,50,3),(151,50,9),(152,51,5),(153,51,3),(154,51,9),(155,52,14),(156,53,14),(157,54,10),(158,54,5),(159,55,10),(160,55,5),(161,56,2),(162,56,4),(163,56,16),(164,57,2),(165,57,4),(166,57,16),(167,58,8),(168,58,5),(169,58,9),(170,59,8),(171,59,9),(172,59,5),(173,60,10),(174,60,5),(175,61,10),(176,61,5),(177,62,10),(178,62,5);
/*!40000 ALTER TABLE `pokemon_fraquezas` ENABLE KEYS */;
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
