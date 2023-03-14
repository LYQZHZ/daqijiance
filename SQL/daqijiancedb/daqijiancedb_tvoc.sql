-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: daqijiancedb
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tvoc`
--

DROP TABLE IF EXISTS `tvoc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tvoc` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键，自增，不需要代码赋值',
  `name` varchar(45) NOT NULL DEFAULT 'tvoc' COMMENT '气体名',
  `value` int(11) NOT NULL COMMENT '监测值',
  `unit` varchar(45) NOT NULL DEFAULT 'ppb' COMMENT '计量单位',
  `date` varchar(45) NOT NULL COMMENT '数据获取时间',
  `description` varchar(128) NOT NULL DEFAULT '无' COMMENT '其他描述，默认为‘无’',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1351 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tvoc`
--

LOCK TABLES `tvoc` WRITE;
/*!40000 ALTER TABLE `tvoc` DISABLE KEYS */;
INSERT INTO `tvoc` VALUES (1184,'tvoc',5,'ppb','17:29:21','无'),(1185,'tvoc',76,'ppb','2023-03-01 21:21:13','无'),(1186,'tvoc',76,'ppb','2023-03-01 21:22:14','无'),(1187,'tvoc',76,'ppb','2023-03-01 21:23:14','无'),(1188,'tvoc',76,'ppb','2023-03-01 21:24:15','无'),(1189,'tvoc',76,'ppb','2023-03-01 21:25:15','无'),(1190,'tvoc',76,'ppb','2023-03-01 21:26:15','无'),(1191,'tvoc',76,'ppb','2023-03-01 21:27:16','无'),(1192,'tvoc',76,'ppb','2023-03-01 21:28:16','无'),(1193,'tvoc',76,'ppb','2023-03-01 21:29:16','无'),(1194,'tvoc',76,'ppb','2023-03-01 21:30:17','无'),(1195,'tvoc',76,'ppb','2023-03-01 21:31:17','无'),(1196,'tvoc',76,'ppb','2023-03-01 21:32:17','无'),(1197,'tvoc',76,'ppb','2023-03-01 21:33:18','无'),(1198,'tvoc',76,'ppb','2023-03-01 21:34:18','无'),(1199,'tvoc',76,'ppb','2023-03-01 21:35:18','无'),(1200,'tvoc',76,'ppb','2023-03-01 21:36:19','无'),(1201,'tvoc',76,'ppb','2023-03-01 21:37:19','无'),(1202,'tvoc',76,'ppb','2023-03-01 21:38:19','无'),(1203,'tvoc',76,'ppb','2023-03-01 21:39:20','无'),(1204,'tvoc',76,'ppb','2023-03-01 21:40:20','无'),(1205,'tvoc',76,'ppb','2023-03-01 21:41:20','无'),(1206,'tvoc',76,'ppb','2023-03-01 21:42:21','无'),(1207,'tvoc',76,'ppb','2023-03-01 21:43:21','无'),(1208,'tvoc',76,'ppb','2023-03-01 21:44:21','无'),(1209,'tvoc',76,'ppb','2023-03-01 21:45:22','无'),(1210,'tvoc',76,'ppb','2023-03-01 21:46:22','无'),(1211,'tvoc',76,'ppb','2023-03-01 21:47:22','无'),(1212,'tvoc',76,'ppb','2023-03-01 21:48:23','无'),(1213,'tvoc',76,'ppb','2023-03-01 21:49:23','无'),(1214,'tvoc',76,'ppb','2023-03-01 21:50:24','无'),(1215,'tvoc',76,'ppb','2023-03-01 21:51:24','无'),(1216,'tvoc',76,'ppb','2023-03-01 21:52:24','无'),(1217,'tvoc',76,'ppb','2023-03-01 21:53:25','无'),(1218,'tvoc',76,'ppb','2023-03-01 21:54:25','无'),(1219,'tvoc',76,'ppb','2023-03-01 21:55:25','无'),(1220,'tvoc',76,'ppb','2023-03-01 21:56:26','无'),(1221,'tvoc',76,'ppb','2023-03-01 21:57:26','无'),(1222,'tvoc',76,'ppb','2023-03-01 21:58:26','无'),(1223,'tvoc',76,'ppb','2023-03-01 21:59:27','无'),(1224,'tvoc',76,'ppb','2023-03-01 22:00:27','无'),(1225,'tvoc',76,'ppb','2023-03-01 22:01:27','无'),(1226,'tvoc',76,'ppb','2023-03-01 22:02:28','无'),(1227,'tvoc',76,'ppb','2023-03-01 22:03:28','无'),(1228,'tvoc',76,'ppb','2023-03-01 22:04:28','无'),(1229,'tvoc',76,'ppb','2023-03-01 22:05:29','无'),(1230,'tvoc',76,'ppb','2023-03-01 22:06:29','无'),(1231,'tvoc',76,'ppb','2023-03-01 22:07:29','无'),(1232,'tvoc',76,'ppb','2023-03-01 22:08:30','无'),(1233,'tvoc',76,'ppb','2023-03-01 22:09:30','无'),(1234,'tvoc',76,'ppb','2023-03-01 22:10:31','无'),(1235,'tvoc',76,'ppb','2023-03-01 22:11:31','无'),(1236,'tvoc',76,'ppb','2023-03-01 22:12:31','无'),(1237,'tvoc',76,'ppb','2023-03-01 22:13:31','无'),(1238,'tvoc',76,'ppb','2023-03-01 22:14:32','无'),(1239,'tvoc',76,'ppb','2023-03-01 22:15:32','无'),(1240,'tvoc',76,'ppb','2023-03-01 22:16:33','无'),(1241,'tvoc',76,'ppb','2023-03-01 22:17:33','无'),(1242,'tvoc',76,'ppb','2023-03-01 22:18:33','无'),(1243,'tvoc',76,'ppb','2023-03-01 22:19:34','无'),(1244,'tvoc',76,'ppb','2023-03-01 22:20:34','无'),(1245,'tvoc',76,'ppb','2023-03-01 22:21:34','无'),(1246,'tvoc',76,'ppb','2023-03-01 22:22:34','无'),(1247,'tvoc',76,'ppb','2023-03-01 22:23:35','无'),(1248,'tvoc',76,'ppb','2023-03-01 22:24:35','无'),(1249,'tvoc',76,'ppb','2023-03-01 22:25:35','无'),(1250,'tvoc',76,'ppb','2023-03-01 22:26:36','无'),(1251,'tvoc',76,'ppb','2023-03-01 22:27:36','无'),(1252,'tvoc',76,'ppb','2023-03-01 22:28:37','无'),(1253,'tvoc',76,'ppb','2023-03-01 22:29:37','无'),(1254,'tvoc',76,'ppb','2023-03-01 22:30:37','无'),(1255,'tvoc',76,'ppb','2023-03-01 22:31:38','无'),(1256,'tvoc',76,'ppb','2023-03-01 22:32:38','无'),(1257,'tvoc',76,'ppb','2023-03-01 22:33:38','无'),(1258,'tvoc',76,'ppb','2023-03-01 22:34:39','无'),(1259,'tvoc',76,'ppb','2023-03-01 22:34:53','无'),(1260,'tvoc',76,'ppb','2023-03-01 22:35:53','无'),(1261,'tvoc',76,'ppb','2023-03-01 22:36:54','无'),(1262,'tvoc',76,'ppb','2023-03-01 22:37:54','无'),(1263,'tvoc',76,'ppb','2023-03-01 22:38:54','无'),(1264,'tvoc',76,'ppb','2023-03-01 22:39:55','无'),(1265,'tvoc',76,'ppb','2023-03-01 22:40:55','无'),(1266,'tvoc',76,'ppb','2023-03-01 22:41:55','无'),(1267,'tvoc',76,'ppb','2023-03-01 22:42:56','无'),(1268,'tvoc',76,'ppb','2023-03-01 22:43:56','无'),(1269,'tvoc',76,'ppb','2023-03-01 22:44:56','无'),(1270,'tvoc',76,'ppb','2023-03-01 22:45:57','无'),(1271,'tvoc',76,'ppb','2023-03-01 22:46:57','无'),(1272,'tvoc',76,'ppb','2023-03-01 22:47:57','无'),(1273,'tvoc',76,'ppb','2023-03-01 22:48:58','无'),(1274,'tvoc',76,'ppb','2023-03-01 22:49:58','无'),(1275,'tvoc',76,'ppb','2023-03-01 22:50:58','无'),(1276,'tvoc',76,'ppb','2023-03-01 22:51:59','无'),(1277,'tvoc',76,'ppb','2023-03-01 22:52:08','无'),(1278,'tvoc',76,'ppb','2023-03-01 22:53:07','无'),(1279,'tvoc',76,'ppb','2023-03-01 22:53:46','无'),(1280,'tvoc',76,'ppb','2023-03-01 22:54:47','无'),(1281,'tvoc',76,'ppb','2023-03-01 22:55:25','无'),(1282,'tvoc',76,'ppb','2023-03-01 22:56:25','无'),(1283,'tvoc',76,'ppb','2023-03-01 22:57:25','无'),(1284,'tvoc',76,'ppb','2023-03-01 22:58:25','无'),(1285,'tvoc',76,'ppb','2023-03-01 22:59:25','无'),(1286,'tvoc',76,'ppb','2023-03-01 23:00:26','无'),(1287,'tvoc',76,'ppb','2023-03-01 23:01:26','无'),(1288,'tvoc',76,'ppb','2023-03-01 23:02:26','无'),(1289,'tvoc',76,'ppb','2023-03-01 23:03:26','无'),(1290,'tvoc',76,'ppb','2023-03-01 23:04:27','无'),(1291,'tvoc',76,'ppb','2023-03-01 23:05:27','无'),(1292,'tvoc',76,'ppb','2023-03-01 23:06:27','无'),(1293,'tvoc',76,'ppb','2023-03-01 23:07:27','无'),(1294,'tvoc',76,'ppb','2023-03-01 23:08:28','无'),(1295,'tvoc',76,'ppb','2023-03-01 23:09:28','无'),(1296,'tvoc',76,'ppb','2023-03-01 23:10:28','无'),(1297,'tvoc',76,'ppb','2023-03-01 23:11:28','无'),(1298,'tvoc',76,'ppb','2023-03-01 23:12:29','无'),(1299,'tvoc',76,'ppb','2023-03-01 23:13:29','无'),(1300,'tvoc',76,'ppb','2023-03-01 23:14:29','无'),(1301,'tvoc',76,'ppb','2023-03-01 23:15:29','无'),(1302,'tvoc',76,'ppb','2023-03-01 23:16:30','无'),(1303,'tvoc',76,'ppb','2023-03-01 23:17:30','无'),(1304,'tvoc',76,'ppb','2023-03-01 23:18:30','无'),(1305,'tvoc',76,'ppb','2023-03-01 23:19:30','无'),(1306,'tvoc',76,'ppb','2023-03-01 23:20:30','无'),(1307,'tvoc',76,'ppb','2023-03-01 23:21:31','无'),(1308,'tvoc',76,'ppb','2023-03-01 23:22:31','无'),(1309,'tvoc',76,'ppb','2023-03-01 23:23:31','无'),(1310,'tvoc',76,'ppb','2023-03-01 23:24:31','无'),(1311,'tvoc',76,'ppb','2023-03-01 23:24:56','无'),(1312,'tvoc',76,'ppb','2023-03-01 23:25:56','无'),(1313,'tvoc',76,'ppb','2023-03-01 23:26:42','无'),(1314,'tvoc',76,'ppb','2023-03-01 23:27:43','无'),(1315,'tvoc',76,'ppb','2023-03-01 23:28:43','无'),(1316,'tvoc',76,'ppb','2023-03-01 23:29:43','无'),(1317,'tvoc',76,'ppb','2023-03-01 23:30:43','无'),(1318,'tvoc',76,'ppb','2023-03-01 23:31:12','无'),(1319,'tvoc',76,'ppb','2023-03-01 23:32:12','无'),(1320,'tvoc',76,'ppb','2023-03-01 23:33:13','无'),(1321,'tvoc',76,'ppb','2023-03-01 23:34:13','无'),(1322,'tvoc',76,'ppb','2023-03-01 23:35:13','无'),(1323,'tvoc',76,'ppb','2023-03-01 23:36:13','无'),(1324,'tvoc',76,'ppb','2023-03-01 23:36:24','无'),(1325,'tvoc',76,'ppb','2023-03-01 23:37:24','无'),(1326,'tvoc',76,'ppb','2023-03-01 23:38:25','无'),(1327,'tvoc',76,'ppb','2023-03-01 23:38:58','无'),(1328,'tvoc',76,'ppb','2023-03-01 23:39:24','无'),(1329,'tvoc',76,'ppb','2023-03-01 23:40:25','无'),(1330,'tvoc',76,'ppb','2023-03-01 23:41:25','无'),(1331,'tvoc',76,'ppb','2023-03-01 23:42:25','无'),(1332,'tvoc',76,'ppb','2023-03-01 23:43:26','无'),(1333,'tvoc',76,'ppb','2023-03-01 23:44:26','无'),(1334,'tvoc',76,'ppb','2023-03-01 23:45:26','无'),(1335,'tvoc',76,'ppb','2023-03-01 23:46:27','无'),(1336,'tvoc',76,'ppb','2023-03-01 23:47:27','无'),(1337,'tvoc',76,'ppb','2023-03-01 23:48:27','无'),(1338,'tvoc',76,'ppb','2023-03-01 23:49:27','无'),(1339,'tvoc',76,'ppb','2023-03-01 23:50:28','无'),(1340,'tvoc',76,'ppb','2023-03-01 23:51:28','无'),(1341,'tvoc',76,'ppb','2023-03-01 23:52:29','无'),(1342,'tvoc',76,'ppb','2023-03-01 23:53:29','无'),(1343,'tvoc',76,'ppb','2023-03-01 23:54:29','无'),(1344,'tvoc',76,'ppb','2023-03-01 23:55:23','无'),(1345,'tvoc',76,'ppb','2023-03-01 23:56:23','无'),(1346,'tvoc',76,'ppb','2023-03-01 23:57:23','无'),(1347,'tvoc',76,'ppb','2023-03-01 23:58:24','无'),(1348,'tvoc',76,'ppb','2023-03-01 23:59:24','无'),(1349,'tvoc',76,'ppb','2023-03-02 00:00:24','无'),(1350,'tvoc',76,'ppb','2023-03-02 00:01:25','无');
/*!40000 ALTER TABLE `tvoc` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-02  0:01:42
