CREATE DATABASE  IF NOT EXISTS `pokedex` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `pokedex`;-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: pokedex
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.25-MariaDB

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
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pokemon_tipos`
--

LOCK TABLES `pokemon_tipos` WRITE;
/*!40000 ALTER TABLE `pokemon_tipos` DISABLE KEYS */;
INSERT INTO `pokemon_tipos` VALUES (1,1,5),(2,1,6),(3,2,5),(4,2,6),(5,3,5),(6,3,6),(7,4,1),(8,5,1),(9,6,1),(10,7,9),(11,8,9),(12,9,9),(13,10,11),(14,11,11),(15,12,2),(16,13,12),(17,14,12),(18,15,12);
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

-- Dump completed on 2017-12-11 11:04:19
