-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
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
-- Table structure for table `pokemon_habilidades`
--

DROP TABLE IF EXISTS `pokemon_habilidades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pokemon_habilidades` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_pokemon` int(11) DEFAULT NULL,
  `id_habilidade` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_pokemon` (`id_pokemon`),
  KEY `pokemon_habilidades_ibfk_2` (`id_habilidade`),
  CONSTRAINT `pokemon_habilidades_ibfk_1` FOREIGN KEY (`id_pokemon`) REFERENCES `pokemons` (`id`),
  CONSTRAINT `pokemon_habilidades_ibfk_2` FOREIGN KEY (`id_habilidade`) REFERENCES `habilidades` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=154 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pokemon_habilidades`
--

LOCK TABLES `pokemon_habilidades` WRITE;
/*!40000 ALTER TABLE `pokemon_habilidades` DISABLE KEYS */;
INSERT INTO `pokemon_habilidades` VALUES (1,1,1),(2,2,1),(3,3,1),(4,4,2),(5,5,2),(6,6,2),(7,7,3),(8,8,3),(9,9,3),(10,10,4),(11,11,5),(12,12,6),(13,13,4),(14,14,5),(15,15,7),(16,16,8),(17,16,9),(18,17,8),(19,17,9),(20,18,8),(21,18,9),(22,19,10),(23,19,11),(24,20,10),(25,20,11),(26,21,9),(27,22,9),(28,23,5),(29,23,13),(30,24,5),(31,24,13),(32,25,14),(33,26,14),(34,27,15),(35,28,15),(36,29,16),(37,29,17),(38,30,16),(39,30,17),(40,31,16),(41,31,17),(42,32,16),(43,32,17),(44,33,16),(45,33,17),(46,34,16),(47,34,17),(48,35,18),(49,35,19),(50,36,18),(51,36,19),(52,37,20),(53,38,20),(54,39,18),(55,39,19),(56,40,19),(57,40,20),(58,41,21),(59,42,21),(60,43,22),(61,44,22),(62,45,22),(63,46,23),(64,46,24),(65,47,23),(66,47,24),(67,48,6),(68,48,25),(69,49,4),(70,49,25),(71,50,4),(72,51,4),(73,52,26),(74,52,27),(75,53,26),(76,53,27),(77,54,28),(78,54,29),(79,55,29),(80,55,30),(81,56,31),(82,56,32),(83,57,31),(84,57,32),(85,58,20),(86,58,33),(87,59,33),(88,59,20),(89,60,29),(90,60,34),(91,61,29),(92,61,34),(93,62,29),(94,62,34),(95,63,35),(96,63,36),(97,64,35),(98,64,36),(99,65,35),(100,65,36),(101,66,37),(102,66,38),(103,67,37),(104,67,38),(105,68,37),(106,68,38),(107,69,23),(108,70,37),(109,70,38),(110,70,23),(111,71,37),(112,71,38),(113,71,23),(114,72,39),(115,72,40),(116,73,39),(117,73,40),(118,74,39),(119,74,40),(120,75,39),(121,75,40),(122,76,39),(123,76,40),(124,77,10),(125,77,20),(126,78,10),(127,78,20),(128,79,43),(129,79,44),(130,80,43),(131,80,44),(132,81,45),(133,81,46),(134,82,45),(135,82,46),(136,83,22),(137,84,47),(138,85,47),(139,86,48),(140,87,48),(141,88,49),(142,89,49),(143,90,12),(144,91,12),(145,92,12),(146,93,12),(147,94,50),(148,95,45),(149,96,51),(150,97,51),(151,98,42),(152,99,42),(153,100,52);
/*!40000 ALTER TABLE `pokemon_habilidades` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-27 11:24:31
