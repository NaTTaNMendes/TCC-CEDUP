-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: bancotcc
-- ------------------------------------------------------
-- Server version	8.0.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `address` (
  `idAddress` int NOT NULL AUTO_INCREMENT,
  `street` varchar(45) DEFAULT NULL,
  `number` int DEFAULT NULL,
  `complement` varchar(45) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  `neighborhood` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idAddress`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (1,'Laguna',368,'Casa','Santa Catarina','Brasil','Velha','Blumenau');
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chair`
--

DROP TABLE IF EXISTS `chair`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chair` (
  `idChair` int NOT NULL AUTO_INCREMENT,
  `name` varchar(3) DEFAULT NULL,
  `chairType` int NOT NULL,
  `filmHall_idFilmHall` int NOT NULL,
  PRIMARY KEY (`idChair`,`filmHall_idFilmHall`),
  KEY `fk_Chair_filmHall1_idx` (`filmHall_idFilmHall`),
  CONSTRAINT `fk_Chair_filmHall1` FOREIGN KEY (`filmHall_idFilmHall`) REFERENCES `filmhall` (`idFilmHall`)
) ENGINE=InnoDB AUTO_INCREMENT=109 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chair`
--

LOCK TABLES `chair` WRITE;
/*!40000 ALTER TABLE `chair` DISABLE KEYS */;
INSERT INTO `chair` VALUES (1,'A1',0,1),(2,'A2',0,1),(3,'A3',0,1),(4,'A4',0,1),(5,'A5',0,1),(6,'A8',0,1),(7,'A9',0,1),(8,'A10',0,1),(9,'A11',0,1),(10,'A12',0,1),(11,'B1',0,1),(12,'B2',0,1),(13,'B3',0,1),(14,'B4',0,1),(15,'B5',0,1),(16,'B8',0,1),(17,'B9',0,1),(18,'B10',0,1),(19,'B11',0,1),(20,'B12',0,1),(21,'C1',0,1),(22,'C2',0,1),(23,'C3',0,1),(24,'C4',0,1),(25,'C5',0,1),(26,'C8',0,1),(27,'C9',0,1),(28,'C10',0,1),(29,'C11',0,1),(30,'C12',0,1),(31,'D1',0,1),(32,'D2',0,1),(33,'D3',0,1),(34,'D4',0,1),(35,'D5',0,1),(36,'D6',2,1),(37,'D7',2,1),(38,'D8',0,1),(39,'D9',0,1),(40,'D10',0,1),(41,'D11',0,1),(42,'D12',0,1),(43,'E1',0,1),(44,'E2',0,1),(45,'E3',0,1),(46,'E4',0,1),(47,'E5',0,1),(48,'E6',1,1),(49,'E7',1,1),(50,'E8',0,1),(51,'E9',0,1),(52,'E10',0,1),(53,'E11',0,1),(54,'E12',0,1),(55,'F1',0,1),(56,'F2',0,1),(57,'F3',0,1),(58,'F4',0,1),(59,'F5',0,1),(60,'F6',1,1),(61,'F7',1,1),(62,'F8',0,1),(63,'F9',0,1),(64,'F10',0,1),(65,'F11',0,1),(66,'F12',0,1),(67,'G1',0,1),(68,'G2',0,1),(69,'G3',0,1),(70,'G4',0,1),(71,'G5',0,1),(72,'G6',1,1),(73,'G7',1,1),(74,'G8',0,1),(75,'G9',0,1),(76,'G10',0,1),(77,'G11',0,1),(78,'G12',0,1),(79,'H1',0,1),(80,'H2',0,1),(81,'H3',0,1),(82,'H4',0,1),(83,'H5',0,1),(84,'H8',0,1),(85,'H9',0,1),(86,'H10',0,1),(87,'H11',0,1),(88,'H12',0,1),(89,'I1',0,1),(90,'I2',0,1),(91,'I3',0,1),(92,'I4',0,1),(93,'I5',0,1),(94,'I8',0,1),(95,'I9',0,1),(96,'I10',0,1),(97,'I11',0,1),(98,'I12',0,1),(99,'J1',0,1),(100,'J2',0,1),(101,'J3',0,1),(102,'J4',0,1),(103,'J5',0,1),(104,'J8',0,1),(105,'J9',0,1),(106,'J10',0,1),(107,'J11',0,1),(108,'J12',0,1);
/*!40000 ALTER TABLE `chair` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `client`
--

DROP TABLE IF EXISTS `client`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `client` (
  `idClient` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `ITR` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `birthDate` date DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `note` varchar(150) DEFAULT NULL,
  `student` tinyint DEFAULT NULL,
  `deficient` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`idClient`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `client`
--

LOCK TABLES `client` WRITE;
/*!40000 ALTER TABLE `client` DISABLE KEYS */;
INSERT INTO `client` VALUES (1,'André','123456789','(47)991659853','2000-05-15','jose@gmail.com',NULL,0,0),(2,'Carlos','987654321','(47)152486575','1980-06-22','carlos@gmail.com',NULL,0,0),(3,'N/A',NULL,NULL,NULL,NULL,NULL,0,0);
/*!40000 ALTER TABLE `client` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `combo`
--

DROP TABLE IF EXISTS `combo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `combo` (
  `idCombo` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `note` varchar(45) DEFAULT NULL,
  `code` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idCombo`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `combo`
--

LOCK TABLES `combo` WRITE;
/*!40000 ALTER TABLE `combo` DISABLE KEYS */;
INSERT INTO `combo` VALUES (1,'COMBO 1',15,'Combo individual','1100'),(2,'COMBO 2',40,'Combo família','1101');
/*!40000 ALTER TABLE `combo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `combo_has_product`
--

DROP TABLE IF EXISTS `combo_has_product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `combo_has_product` (
  `Combo_idCombo` int NOT NULL,
  `product_idProduct` int NOT NULL,
  `quantiy` int DEFAULT NULL,
  PRIMARY KEY (`Combo_idCombo`,`product_idProduct`),
  KEY `fk_Combo_has_product_product1_idx` (`product_idProduct`),
  KEY `fk_Combo_has_product_Combo1_idx` (`Combo_idCombo`),
  CONSTRAINT `fk_Combo_has_product_Combo1` FOREIGN KEY (`Combo_idCombo`) REFERENCES `combo` (`idCombo`),
  CONSTRAINT `fk_Combo_has_product_product1` FOREIGN KEY (`product_idProduct`) REFERENCES `product` (`idProduct`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `combo_has_product`
--

LOCK TABLES `combo_has_product` WRITE;
/*!40000 ALTER TABLE `combo_has_product` DISABLE KEYS */;
INSERT INTO `combo_has_product` VALUES (1,2,1),(1,8,1),(1,11,1),(1,12,1),(2,3,2),(2,4,4),(2,7,4);
/*!40000 ALTER TABLE `combo_has_product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comboh`
--

DROP TABLE IF EXISTS `comboh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comboh` (
  `idcomboH` int NOT NULL AUTO_INCREMENT,
  `idCombo` int DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idcomboH`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comboh`
--

LOCK TABLES `comboh` WRITE;
/*!40000 ALTER TABLE `comboh` DISABLE KEYS */;
/*!40000 ALTER TABLE `comboh` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comboh_has_producth`
--

DROP TABLE IF EXISTS `comboh_has_producth`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comboh_has_producth` (
  `comboH_idcomboH` int NOT NULL,
  `productH_idproductH` int NOT NULL,
  PRIMARY KEY (`comboH_idcomboH`,`productH_idproductH`),
  KEY `fk_comboH_has_productH_productH1_idx` (`productH_idproductH`),
  KEY `fk_comboH_has_productH_comboH1_idx` (`comboH_idcomboH`),
  CONSTRAINT `fk_comboH_has_productH_comboH1` FOREIGN KEY (`comboH_idcomboH`) REFERENCES `comboh` (`idcomboH`),
  CONSTRAINT `fk_comboH_has_productH_productH1` FOREIGN KEY (`productH_idproductH`) REFERENCES `producth` (`idproductH`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comboh_has_producth`
--

LOCK TABLES `comboh_has_producth` WRITE;
/*!40000 ALTER TABLE `comboh_has_producth` DISABLE KEYS */;
/*!40000 ALTER TABLE `comboh_has_producth` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `director`
--

DROP TABLE IF EXISTS `director`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `director` (
  `idDirector` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idDirector`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `director`
--

LOCK TABLES `director` WRITE;
/*!40000 ALTER TABLE `director` DISABLE KEYS */;
INSERT INTO `director` VALUES (1,'Stanley Kubrick'),(2,'Martin Scorsese'),(3,'Christopher Nolan'),(4,'Spike Jonze'),(5,'Steven Speilberg'),(6,'Gus Van Sant'),(7,'Quentin Tarantino'),(8,'Francis Ford Coppola'),(9,'Roman Polanski'),(10,'Wes Anderson'),(11,'Peter Jackson'),(12,'Alfred Hitchcock'),(13,'James Cameron'),(14,'George Lucas'),(15,'Ridley Scott'),(16,'N/A');
/*!40000 ALTER TABLE `director` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `idEmployee` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `birthDate` date DEFAULT NULL,
  `ITR` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `note` varchar(1000) DEFAULT NULL,
  `RG` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `function` int NOT NULL,
  `address_idAddress_Employee` int NOT NULL,
  PRIMARY KEY (`idEmployee`,`address_idAddress_Employee`),
  KEY `fk_employee_address1_idx` (`address_idAddress_Employee`),
  CONSTRAINT `fk_employee_address1` FOREIGN KEY (`address_idAddress_Employee`) REFERENCES `address` (`idAddress`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'Maria Eduarda Santos Souza','2004-01-14','12345678912','(47)559681125','nattan@gmail.com','Conta padrão','2536489','senha',0,1);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `filmhall`
--

DROP TABLE IF EXISTS `filmhall`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `filmhall` (
  `idFilmHall` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idFilmHall`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `filmhall`
--

LOCK TABLES `filmhall` WRITE;
/*!40000 ALTER TABLE `filmhall` DISABLE KEYS */;
INSERT INTO `filmhall` VALUES (1,'SALA 01'),(2,'SALA 02');
/*!40000 ALTER TABLE `filmhall` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gender`
--

DROP TABLE IF EXISTS `gender`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `gender` (
  `idGender` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idGender`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gender`
--

LOCK TABLES `gender` WRITE;
/*!40000 ALTER TABLE `gender` DISABLE KEYS */;
INSERT INTO `gender` VALUES (1,'AÇÃO'),(2,'AVENTURA'),(3,'CINEMA DE ARTE'),(4,'CHANCHADA'),(5,'COMÉDIA'),(6,'COMÉDIA DE AÇÃO'),(7,'COMÉDIA DE TERROR'),(8,'COMÉDIA DRAMÁTICA'),(9,'COMÉDIA ROMÂNTICA'),(10,'DANÇA'),(11,'DOCUMENTÁRIO'),(12,'DOCUFICÇÃO'),(13,'DRAMA'),(14,'ESPIONAGEM'),(15,'FAROESTE'),(16,'FANTASIA'),(17,'FANTASIA CIENTÍFICA'),(18,'FICÇÃO CIENTÍFICA'),(19,'TRUQUES'),(20,'GUERRA'),(21,'MISTÉRIO'),(22,'MUSICAL'),(23,'POLICIAL'),(24,'ROMANCE'),(25,'TERROR'),(26,'THRILLER'),(27,'N/A');
/*!40000 ALTER TABLE `gender` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `historystock`
--

DROP TABLE IF EXISTS `historystock`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `historystock` (
  `idstock` int NOT NULL AUTO_INCREMENT,
  `total` int DEFAULT NULL,
  `inQuantity` int DEFAULT NULL,
  `outQuantity` int DEFAULT NULL,
  `date` date DEFAULT NULL,
  `hour` time DEFAULT NULL,
  `product` varchar(45) DEFAULT NULL,
  `code` varchar(45) DEFAULT NULL,
  `price` varchar(45) DEFAULT NULL,
  `idProduct` int DEFAULT NULL,
  PRIMARY KEY (`idstock`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `historystock`
--

LOCK TABLES `historystock` WRITE;
/*!40000 ALTER TABLE `historystock` DISABLE KEYS */;
/*!40000 ALTER TABLE `historystock` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movie`
--

DROP TABLE IF EXISTS `movie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movie` (
  `idMovie` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `duration` int DEFAULT NULL,
  `Cocind` int DEFAULT NULL,
  `synopsis` varchar(1000) DEFAULT NULL,
  `director_idDirector` int NOT NULL,
  `gender_idGender` int NOT NULL,
  PRIMARY KEY (`idMovie`,`director_idDirector`,`gender_idGender`),
  KEY `fk_movie_director1_idx` (`director_idDirector`),
  KEY `fk_movie_gender1_idx` (`gender_idGender`),
  CONSTRAINT `fk_movie_director1` FOREIGN KEY (`director_idDirector`) REFERENCES `director` (`idDirector`),
  CONSTRAINT `fk_movie_gender1` FOREIGN KEY (`gender_idGender`) REFERENCES `gender` (`idGender`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie`
--

LOCK TABLES `movie` WRITE;
/*!40000 ALTER TABLE `movie` DISABLE KEYS */;
INSERT INTO `movie` VALUES (1,'Alien: o 8º passageiroº',120,5,'Uma nave espacial, ao retornar para Terra, recebe estranhos sinais vindos de um asteroide. Enquanto a equipe investiga o local, um dos tripulantes é atacado por um misterioso ser. O que parecia ser um ataque isolado se transforma em um terror constante, pois o tripulante atacado levou para dentro da nave o embrião de um alienígena, que não para de crescer e tem como meta matar toda a tripulação.',15,25),(2,'Avatar',180,3,'No exuberante mundo alienígena de Pandora vivem os Na\'vi, seres que parecem ser primitivos, mas são altamente evoluídos. Como o ambiente do planeta é tóxico, foram criados os avatares, corpos biológicos controlados pela mente humana que se movimentam livremente em Pandora. Jake Sully, um ex-fuzileiro naval paralítico, volta a andar através de um avatar e se apaixona por uma Na\'vi. Esta paixão leva Jake a lutar pela sobrevivência de Pandora.',13,2),(3,'Tubarão',120,4,'Um terrível ataque a banhistas é o sinal de que a praia da pequena cidade de Amity, na Nova Inglaterra, virou refeitório de um gigantesco tubarão branco. O chefe de polícia Martin Brody quer fechar as praias, mas o prefeito Larry Vaughn não permite, com medo de que o faturamento com a receita dos turistas deixe a cidade sem recursos. O cientista Matt Hooper e o pescador Quint se oferecem para ajudar Brody a capturar e matar a fera, mas a missão vai ser mais complicada do que eles imaginavam.',5,26);
/*!40000 ALTER TABLE `movie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product` (
  `idProduct` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `code` varchar(45) DEFAULT NULL,
  `note` varchar(100) DEFAULT NULL,
  `stock` int DEFAULT NULL,
  PRIMARY KEY (`idProduct`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1,'PIPOCA P',5,'1000','Pipoca pequena',100),(2,'PIPOCA M',5,'1001','Pipoca média',80),(3,'PIPOCA G',5,'1002','Pipoca grande',50),(4,'TRENTO',3,'1003','Trento 50g',40),(5,'SNICKERS',6,'1004','Snickers 100g',35),(6,'REFRIGERANTE P',4,'1005','Refrigerante pequeno',200),(7,'REFRIGERANTE M',5,'1006','Refrigerante médio',180),(8,'REFRIGERANTE G',6,'1007','Refrigerante grande',150),(9,'COCA COLA 600',4.5,'1008','Coca cola 600ml',15),(10,'PIPOCA DOCE M',7,'1009','Pipoca média doce',50),(11,'DIAMANTE NEGRO',3.5,'1010','Diamante negro 50g',100),(12,'BIBS',10,'1011','Pote bibs',30);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producth`
--

DROP TABLE IF EXISTS `producth`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producth` (
  `idproductH` int NOT NULL AUTO_INCREMENT,
  `idProduct` int DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `productHcol` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idproductH`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producth`
--

LOCK TABLES `producth` WRITE;
/*!40000 ALTER TABLE `producth` DISABLE KEYS */;
/*!40000 ALTER TABLE `producth` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sell`
--

DROP TABLE IF EXISTS `sell`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sell` (
  `idSell` int NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `note` varchar(300) DEFAULT NULL,
  `employee_idEmployee` int NOT NULL,
  `client_idClient` int NOT NULL,
  `hour` time DEFAULT NULL,
  `total` double DEFAULT NULL,
  `moneyReceived` double DEFAULT NULL,
  `paymentMethod` int NOT NULL,
  PRIMARY KEY (`idSell`,`employee_idEmployee`,`client_idClient`),
  KEY `fk_sell_employee1_idx` (`employee_idEmployee`),
  KEY `fk_sell_client1_idx` (`client_idClient`),
  CONSTRAINT `fk_sell_client1` FOREIGN KEY (`client_idClient`) REFERENCES `client` (`idClient`),
  CONSTRAINT `fk_sell_employee1` FOREIGN KEY (`employee_idEmployee`) REFERENCES `employee` (`idEmployee`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sell`
--

LOCK TABLES `sell` WRITE;
/*!40000 ALTER TABLE `sell` DISABLE KEYS */;
INSERT INTO `sell` VALUES (1,'2022-01-24','',1,1,'11:46:04',25,25,0);
/*!40000 ALTER TABLE `sell` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sell_has_combo`
--

DROP TABLE IF EXISTS `sell_has_combo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sell_has_combo` (
  `Sell_idSell` int NOT NULL,
  `Combo_idCombo` int NOT NULL,
  `quantity` int DEFAULT NULL,
  PRIMARY KEY (`Sell_idSell`,`Combo_idCombo`),
  KEY `fk_Sell_has_Combo_Combo1_idx` (`Combo_idCombo`),
  KEY `fk_Sell_has_Combo_Sell1_idx` (`Sell_idSell`),
  CONSTRAINT `fk_Sell_has_Combo_Combo1` FOREIGN KEY (`Combo_idCombo`) REFERENCES `combo` (`idCombo`),
  CONSTRAINT `fk_Sell_has_Combo_Sell1` FOREIGN KEY (`Sell_idSell`) REFERENCES `sell` (`idSell`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sell_has_combo`
--

LOCK TABLES `sell_has_combo` WRITE;
/*!40000 ALTER TABLE `sell_has_combo` DISABLE KEYS */;
INSERT INTO `sell_has_combo` VALUES (1,1,1);
/*!40000 ALTER TABLE `sell_has_combo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sell_has_product`
--

DROP TABLE IF EXISTS `sell_has_product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sell_has_product` (
  `Sell_idSell` int NOT NULL,
  `Product_idProduct` int NOT NULL,
  `quantity` int DEFAULT NULL,
  PRIMARY KEY (`Sell_idSell`,`Product_idProduct`),
  KEY `fk_Sell_has_Product_Product1_idx` (`Product_idProduct`),
  KEY `fk_Sell_has_Product_Sell1_idx` (`Sell_idSell`),
  CONSTRAINT `fk_Sell_has_Product_Product1` FOREIGN KEY (`Product_idProduct`) REFERENCES `product` (`idProduct`),
  CONSTRAINT `fk_Sell_has_Product_Sell1` FOREIGN KEY (`Sell_idSell`) REFERENCES `sell` (`idSell`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sell_has_product`
--

LOCK TABLES `sell_has_product` WRITE;
/*!40000 ALTER TABLE `sell_has_product` DISABLE KEYS */;
INSERT INTO `sell_has_product` VALUES (1,1,2);
/*!40000 ALTER TABLE `sell_has_product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sellhistory`
--

DROP TABLE IF EXISTS `sellhistory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sellhistory` (
  `idsellHistory` int NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `hour` time DEFAULT NULL,
  `seller` varchar(45) DEFAULT NULL,
  `client` varchar(45) DEFAULT NULL,
  `sale` varchar(45) DEFAULT NULL,
  `paymentMethod` varchar(45) DEFAULT NULL,
  `idSell` int DEFAULT NULL,
  `total` double DEFAULT NULL,
  PRIMARY KEY (`idsellHistory`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sellhistory`
--

LOCK TABLES `sellhistory` WRITE;
/*!40000 ALTER TABLE `sellhistory` DISABLE KEYS */;
/*!40000 ALTER TABLE `sellhistory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sellhistory_has_comboh`
--

DROP TABLE IF EXISTS `sellhistory_has_comboh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sellhistory_has_comboh` (
  `sellHistory_idsellHistory` int NOT NULL,
  `comboH_idcomboH` int NOT NULL,
  PRIMARY KEY (`sellHistory_idsellHistory`,`comboH_idcomboH`),
  KEY `fk_sellHistory_has_comboH_comboH1_idx` (`comboH_idcomboH`),
  KEY `fk_sellHistory_has_comboH_sellHistory1_idx` (`sellHistory_idsellHistory`),
  CONSTRAINT `fk_sellHistory_has_comboH_comboH1` FOREIGN KEY (`comboH_idcomboH`) REFERENCES `comboh` (`idcomboH`),
  CONSTRAINT `fk_sellHistory_has_comboH_sellHistory1` FOREIGN KEY (`sellHistory_idsellHistory`) REFERENCES `sellhistory` (`idsellHistory`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sellhistory_has_comboh`
--

LOCK TABLES `sellhistory_has_comboh` WRITE;
/*!40000 ALTER TABLE `sellhistory_has_comboh` DISABLE KEYS */;
/*!40000 ALTER TABLE `sellhistory_has_comboh` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sellhistory_has_producth`
--

DROP TABLE IF EXISTS `sellhistory_has_producth`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sellhistory_has_producth` (
  `sellHistory_idsellHistory` int NOT NULL,
  `productH_idproductH` int NOT NULL,
  PRIMARY KEY (`sellHistory_idsellHistory`,`productH_idproductH`),
  KEY `fk_sellHistory_has_productH_productH1_idx` (`productH_idproductH`),
  KEY `fk_sellHistory_has_productH_sellHistory1_idx` (`sellHistory_idsellHistory`),
  CONSTRAINT `fk_sellHistory_has_productH_productH1` FOREIGN KEY (`productH_idproductH`) REFERENCES `producth` (`idproductH`),
  CONSTRAINT `fk_sellHistory_has_productH_sellHistory1` FOREIGN KEY (`sellHistory_idsellHistory`) REFERENCES `sellhistory` (`idsellHistory`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sellhistory_has_producth`
--

LOCK TABLES `sellhistory_has_producth` WRITE;
/*!40000 ALTER TABLE `sellhistory_has_producth` DISABLE KEYS */;
/*!40000 ALTER TABLE `sellhistory_has_producth` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `session`
--

DROP TABLE IF EXISTS `session`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `session` (
  `idSession` int NOT NULL AUTO_INCREMENT,
  `lyrics` tinyint(1) DEFAULT NULL,
  `movie_idMovie` int NOT NULL,
  `filmHall_idFilmHall` int NOT NULL,
  `data` date DEFAULT NULL,
  `beginingHour` time DEFAULT NULL,
  `finishHour` time DEFAULT NULL,
  PRIMARY KEY (`idSession`,`movie_idMovie`,`filmHall_idFilmHall`),
  KEY `fk_session_movie1_idx` (`movie_idMovie`),
  KEY `fk_session_filmHall1_idx` (`filmHall_idFilmHall`),
  CONSTRAINT `fk_session_filmHall1` FOREIGN KEY (`filmHall_idFilmHall`) REFERENCES `filmhall` (`idFilmHall`),
  CONSTRAINT `fk_session_movie1` FOREIGN KEY (`movie_idMovie`) REFERENCES `movie` (`idMovie`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `session`
--

LOCK TABLES `session` WRITE;
/*!40000 ALTER TABLE `session` DISABLE KEYS */;
INSERT INTO `session` VALUES (1,0,1,1,'2021-11-17','18:00:00','20:00:00');
/*!40000 ALTER TABLE `session` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `session_has_chair`
--

DROP TABLE IF EXISTS `session_has_chair`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `session_has_chair` (
  `session_idSession` int NOT NULL,
  `chair_idChair` int NOT NULL,
  `chairStatus` int NOT NULL,
  PRIMARY KEY (`session_idSession`,`chair_idChair`),
  KEY `fk_session_has_chair_chair1_idx` (`chair_idChair`),
  KEY `fk_session_has_chair_session1_idx` (`session_idSession`),
  CONSTRAINT `fk_session_has_chair_chair1` FOREIGN KEY (`chair_idChair`) REFERENCES `chair` (`idChair`),
  CONSTRAINT `fk_session_has_chair_session1` FOREIGN KEY (`session_idSession`) REFERENCES `session` (`idSession`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `session_has_chair`
--

LOCK TABLES `session_has_chair` WRITE;
/*!40000 ALTER TABLE `session_has_chair` DISABLE KEYS */;
INSERT INTO `session_has_chair` VALUES (1,1,0),(1,2,0),(1,3,0),(1,4,0),(1,5,0),(1,6,0),(1,7,0),(1,8,0),(1,9,0),(1,10,0),(1,11,0),(1,12,0),(1,13,0),(1,14,0),(1,15,0),(1,16,0),(1,17,0),(1,18,0),(1,19,0),(1,20,0),(1,21,0),(1,22,0),(1,23,0),(1,24,0),(1,25,0),(1,26,0),(1,27,0),(1,28,0),(1,29,0),(1,30,0),(1,31,0),(1,32,0),(1,33,0),(1,34,0),(1,35,0),(1,36,0),(1,37,0),(1,38,0),(1,39,0),(1,40,0),(1,41,0),(1,42,0),(1,43,0),(1,44,0),(1,45,0),(1,46,0),(1,47,0),(1,48,0),(1,49,0),(1,50,0),(1,51,0),(1,52,0),(1,53,0),(1,54,0),(1,55,0),(1,56,0),(1,57,0),(1,58,0),(1,59,0),(1,60,0),(1,61,0),(1,62,0),(1,63,0),(1,64,0),(1,65,0),(1,66,0),(1,67,0),(1,68,0),(1,69,0),(1,70,0),(1,71,0),(1,72,0),(1,73,0),(1,74,0),(1,75,0),(1,76,0),(1,77,0),(1,78,0),(1,79,0),(1,80,0),(1,81,0),(1,82,0),(1,83,0),(1,84,0),(1,85,0),(1,86,0),(1,87,0),(1,88,0),(1,89,0),(1,90,0),(1,91,0),(1,92,0),(1,93,0),(1,94,0),(1,95,0),(1,96,0),(1,97,0),(1,98,0),(1,99,0),(1,100,0),(1,101,0),(1,102,0),(1,103,0),(1,104,0),(1,105,0),(1,106,0),(1,107,0),(1,108,0);
/*!40000 ALTER TABLE `session_has_chair` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ticket`
--

DROP TABLE IF EXISTS `ticket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ticket` (
  `idTicket` int NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `price` double DEFAULT NULL,
  `cinemaName` varchar(45) DEFAULT NULL,
  `ticketType` int NOT NULL,
  `movie_idMovie` int NOT NULL,
  `client_idClient` int NOT NULL,
  `sell_idSell` int NOT NULL,
  `hour` time DEFAULT NULL,
  `seat` varchar(3) NOT NULL,
  PRIMARY KEY (`idTicket`,`movie_idMovie`,`client_idClient`,`sell_idSell`),
  KEY `fk_ticket_movie1_idx` (`movie_idMovie`),
  KEY `fk_ticket_client1_idx` (`client_idClient`),
  KEY `fk_ticket_sell1_idx` (`sell_idSell`),
  CONSTRAINT `fk_ticket_client1` FOREIGN KEY (`client_idClient`) REFERENCES `client` (`idClient`),
  CONSTRAINT `fk_ticket_movie1` FOREIGN KEY (`movie_idMovie`) REFERENCES `movie` (`idMovie`),
  CONSTRAINT `fk_ticket_sell1` FOREIGN KEY (`sell_idSell`) REFERENCES `sell` (`idSell`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticket`
--

LOCK TABLES `ticket` WRITE;
/*!40000 ALTER TABLE `ticket` DISABLE KEYS */;
/*!40000 ALTER TABLE `ticket` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-01-24 11:48:31
