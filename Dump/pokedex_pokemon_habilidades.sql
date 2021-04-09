-- MySQL dump 10.13  Distrib 5.7.18, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: pokedex
-- ------------------------------------------------------
-- Server version	5.7.18-1

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
) ENGINE=InnoDB AUTO_INCREMENT=1231 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pokemon_habilidades`
--

LOCK TABLES `pokemon_habilidades` WRITE;
/*!40000 ALTER TABLE `pokemon_habilidades` DISABLE KEYS */;
INSERT INTO `pokemon_habilidades` VALUES (1,1,125),(2,2,125),(3,3,125),(4,4,18),(5,5,18),(6,6,18),(7,7,211),(8,8,211),(9,9,211),(10,10,170),(11,11,167),(12,12,27),(13,13,170),(14,14,167),(15,15,199),(16,16,92),(17,16,204),(18,17,92),(19,17,204),(20,18,92),(21,18,204),(22,19,156),(23,19,69),(24,20,156),(25,20,69),(26,21,92),(27,22,92),(28,23,167),(29,23,88),(30,24,167),(31,24,88),(32,25,188),(33,26,188),(34,27,160),(35,28,160),(36,29,133),(37,29,152),(38,30,133),(39,30,152),(40,31,133),(41,31,152),(42,32,133),(43,32,152),(44,33,133),(45,33,152),(46,34,133),(47,34,152),(48,35,31),(49,35,103),(50,36,31),(51,36,103),(52,37,53),(53,38,53),(54,39,31),(55,39,26),(56,40,31),(57,40,26),(58,41,86),(59,42,86),(60,43,21),(61,44,21),(62,45,21),(63,46,46),(64,46,44),(65,47,46),(66,47,44),(67,48,27),(68,48,210),(69,49,170),(70,49,210),(71,50,160),(72,50,8),(73,51,160),(74,51,8),(75,52,129),(76,52,206),(77,53,206),(78,53,98),(79,54,32),(80,54,23),(81,55,32),(82,55,23),(83,56,222),(84,56,6),(85,57,222),(86,57,6),(87,58,88),(88,58,53),(89,59,88),(90,59,53),(91,60,32),(92,60,224),(93,61,32),(94,61,224),(95,62,32),(96,62,224),(97,63,86),(98,63,203),(99,64,86),(100,64,203),(101,65,86),(102,65,203),(103,66,69),(104,66,121),(105,67,69),(106,67,121),(107,68,69),(108,68,121),(109,69,21),(110,70,21),(111,71,21),(112,72,22),(113,72,99),(114,73,22),(115,73,99),(116,74,154),(117,74,195),(118,75,154),(119,75,195),(120,76,154),(121,76,195),(122,77,156),(123,77,53),(124,78,156),(125,78,53),(126,79,123),(127,79,126),(128,80,123),(129,80,126),(130,81,195),(131,81,106),(132,82,195),(133,82,106),(134,83,92),(135,83,86),(136,84,156),(137,84,45),(138,85,156),(139,85,45),(140,86,209),(141,86,77),(142,87,209),(143,87,77),(144,88,191),(145,88,192),(146,89,191),(147,89,192),(148,90,169),(149,90,173),(150,91,169),(151,91,173),(152,92,95),(153,93,95),(154,94,95),(155,95,154),(156,95,195),(157,96,87),(158,96,58),(159,97,87),(160,97,58),(161,98,169),(162,98,78),(163,99,169),(164,99,78),(165,100,188),(166,100,182),(167,101,188),(168,101,182),(169,102,21),(170,103,21),(171,104,154),(172,104,97),(173,105,154),(174,105,97),(175,106,98),(176,106,149),(177,107,92),(178,107,90),(179,108,123),(180,108,126),(181,109,95),(182,110,95),(183,111,154),(184,111,97),(185,112,154),(186,112,97),(187,113,119),(188,113,164),(189,114,21),(190,114,94),(191,115,45),(192,115,163),(193,116,201),(194,116,176),(195,117,133),(196,117,176),(197,118,201),(198,118,227),(199,119,201),(200,119,227),(201,120,119),(202,120,80),(203,121,119),(204,121,80),(205,122,182),(206,122,50),(207,123,199),(208,123,206),(209,124,123),(210,124,58),(211,125,188),(212,126,51),(213,127,78),(214,127,112),(215,128,88),(216,128,6),(217,129,201),(218,130,88),(219,131,224),(220,131,169),(221,132,98),(222,133,156),(223,133,1),(224,134,224),(225,135,223),(226,136,53),(227,137,214),(228,137,41),(229,138,169),(230,138,201),(231,139,169),(232,139,201),(233,140,201),(234,140,13),(235,141,201),(236,141,13),(237,142,154),(238,142,138),(239,143,209),(240,143,82),(241,144,138),(242,145,138),(243,146,138),(244,147,167),(245,148,167),(246,149,86),(247,150,138),(248,151,203),(249,152,125),(250,153,125),(251,154,125),(252,155,18),(253,156,18),(254,157,18),(255,158,211),(256,159,211),(257,160,211),(258,161,92),(259,161,156),(260,162,92),(261,162,156),(262,163,92),(263,163,87),(264,164,92),(265,164,87),(266,165,199),(267,165,45),(268,166,199),(269,166,45),(270,167,199),(271,167,87),(272,168,199),(273,168,87),(274,169,86),(275,170,80),(276,170,223),(277,171,80),(278,171,223),(279,172,188),(280,173,31),(281,173,103),(282,174,31),(283,174,26),(284,175,164),(285,175,76),(286,176,164),(287,176,76),(288,177,203),(289,177,45),(290,178,203),(291,178,45),(292,179,188),(293,180,188),(294,181,188),(295,182,21),(296,183,209),(297,183,75),(298,184,209),(299,184,75),(300,185,154),(301,185,195),(302,186,32),(303,186,224),(304,187,21),(305,187,94),(306,188,21),(307,188,94),(308,189,21),(309,189,94),(310,190,156),(311,190,129),(312,191,21),(313,191,179),(314,192,21),(315,192,179),(316,193,27),(317,193,183),(318,194,32),(319,194,224),(320,195,32),(321,195,224),(322,196,203),(323,197,203),(324,198,87),(325,198,197),(326,199,123),(327,199,126),(328,200,95),(329,201,95),(330,202,166),(331,203,86),(332,203,45),(333,204,195),(334,205,195),(335,206,156),(336,206,164),(337,207,160),(338,207,78),(339,208,154),(340,208,195),(341,209,156),(342,209,88),(343,210,88),(344,210,145),(345,211,133),(346,211,201),(347,212,199),(348,212,206),(349,213,195),(350,213,65),(351,214,199),(352,214,69),(353,215,92),(354,215,86),(355,216,129),(356,216,145),(357,217,69),(358,217,145),(359,218,51),(360,218,105),(361,219,51),(362,219,105),(363,220,123),(364,220,177),(365,221,123),(366,221,177),(367,222,119),(368,222,76),(369,223,176),(370,223,76),(371,224,176),(372,224,196),(373,225,222),(374,225,76),(375,226,224),(376,226,201),(377,227,92),(378,227,195),(379,228,53),(380,228,45),(381,229,53),(382,229,45),(383,230,201),(384,230,176),(385,231,129),(386,232,195),(387,233,214),(388,233,41),(389,234,88),(390,234,60),(391,235,206),(392,235,126),(393,236,69),(394,236,189),(395,237,88),(396,237,206),(397,238,123),(398,238,58),(399,239,188),(400,240,51),(401,241,209),(402,241,163),(403,242,119),(404,242,164),(405,243,138),(406,244,138),(407,245,138),(408,246,69),(409,247,167),(410,248,159),(411,249,138),(412,250,138),(413,251,119),(414,252,125),(415,253,125),(416,254,125),(417,255,18),(418,256,18),(419,257,18),(420,258,211),(421,259,211),(422,260,211),(423,261,156),(424,261,145),(425,262,88),(426,262,145),(427,263,129),(428,263,65),(429,264,129),(430,264,65),(431,265,170),(432,266,167),(433,267,199),(434,268,167),(435,269,170),(436,270,201),(437,270,146),(438,271,201),(439,271,146),(440,272,201),(441,272,146),(442,273,21),(443,273,45),(444,274,21),(445,274,45),(446,275,21),(447,275,45),(448,276,69),(449,277,69),(450,278,92),(451,279,92),(452,280,203),(453,280,214),(454,281,203),(455,281,214),(456,282,203),(457,282,214),(458,283,201),(459,284,88),(460,285,46),(461,285,132),(462,286,46),(463,286,132),(464,287,216),(465,288,222),(466,289,216),(467,290,27),(468,291,183),(469,292,231),(470,293,182),(471,294,182),(472,295,182),(473,296,69),(474,296,209),(475,297,69),(476,297,209),(477,298,209),(478,298,75),(479,299,195),(480,299,106),(481,300,31),(482,300,122),(483,301,31),(484,301,122),(485,302,92),(486,302,185),(487,303,88),(488,303,78),(489,304,154),(490,304,195),(491,305,154),(492,305,195),(493,306,154),(494,306,195),(495,307,143),(496,308,143),(497,309,188),(498,309,97),(499,310,188),(500,310,97),(501,311,131),(502,312,110),(503,313,199),(504,313,80),(505,314,210),(506,314,123),(507,315,133),(508,315,119),(509,316,99),(510,316,192),(511,317,99),(512,317,192),(513,318,155),(514,319,155),(515,320,123),(516,320,227),(517,321,123),(518,321,227),(519,322,123),(520,322,172),(521,323,105),(522,323,180),(523,324,229),(524,325,126),(525,325,209),(526,326,126),(527,326,209),(528,327,204),(529,327,126),(530,328,8),(531,328,78),(532,329,95),(533,330,95),(534,331,160),(535,332,160),(536,333,119),(537,334,119),(538,335,82),(539,336,167),(540,337,95),(541,338,95),(542,339,123),(543,339,7),(544,340,123),(545,340,7),(546,341,169),(547,341,78),(548,342,169),(549,342,78),(550,343,95),(551,344,95),(552,345,196),(553,346,196),(554,347,13),(555,348,13),(556,349,123),(557,349,201),(558,350,107),(559,350,26),(560,351,57),(561,352,24),(562,353,87),(563,353,60),(564,354,87),(565,354,60),(566,355,95),(567,356,138),(568,357,21),(569,357,179),(570,358,95),(571,359,138),(572,359,197),(573,360,166),(574,361,86),(575,361,79),(576,362,86),(577,362,79),(578,363,209),(579,363,79),(580,364,209),(581,364,79),(582,365,209),(583,365,79),(584,366,169),(585,367,201),(586,368,201),(587,369,154),(588,369,201),(589,370,201),(590,371,154),(591,372,154),(592,373,88),(593,374,22),(594,375,22),(595,376,22),(596,377,22),(597,378,22),(598,379,22),(599,380,95),(600,381,95),(601,382,42),(602,383,43),(603,384,4),(604,385,164),(605,386,138),(606,387,125),(607,388,125),(608,389,125),(609,390,18),(610,391,18),(611,392,18),(612,393,211),(613,394,211),(614,395,211),(615,396,92),(616,397,88),(617,398,88),(618,399,172),(619,399,218),(620,400,172),(621,400,218),(622,401,167),(623,402,199),(624,403,88),(625,403,152),(626,404,88),(627,404,152),(628,405,88),(629,405,152),(630,406,133),(631,406,119),(632,407,133),(633,407,119),(634,408,112),(635,409,112),(636,410,195),(637,411,195),(638,412,167),(639,413,7),(640,414,199),(641,415,74),(642,416,138),(643,417,156),(644,417,129),(645,418,201),(646,419,201),(647,420,21),(648,421,54),(649,422,192),(650,422,193),(651,423,192),(652,423,193),(653,424,129),(654,424,206),(655,425,3),(656,425,219),(657,426,3),(658,426,219),(659,427,156),(660,427,93),(661,428,31),(662,428,93),(663,429,95),(664,430,87),(665,430,197),(666,431,98),(667,431,126),(668,432,126),(669,432,209),(670,433,95),(671,434,191),(672,434,3),(673,435,191),(674,435,3),(675,436,95),(676,436,72),(677,437,95),(678,437,72),(679,438,154),(680,438,195),(681,439,182),(682,439,50),(683,440,119),(684,440,164),(685,441,92),(686,441,204),(687,442,138),(688,443,160),(689,444,160),(690,445,160),(691,446,129),(692,446,209),(693,447,86),(694,447,189),(695,448,86),(696,448,189),(697,449,159),(698,450,159),(699,451,176),(700,451,13),(701,452,176),(702,452,13),(703,453,44),(704,453,7),(705,454,44),(706,454,7),(707,455,95),(708,456,201),(709,456,193),(710,457,201),(711,457,193),(712,458,224),(713,458,201),(714,459,178),(715,460,178),(716,461,138),(717,462,195),(718,462,106),(719,463,123),(720,463,126),(721,464,97),(722,464,180),(723,465,21),(724,465,94),(725,466,114),(726,467,51),(727,468,164),(728,468,76),(729,469,210),(730,469,183),(731,470,94),(732,471,177),(733,472,160),(734,472,78),(735,473,123),(736,473,177),(737,474,1),(738,474,41),(739,475,189),(740,476,195),(741,476,106),(742,477,138),(743,478,177),(744,479,95),(745,480,95),(746,481,95),(747,482,95),(748,483,138),(749,484,138),(750,485,53),(751,486,174),(752,487,138),(753,488,95),(754,489,77),(755,490,77),(756,491,11),(757,492,119),(758,493,117),(759,494,221),(760,495,125),(761,496,125),(762,497,125),(763,498,18),(764,499,18),(765,500,18),(766,501,211),(767,502,211),(768,503,211),(769,504,92),(770,504,156),(771,505,92),(772,505,80),(773,506,129),(774,506,222),(775,507,88),(776,507,158),(777,508,88),(778,508,158),(779,509,98),(780,509,219),(781,510,98),(782,510,219),(783,511,65),(784,512,65),(785,513,65),(786,514,65),(787,515,65),(788,516,65),(789,517,203),(790,517,58),(791,518,203),(792,518,58),(793,519,197),(794,519,17),(795,520,197),(796,520,17),(797,521,197),(798,521,17),(799,522,97),(800,522,114),(801,523,97),(802,523,114),(803,524,195),(804,525,195),(805,526,195),(806,527,218),(807,527,93),(808,528,218),(809,528,93),(810,529,158),(811,529,157),(812,530,158),(813,530,157),(814,531,71),(815,531,151),(816,532,69),(817,532,168),(818,533,69),(819,533,168),(820,534,69),(821,534,168),(822,535,77),(823,535,201),(824,536,77),(825,536,201),(826,537,201),(827,537,134),(828,538,69),(829,538,86),(830,539,86),(831,539,195),(832,540,199),(833,540,21),(834,541,21),(835,541,94),(836,542,199),(837,542,21),(838,543,199),(839,543,133),(840,544,199),(841,544,133),(842,545,199),(843,545,133),(844,546,137),(845,546,84),(846,547,137),(847,547,84),(848,548,21),(849,548,126),(850,549,21),(851,549,126),(852,550,149),(853,550,1),(854,551,88),(855,551,115),(856,552,88),(857,552,115),(858,553,88),(859,553,115),(860,554,76),(861,555,168),(862,556,21),(863,556,224),(864,557,195),(865,557,169),(866,558,195),(867,558,169),(868,559,167),(869,559,115),(870,560,167),(871,560,115),(872,561,103),(873,561,232),(874,562,118),(875,563,118),(876,564,195),(877,564,180),(878,565,195),(879,565,180),(880,566,36),(881,567,36),(882,568,191),(883,568,192),(884,569,191),(885,569,228),(886,570,81),(887,571,81),(888,572,31),(889,572,206),(890,573,31),(891,573,206),(892,574,60),(893,574,26),(894,575,60),(895,575,26),(896,576,60),(897,576,26),(898,577,103),(899,577,124),(900,578,103),(901,578,124),(902,579,103),(903,579,124),(904,580,92),(905,580,17),(906,581,92),(907,581,17),(908,582,79),(909,583,79),(910,584,79),(911,585,21),(912,585,161),(913,586,21),(914,586,161),(915,587,188),(916,588,167),(917,588,199),(918,589,199),(919,589,169),(920,590,46),(921,591,46),(922,592,224),(923,592,30),(924,593,224),(925,593,30),(926,594,77),(927,594,71),(928,595,27),(929,595,220),(930,596,27),(931,596,220),(932,597,89),(933,598,89),(934,599,131),(935,599,110),(936,600,131),(937,600,110),(938,601,131),(939,601,110),(940,602,95),(941,603,95),(942,604,95),(943,605,203),(944,605,207),(945,606,203),(946,606,207),(947,607,53),(948,607,51),(949,608,53),(950,608,51),(951,609,53),(952,609,51),(953,610,152),(954,610,112),(955,611,152),(956,611,112),(957,612,152),(958,612,112),(959,613,177),(960,614,177),(961,615,95),(962,616,77),(963,616,169),(964,617,77),(965,617,192),(966,618,188),(967,618,98),(968,619,86),(969,619,151),(970,620,86),(971,620,151),(972,621,155),(973,621,168),(974,622,90),(975,622,93),(976,623,90),(977,623,93),(978,624,86),(979,624,37),(980,625,86),(981,625,37),(982,626,149),(983,626,161),(984,627,92),(985,627,168),(986,628,92),(987,628,168),(988,629,17),(989,629,124),(990,630,17),(991,630,124),(992,631,53),(993,631,65),(994,632,199),(995,632,76),(996,633,76),(997,634,76),(998,635,95),(999,636,51),(1000,637,51),(1001,638,91),(1002,639,91),(1003,640,91),(1004,641,137),(1005,642,137),(1006,643,217),(1007,644,208),(1008,645,157),(1009,646,138),(1010,647,91),(1011,648,164),(1012,649,41),(1013,650,125),(1014,651,125),(1015,652,125),(1016,653,18),(1017,654,18),(1018,655,18),(1019,656,211),(1020,657,211),(1021,658,211),(1022,659,129),(1023,659,20),(1024,660,129),(1025,660,20),(1026,661,17),(1027,662,51),(1028,663,51),(1029,664,170),(1030,664,27),(1031,665,167),(1032,666,170),(1033,666,27),(1034,667,152),(1035,667,220),(1036,668,152),(1037,668,220),(1038,669,55),(1039,670,55),(1040,671,55),(1041,672,161),(1042,673,161),(1043,674,90),(1044,674,112),(1045,675,90),(1046,675,112),(1047,676,62),(1048,677,92),(1049,677,84),(1050,678,92),(1051,678,84),(1052,679,121),(1053,680,121),(1054,681,187),(1055,682,71),(1056,683,71),(1057,684,200),(1058,685,200),(1059,686,196),(1060,686,28),(1061,687,196),(1062,687,28),(1063,688,176),(1064,688,212),(1065,689,176),(1066,689,212),(1067,690,133),(1068,690,134),(1069,691,133),(1070,691,134),(1071,692,108),(1072,693,108),(1073,694,160),(1074,694,44),(1075,695,160),(1076,695,44),(1077,696,194),(1078,697,194),(1079,698,150),(1080,699,150),(1081,700,31),(1082,701,98),(1083,701,219),(1084,702,129),(1085,702,20),(1086,703,22),(1087,704,77),(1088,704,161),(1089,705,77),(1090,705,161),(1091,706,77),(1092,706,161),(1093,707,137),(1094,708,119),(1095,708,60),(1096,709,119),(1097,709,60),(1098,710,129),(1099,710,60),(1100,711,129),(1101,711,60),(1102,712,126),(1103,712,79),(1104,713,126),(1105,713,79),(1106,714,60),(1107,714,84),(1108,715,60),(1109,715,84),(1110,716,49),(1111,717,34),(1112,718,10),(1113,719,22),(1114,720,104),(1115,721,224),(1116,722,125),(1117,723,125),(1118,724,125),(1119,725,18),(1120,726,18),(1121,727,18),(1122,728,211),(1123,729,211),(1124,730,211),(1125,731,92),(1126,731,173),(1127,732,92),(1128,732,173),(1129,733,92),(1130,733,173),(1131,734,194),(1132,734,184),(1133,735,194),(1134,735,184),(1135,736,199),(1136,737,12),(1137,738,95),(1138,739,78),(1139,739,90),(1140,740,78),(1141,740,90),(1142,741,33),(1143,742,170),(1144,742,74),(1145,743,170),(1146,743,74),(1147,744,92),(1148,744,222),(1149,745,92),(1150,745,158),(1151,746,162),(1152,747,98),(1153,747,109),(1154,748,98),(1155,748,109),(1156,749,126),(1157,749,186),(1158,750,126),(1159,750,186),(1160,751,225),(1161,752,225),(1162,753,94),(1163,754,94),(1164,755,46),(1165,755,80),(1166,756,46),(1167,756,80),(1168,757,29),(1169,758,29),(1170,759,93),(1171,759,56),(1172,760,93),(1173,760,56),(1174,761,123),(1175,761,94),(1176,762,123),(1177,762,94),(1178,763,94),(1179,763,144),(1180,764,55),(1181,764,215),(1182,765,86),(1183,765,207),(1184,766,148),(1185,767,230),(1186,768,48),(1187,769,226),(1188,770,226),(1189,771,85),(1190,772,13),(1191,773,153),(1192,774,171),(1193,775,25),(1194,776,169),(1195,777,97),(1196,777,89),(1197,778,40),(1198,779,194),(1199,779,35),(1200,780,161),(1201,780,16),(1202,781,190),(1203,782,182),(1204,782,19),(1205,783,182),(1206,783,19),(1207,784,182),(1208,784,19),(1209,785,47),(1210,786,142),(1211,787,68),(1212,788,111),(1213,789,218),(1214,790,195),(1215,791,61),(1216,792,165),(1217,793,15),(1218,794,15),(1219,795,15),(1220,796,15),(1221,797,15),(1222,798,15),(1223,799,15),(1224,800,140),(1225,801,181),(1226,802,206),(1227,803,15),(1228,804,15),(1229,805,15),(1230,806,15);
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

-- Dump completed on 2018-08-14 20:43:09