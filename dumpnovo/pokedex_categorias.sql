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
-- Table structure for table `categorias`
--

DROP TABLE IF EXISTS `categorias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `categorias` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `categoria` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorias`
--

LOCK TABLES `categorias` WRITE;
/*!40000 ALTER TABLE `categorias` DISABLE KEYS */;
INSERT INTO `categorias` VALUES (1,'grão'),(2,'largato'),(3,'chama'),(4,'tartaruga pequena'),(5,'tartaruga'),(6,'marisco'),(7,'minhoca'),(8,'casulo'),(9,'borboleta'),(10,'minhoca peluda'),(11,'abelha venenosa'),(12,'passaro pequeno'),(13,'passaro'),(14,'rato'),(15,'cobra'),(16,'pino venenoso'),(17,'broca'),(18,'fada'),(19,'raposa'),(20,'balão'),(21,'morcego'),(22,'erva daninha'),(23,'flor'),(24,'cogumelo'),(25,'inseto'),(26,'mariposa venenosa'),(27,'toupeira'),(28,'gato pequeno'),(29,'gato classico'),(30,'pato'),(31,'porco macaco'),(32,'cachorro'),(33,'lendario'),(34,'girino'),(35,'psi'),(36,'poderoso'),(37,'apanhador de moscas'),(38,'medusa'),(39,'pedra'),(40,'super pedra'),(41,'cavalo de fogo'),(42,'Dopey'),(43,'Carangueijo hermitão'),(44,'magnetico'),(45,'pato selvagem'),(46,'passaro estranho'),(47,'leão marinho'),(48,'gosma'),(49,'concha'),(50,'gás'),(51,'fantasma'),(52,'cobra de pedra'),(53,'hipnotico'),(54,'caraguejo'),(55,'bola');
/*!40000 ALTER TABLE `categorias` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-27 11:24:30
