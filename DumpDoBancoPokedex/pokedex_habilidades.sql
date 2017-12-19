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
-- Table structure for table `habilidades`
--

DROP TABLE IF EXISTS `habilidades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `habilidades` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome_habilidade` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `habilidades`
--

LOCK TABLES `habilidades` WRITE;
/*!40000 ALTER TABLE `habilidades` DISABLE KEYS */;
INSERT INTO `habilidades` VALUES (1,'Crescimento extenso'),(2,'Chama'),(3,'Torrente'),(4,'Escudo de Pó'),(5,'Pele Coberta'),(6,'Olhos Compostos'),(7,'Enxame'),(8,'Pés Emaranhado'),(9,'Olhos do Interesse'),(10,'Fugir'),(11,'Culhões'),(12,'Pele Coberta'),(13,'Intimidar'),(14,'Estatico'),(15,'Véu de Areia'),(16,'Veneno'),(17,'Rivalidade'),(18,'Charme Bonito'),(19,'Guarda Magico'),(20,'Fogo Instantâneo'),(21,'Competitivo'),(22,'Foco Interior'),(23,'Clorofila'),(24,'Pele Seca'),(25,'Esporo de Efeito'),(26,'Lente Matizada'),(27,'Pegar'),(28,'Tecnico'),(29,'Úmido'),(30,'Nona Nuvem'),(31,'Espirito Vital'),(32,'Ponto de Raiva'),(33,'Intimidar'),(34,'Absorvente de Agua'),(35,'Foco Interior'),(36,'Sincronizar'),(37,'Culhões'),(38,'Sem Guarda'),(39,'Corpo Claro'),(40,'Liquido Escorregadio'),(41,'Cabeçada de Pedra'),(42,'Robusto'),(43,'Desatento'),(44,'Um Tempo'),(45,'Robusto'),(46,'Pull de Imã'),(47,'Madrugar'),(48,'Gordura Grossa'),(49,'Fedor'),(50,'Leveza'),(51,'Insonia'),(52,'Imune a Som');
/*!40000 ALTER TABLE `habilidades` ENABLE KEYS */;
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
