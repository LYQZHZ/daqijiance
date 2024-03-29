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
-- Table structure for table `no2`
--

DROP TABLE IF EXISTS `no2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `no2` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键，自增，不需要代码赋值',
  `name` varchar(45) NOT NULL DEFAULT 'no2' COMMENT '气体名',
  `value` int(11) NOT NULL COMMENT '监测值',
  `unit` varchar(45) NOT NULL DEFAULT 'ug/m³' COMMENT '计量单位',
  `date` varchar(45) NOT NULL COMMENT '数据获取时间',
  `description` varchar(128) NOT NULL DEFAULT '无' COMMENT '其他描述，默认为‘无’',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1351 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `no2`
--

LOCK TABLES `no2` WRITE;
/*!40000 ALTER TABLE `no2` DISABLE KEYS */;
INSERT INTO `no2` VALUES (1184,'no2',4,'ug/m³','17:29:21','无'),(1185,'no2',400,'ug/m³','2023-03-01 21:21:13','无'),(1186,'no2',400,'ug/m³','2023-03-01 21:22:14','无'),(1187,'no2',400,'ug/m³','2023-03-01 21:23:14','无'),(1188,'no2',400,'ug/m³','2023-03-01 21:24:14','无'),(1189,'no2',400,'ug/m³','2023-03-01 21:25:15','无'),(1190,'no2',400,'ug/m³','2023-03-01 21:26:15','无'),(1191,'no2',400,'ug/m³','2023-03-01 21:27:15','无'),(1192,'no2',400,'ug/m³','2023-03-01 21:28:16','无'),(1193,'no2',400,'ug/m³','2023-03-01 21:29:16','无'),(1194,'no2',400,'ug/m³','2023-03-01 21:30:17','无'),(1195,'no2',400,'ug/m³','2023-03-01 21:31:17','无'),(1196,'no2',400,'ug/m³','2023-03-01 21:32:17','无'),(1197,'no2',400,'ug/m³','2023-03-01 21:33:18','无'),(1198,'no2',400,'ug/m³','2023-03-01 21:34:18','无'),(1199,'no2',400,'ug/m³','2023-03-01 21:35:18','无'),(1200,'no2',400,'ug/m³','2023-03-01 21:36:19','无'),(1201,'no2',400,'ug/m³','2023-03-01 21:37:19','无'),(1202,'no2',400,'ug/m³','2023-03-01 21:38:19','无'),(1203,'no2',400,'ug/m³','2023-03-01 21:39:20','无'),(1204,'no2',400,'ug/m³','2023-03-01 21:40:20','无'),(1205,'no2',400,'ug/m³','2023-03-01 21:41:20','无'),(1206,'no2',400,'ug/m³','2023-03-01 21:42:21','无'),(1207,'no2',400,'ug/m³','2023-03-01 21:43:21','无'),(1208,'no2',400,'ug/m³','2023-03-01 21:44:21','无'),(1209,'no2',400,'ug/m³','2023-03-01 21:45:22','无'),(1210,'no2',400,'ug/m³','2023-03-01 21:46:22','无'),(1211,'no2',400,'ug/m³','2023-03-01 21:47:22','无'),(1212,'no2',400,'ug/m³','2023-03-01 21:48:23','无'),(1213,'no2',400,'ug/m³','2023-03-01 21:49:23','无'),(1214,'no2',400,'ug/m³','2023-03-01 21:50:23','无'),(1215,'no2',400,'ug/m³','2023-03-01 21:51:24','无'),(1216,'no2',400,'ug/m³','2023-03-01 21:52:24','无'),(1217,'no2',400,'ug/m³','2023-03-01 21:53:25','无'),(1218,'no2',400,'ug/m³','2023-03-01 21:54:25','无'),(1219,'no2',400,'ug/m³','2023-03-01 21:55:25','无'),(1220,'no2',400,'ug/m³','2023-03-01 21:56:26','无'),(1221,'no2',400,'ug/m³','2023-03-01 21:57:26','无'),(1222,'no2',400,'ug/m³','2023-03-01 21:58:26','无'),(1223,'no2',400,'ug/m³','2023-03-01 21:59:27','无'),(1224,'no2',400,'ug/m³','2023-03-01 22:00:27','无'),(1225,'no2',400,'ug/m³','2023-03-01 22:01:27','无'),(1226,'no2',400,'ug/m³','2023-03-01 22:02:28','无'),(1227,'no2',400,'ug/m³','2023-03-01 22:03:28','无'),(1228,'no2',400,'ug/m³','2023-03-01 22:04:28','无'),(1229,'no2',400,'ug/m³','2023-03-01 22:05:29','无'),(1230,'no2',400,'ug/m³','2023-03-01 22:06:29','无'),(1231,'no2',400,'ug/m³','2023-03-01 22:07:29','无'),(1232,'no2',400,'ug/m³','2023-03-01 22:08:30','无'),(1233,'no2',400,'ug/m³','2023-03-01 22:09:30','无'),(1234,'no2',400,'ug/m³','2023-03-01 22:10:30','无'),(1235,'no2',400,'ug/m³','2023-03-01 22:11:31','无'),(1236,'no2',400,'ug/m³','2023-03-01 22:12:31','无'),(1237,'no2',400,'ug/m³','2023-03-01 22:13:31','无'),(1238,'no2',400,'ug/m³','2023-03-01 22:14:32','无'),(1239,'no2',400,'ug/m³','2023-03-01 22:15:32','无'),(1240,'no2',400,'ug/m³','2023-03-01 22:16:32','无'),(1241,'no2',400,'ug/m³','2023-03-01 22:17:33','无'),(1242,'no2',400,'ug/m³','2023-03-01 22:18:33','无'),(1243,'no2',400,'ug/m³','2023-03-01 22:19:34','无'),(1244,'no2',400,'ug/m³','2023-03-01 22:20:34','无'),(1245,'no2',400,'ug/m³','2023-03-01 22:21:34','无'),(1246,'no2',400,'ug/m³','2023-03-01 22:22:34','无'),(1247,'no2',400,'ug/m³','2023-03-01 22:23:35','无'),(1248,'no2',400,'ug/m³','2023-03-01 22:24:35','无'),(1249,'no2',400,'ug/m³','2023-03-01 22:25:35','无'),(1250,'no2',400,'ug/m³','2023-03-01 22:26:36','无'),(1251,'no2',400,'ug/m³','2023-03-01 22:27:36','无'),(1252,'no2',400,'ug/m³','2023-03-01 22:28:37','无'),(1253,'no2',400,'ug/m³','2023-03-01 22:29:37','无'),(1254,'no2',400,'ug/m³','2023-03-01 22:30:37','无'),(1255,'no2',400,'ug/m³','2023-03-01 22:31:37','无'),(1256,'no2',400,'ug/m³','2023-03-01 22:32:38','无'),(1257,'no2',400,'ug/m³','2023-03-01 22:33:38','无'),(1258,'no2',400,'ug/m³','2023-03-01 22:34:38','无'),(1259,'no2',400,'ug/m³','2023-03-01 22:34:53','无'),(1260,'no2',400,'ug/m³','2023-03-01 22:35:53','无'),(1261,'no2',400,'ug/m³','2023-03-01 22:36:54','无'),(1262,'no2',400,'ug/m³','2023-03-01 22:37:54','无'),(1263,'no2',400,'ug/m³','2023-03-01 22:38:54','无'),(1264,'no2',400,'ug/m³','2023-03-01 22:39:55','无'),(1265,'no2',400,'ug/m³','2023-03-01 22:40:55','无'),(1266,'no2',400,'ug/m³','2023-03-01 22:41:55','无'),(1267,'no2',400,'ug/m³','2023-03-01 22:42:56','无'),(1268,'no2',400,'ug/m³','2023-03-01 22:43:56','无'),(1269,'no2',400,'ug/m³','2023-03-01 22:44:56','无'),(1270,'no2',400,'ug/m³','2023-03-01 22:45:57','无'),(1271,'no2',400,'ug/m³','2023-03-01 22:46:57','无'),(1272,'no2',400,'ug/m³','2023-03-01 22:47:57','无'),(1273,'no2',400,'ug/m³','2023-03-01 22:48:58','无'),(1274,'no2',400,'ug/m³','2023-03-01 22:49:58','无'),(1275,'no2',400,'ug/m³','2023-03-01 22:50:58','无'),(1276,'no2',400,'ug/m³','2023-03-01 22:51:59','无'),(1277,'no2',400,'ug/m³','2023-03-01 22:52:08','无'),(1278,'no2',400,'ug/m³','2023-03-01 22:53:07','无'),(1279,'no2',400,'ug/m³','2023-03-01 22:53:46','无'),(1280,'no2',400,'ug/m³','2023-03-01 22:54:47','无'),(1281,'no2',400,'ug/m³','2023-03-01 22:55:24','无'),(1282,'no2',400,'ug/m³','2023-03-01 22:56:25','无'),(1283,'no2',400,'ug/m³','2023-03-01 22:57:25','无'),(1284,'no2',400,'ug/m³','2023-03-01 22:58:25','无'),(1285,'no2',400,'ug/m³','2023-03-01 22:59:25','无'),(1286,'no2',400,'ug/m³','2023-03-01 23:00:26','无'),(1287,'no2',400,'ug/m³','2023-03-01 23:01:26','无'),(1288,'no2',400,'ug/m³','2023-03-01 23:02:26','无'),(1289,'no2',400,'ug/m³','2023-03-01 23:03:26','无'),(1290,'no2',400,'ug/m³','2023-03-01 23:04:26','无'),(1291,'no2',400,'ug/m³','2023-03-01 23:05:27','无'),(1292,'no2',400,'ug/m³','2023-03-01 23:06:27','无'),(1293,'no2',400,'ug/m³','2023-03-01 23:07:27','无'),(1294,'no2',400,'ug/m³','2023-03-01 23:08:28','无'),(1295,'no2',400,'ug/m³','2023-03-01 23:09:28','无'),(1296,'no2',400,'ug/m³','2023-03-01 23:10:28','无'),(1297,'no2',400,'ug/m³','2023-03-01 23:11:28','无'),(1298,'no2',400,'ug/m³','2023-03-01 23:12:29','无'),(1299,'no2',400,'ug/m³','2023-03-01 23:13:29','无'),(1300,'no2',400,'ug/m³','2023-03-01 23:14:29','无'),(1301,'no2',400,'ug/m³','2023-03-01 23:15:29','无'),(1302,'no2',400,'ug/m³','2023-03-01 23:16:30','无'),(1303,'no2',400,'ug/m³','2023-03-01 23:17:30','无'),(1304,'no2',400,'ug/m³','2023-03-01 23:18:30','无'),(1305,'no2',400,'ug/m³','2023-03-01 23:19:30','无'),(1306,'no2',400,'ug/m³','2023-03-01 23:20:30','无'),(1307,'no2',400,'ug/m³','2023-03-01 23:21:31','无'),(1308,'no2',400,'ug/m³','2023-03-01 23:22:31','无'),(1309,'no2',400,'ug/m³','2023-03-01 23:23:31','无'),(1310,'no2',400,'ug/m³','2023-03-01 23:24:31','无'),(1311,'no2',400,'ug/m³','2023-03-01 23:24:56','无'),(1312,'no2',400,'ug/m³','2023-03-01 23:25:56','无'),(1313,'no2',400,'ug/m³','2023-03-01 23:26:42','无'),(1314,'no2',400,'ug/m³','2023-03-01 23:27:43','无'),(1315,'no2',400,'ug/m³','2023-03-01 23:28:43','无'),(1316,'no2',400,'ug/m³','2023-03-01 23:29:43','无'),(1317,'no2',400,'ug/m³','2023-03-01 23:30:43','无'),(1318,'no2',400,'ug/m³','2023-03-01 23:31:12','无'),(1319,'no2',400,'ug/m³','2023-03-01 23:32:12','无'),(1320,'no2',400,'ug/m³','2023-03-01 23:33:13','无'),(1321,'no2',400,'ug/m³','2023-03-01 23:34:13','无'),(1322,'no2',400,'ug/m³','2023-03-01 23:35:13','无'),(1323,'no2',400,'ug/m³','2023-03-01 23:36:13','无'),(1324,'no2',400,'ug/m³','2023-03-01 23:36:24','无'),(1325,'no2',400,'ug/m³','2023-03-01 23:37:24','无'),(1326,'no2',400,'ug/m³','2023-03-01 23:38:25','无'),(1327,'no2',400,'ug/m³','2023-03-01 23:38:58','无'),(1328,'no2',400,'ug/m³','2023-03-01 23:39:24','无'),(1329,'no2',400,'ug/m³','2023-03-01 23:40:25','无'),(1330,'no2',400,'ug/m³','2023-03-01 23:41:25','无'),(1331,'no2',400,'ug/m³','2023-03-01 23:42:25','无'),(1332,'no2',400,'ug/m³','2023-03-01 23:43:26','无'),(1333,'no2',400,'ug/m³','2023-03-01 23:44:26','无'),(1334,'no2',400,'ug/m³','2023-03-01 23:45:26','无'),(1335,'no2',400,'ug/m³','2023-03-01 23:46:26','无'),(1336,'no2',400,'ug/m³','2023-03-01 23:47:27','无'),(1337,'no2',400,'ug/m³','2023-03-01 23:48:27','无'),(1338,'no2',400,'ug/m³','2023-03-01 23:49:27','无'),(1339,'no2',400,'ug/m³','2023-03-01 23:50:28','无'),(1340,'no2',400,'ug/m³','2023-03-01 23:51:28','无'),(1341,'no2',400,'ug/m³','2023-03-01 23:52:29','无'),(1342,'no2',400,'ug/m³','2023-03-01 23:53:29','无'),(1343,'no2',400,'ug/m³','2023-03-01 23:54:29','无'),(1344,'no2',400,'ug/m³','2023-03-01 23:55:23','无'),(1345,'no2',400,'ug/m³','2023-03-01 23:56:23','无'),(1346,'no2',400,'ug/m³','2023-03-01 23:57:23','无'),(1347,'no2',400,'ug/m³','2023-03-01 23:58:24','无'),(1348,'no2',400,'ug/m³','2023-03-01 23:59:24','无'),(1349,'no2',400,'ug/m³','2023-03-02 00:00:24','无'),(1350,'no2',400,'ug/m³','2023-03-02 00:01:25','无');
/*!40000 ALTER TABLE `no2` ENABLE KEYS */;
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
