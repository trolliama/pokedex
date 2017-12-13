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
-- Table structure for table `pokemons`
--

DROP TABLE IF EXISTS `pokemons`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pokemons` (
  `id` int(11) NOT NULL DEFAULT '0',
  `nome` varchar(15) NOT NULL,
  `vida` int(11) NOT NULL,
  `ataque` int(11) NOT NULL,
  `defesa` int(11) NOT NULL,
  `ataqueSp` int(11) DEFAULT NULL,
  `defesaSp` int(11) DEFAULT NULL,
  `velocidade` int(11) DEFAULT NULL,
  `id_evolucao` int(11) DEFAULT NULL,
  `descricao` text,
  `altura` float DEFAULT NULL,
  `peso` float DEFAULT NULL,
  `categoria` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pokemons`
--

LOCK TABLES `pokemons` WRITE;
/*!40000 ALTER TABLE `pokemons` DISABLE KEYS */;
INSERT INTO `pokemons` VALUES (1,'Bulbasaur',45,49,49,65,65,45,2,'Bulbasaur pode ser visto dormindo na luz do sol brilhante. Há uma semente nas costas. Ao absorver os raios do sol, a semente cresce progressivamente.',0.7,6.9,'grão'),(2,'Ivysaur',60,62,63,80,80,60,3,'Há um broto nas costas deste Pokémon. Para suportar seu peso, as pernas e o tronco do Ivysaur crescem grosso e forte. Se começar a passar mais tempo deitado à luz do sol, é um sinal de que o botão vai florescer em uma grande flor em breve.',1,13,'grão'),(3,'Venusaur',80,82,83,100,100,80,NULL,'Há uma grande flor nas costas do Venusaur. Diz-se que a flor assume cores vivas se receber muita nutrição e luz solar. O aroma da flor acalma as emoções das pessoas.',2,100,'grão'),(4,'Charmander',39,52,43,60,50,65,5,'A chama que queima na ponta da cauda é uma indicação de suas emoções. A flama muda quando Charmander está se divertindo. Se o Pokémon se enfurecer, a chama arderá ferozmente.',0.6,8.5,'largato'),(5,'Charmeleon',58,64,58,80,65,80,6,'Charmeleon destrui implacavelmente seus inimigos usando suas garras afiadas. Se encontrar um forte inimigo, ele se torna agressivo. Neste estado excitado, a chama na ponta da cauda se acende com uma cor branca azulada.',1.1,19,'chama'),(6,'Charizard',78,84,78,109,85,100,NULL,'Charizard voa ao redor do céu em busca de adversários poderosos. Ele respira fogo de tão grande calor que derrete qualquer coisa. No entanto, nunca faz sua respiração ardente em qualquer oponente mais fraco do que ele.',1.7,90.5,'chama'),(7,'Squirtle',44,48,65,50,64,43,8,'A casca de Squirtle não é apenas usada para proteção. A forma arredondada da concha e os sulcos em sua superfície ajudam a minimizar a resistência na água, permitindo que este Pokémon nade a altas velocidades.',0.5,9,'tartaruga minúscula'),(8,'Wartortle',59,63,80,65,80,58,9,'Sua cauda é grande e coberta com uma pele rica e grossa. A cauda se torna cada vez mais profunda à medida que Wartortle envelhece. Os arranhões em sua concha são evidências da resistência deste Pokémon como um lutador.',1,22.5,'tartaruga'),(9,'Blastoise',79,83,100,85,105,78,NULL,'Blastoise tem gotas de água que se sobressaem de sua concha. As gotas de água são muito precisas. Eles podem disparar balas de água com precisão suficiente para bater latas vazias a uma distância de mais de 160 pés.',1.6,85.5,'marisco'),(10,'Caterpie',45,30,35,20,20,45,11,'Caterpie tem um apetite voraz. Pode devorar folhas maiores do que o seu corpo bem antes dos seus olhos. A partir de sua antena, este Pokémon libera um odor fortemente forte.',0.3,2.9,'minhoca'),(11,'Metapod',50,20,55,25,25,30,12,'A concha que cobre o corpo deste Pokémon é tão dura como uma laje de ferro. Metapod não se move muito. Ele permanece imóvel porque está preparando suas entranhas macias para a evolução dentro da concha dura.',0.7,9.9,'casulo'),(12,'Butterfree',60,45,50,90,80,70,NULL,'Butterfree tem uma habilidade superior de procurar o delicioso mel das flores. Pode mesmo procurar, extrair e transportar mel de flores que florescem a mais de seis milhas de seu ninho.',1.1,3.2,'borboleta'),(13,'Weedle',40,35,30,20,20,50,14,'Weedle tem um sentido do cheiro extremamente agudo. É capaz de distinguir os seus tipos favoritos de folhas daqueles que não gosta apenas de cheirar com a sua grande proboscis vermelha (nariz).',0.3,3.2,'minhoca peluda'),(14,'Kakuna',45,25,50,25,25,35,15,'Kakuna permanece praticamente imóvel enquanto se apega a uma árvore. No entanto, por dentro, é extremamente ocupado, pois se prepara para a próxima evolução. Isso é evidente por quão quente a concha se torna ao toque.',0.6,10,'casulo'),(15,'Beedrill',65,90,40,45,80,75,NULL,'Beedrill é extremamente territorial. Ninguém deve se aproximar do seu ninho - isso é para sua própria segurança. Se estiverem irritados, atacarão em um enxame furioso.',1,29.5,'abelha venenosa');
/*!40000 ALTER TABLE `pokemons` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-11 11:04:21
