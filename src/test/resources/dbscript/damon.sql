-- MySQL dump 10.13  Distrib 5.7.22, for Linux (x86_64)
--
-- Host: localhost    Database: damon
-- ------------------------------------------------------
-- Server version	5.7.22

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
-- Table structure for table `article`
--

DROP TABLE IF EXISTS `article`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `article` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `article_title` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '文章标题',
  `article_create_date` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '创建时间',
  `article_content` text COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '文章内容',
  `top_type` tinyint(4) NOT NULL DEFAULT '0' COMMENT '1:置顶',
  `add_name` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '添加人',
  `gmt_create` datetime NOT NULL COMMENT '记录创建时间',
  `gmt_modified` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '记录修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='文章表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `article`
--

LOCK TABLES `article` WRITE;
/*!40000 ALTER TABLE `article` DISABLE KEYS */;
/*!40000 ALTER TABLE `article` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `book` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `isbn` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'ISBN码',
  `front_cover` varchar(150) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '封面',
  `title` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '书名',
  `subtitle` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '简写书名',
  `original_price` decimal(8,4) NOT NULL DEFAULT '0.0000' COMMENT '原价 单位：元',
  `market_price` decimal(8,4) NOT NULL DEFAULT '0.0000' COMMENT '市场价 单位：元',
  `introduction` text COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '简介',
  `binding_type` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '装订方式',
  `pages` int(11) NOT NULL DEFAULT '0' COMMENT '页码',
  `author` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '作者',
  `publisher` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '出版社',
  `catalog` text COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '目录',
  `supply` int(11) NOT NULL DEFAULT '0' COMMENT '库存',
  `book_status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '1:上架',
  `hot` int(11) NOT NULL DEFAULT '0' COMMENT '书籍热度',
  `gmt_create` datetime NOT NULL COMMENT '记录创建时间',
  `gmt_modified` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '记录修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='书籍表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES (1,'9787511512970','images/nocover.jpg','中公教育·吉林省公务员录用考试专用教材','中公教育·吉林省公务员录用考试专用教材',99.9900,99.0000,'中公教育吉林省公务员录用考试专用教材:终极押密试卷(乙)(2012新大纲)》严格依据2012年最新国家公务员考试大纲权威命制，内含4套行政职业能力测验押密试卷、4套申论押密试卷。荟萃数十位名师绝密押题，试题设置科学，题型全面；答案解析准确、考点清晰、讲解透彻。试卷后附有国家公务员考试标准答题纸（答题卡），帮助考生培养考试习惯，快速熟悉考场氛围。专为考生短期突破精心打造，多年来以其极高的国考真题命中率而为考生广泛推崇。','胶装',152,'李永新','人民日报出版社','吉林省公务员录用考试《行政职业能力测验》（乙）终极押密试卷（一）吉林省公务员录用考试《行政职业能力测验》（乙）终极押密试卷（二）吉林省公务员录用考试《行政职业能力测验》（乙）终极押密试卷（三）吉林省公务员录用考试《行政职业能力测验》（乙）终极押密试卷（四）吉林省公务员录用考试《行政职业能力测验》（乙）终极押密试卷（五）吉林省公务员录用考试《行政职业能力测验》（乙）终极押密试卷（六）',1000,1,2,'2018-06-01 17:10:24','2018-06-01 17:10:26'),(2,'9787508498539','images/nocover.jpg','微型计算机原理与接口技术','微型计算机原理与接口技术',45.9900,45.0000,'微型计算机原理与接口技术，ISBN：9787508498539，作者：何超 主编','胶装',428,'何超新','水利水电出版社','材料成型概论目录',999,1,2,'2018-06-01 17:10:24','2018-06-01 17:10:26'),(3,'9787302290728','images/nocover.jpg','材料成型概论','材料成型概论',29.9900,29.0000,'《普通高等教育机电工程类应用型本科规划教材:材料成型概论》为普通高等教育机电工程类应用型本科规划教材，主要内容包括：材料成型专业概况和涉及的技术领域、金属液态成形、金属塑性成形、金属焊接成形、非金属材料成型和快速原型制造等。通过《普通高等教育机电工程类应用型本科规划教材:材料成型概论》的学习可以使读者全面了解材料成形技术的概貌，为专业课程学习和专业实践打下良好基础。','胶装',229,'余世浩','清华大学出版社','第1章 概述1.1 材料成型专业及研究内容1.2 材料成形在国民经济中的作用1.3 材料成形工艺的分类与特点1.4 材料成型及控制工程专业的人才培养模式1.5 材料成形技术的发展趋势习题与思考题第2章 金属液态成形2.1 金属液态成形基础2.1.1 液态金属的充型能力2.1.2 液态金属的凝固与收缩2.1.3 合金的吸气性及气孔2.2 铸造合金及熔炼2.2.1 常用铸造合金2.2.2 铸铁及其熔炼2.2.3 铸钢及其熔炼2.2.4 非铁铸造合金及其熔炼2.3 砂型铸造2.3.1 砂型铸造的工艺流程2.3.2 型砂、芯砂2.3.3 型（芯）砂的配制2.3.4 砂型制造2.3.5 砂芯制造2.3.6 造型生产线2.4 特种铸造2.4.1 熔模铸造2.4.2 金属型铸造2.4.3 压力铸造2.4.4 低压铸造2.4.5 离心铸造2.5 近代液态成形技术2.5.1 半固态成形技术2.5.2 电磁铸造2.5.3 喷射铸造2.5.4 计算机技术在铸造工程中的应用习题与思考题第3章 金属塑性成形3.1 金属塑性成形基础3.1.1 金属的塑性成形性能3.1.2 金属的塑性变形规律3.1.3 塑性变形对金属组织与性能的影响3.2 冲压成形3.2.1 概述3.2.2 冲裁工艺3.2.3 弯曲工艺3.2.4 拉伸工艺3.2.5 成形工艺3.3 锻造成形3.3.1 锻造成形工艺的分类3.3.2 自由锻3.3.3 模锻3.3.4 锻模3.4 其他塑性成形技术3.4.1 挤压成形3.4.2 超塑性成形3.4.3 精密冲裁3.4.4 无模多点成形3.4.5 轧制成形3.4.6 旋压3.4.7 摆动辗压3.4.8 粉末成形3.4.9 高速高能成形3.5 塑性成形设备3.5.1 机械压力机3.5.2 液压机3.5.3 螺旋压力机习题与思考题第4章 金属焊接成形4.1 焊接原理与工艺方法4.2 熔焊的工艺特点及应用4.2.1 电弧焊4.2.2 电渣焊4.2.3 激光焊接与切割4.2.4 气焊与气割4.2.5 电子束焊4.2.6 热剂焊4.3 压焊的工艺特点及应用4.3.1 电阻焊4.3.2 摩擦焊4.3.3 扩散焊4.3.4 焊4.3.5 超声波焊4.4 钎焊的工艺特点及应用4.4.1 概述4.4.2 浸渍钎焊4.4.3 电阻钎焊4.4.4 感应钎焊4.4.5 炉中钎焊4.4.6 其他钎焊方法4.5 焊接成形件的检验4.5.1 常见的焊接缺陷4.5.2 焊接检验方法习题与思考题第5章 非金属材料成型5.1 塑料成型5.1.1 塑料5.1.2 塑料成型工艺5.1.3 塑料模具介绍5.1.4 塑料成型设备5.2 橡胶成型5.2.1 橡胶材料的组成5.2.2 橡胶的性能与用途5.2.3 橡胶制品成型5.3 陶瓷成型5.3.1 陶瓷材料的组成与制备5.3.2 陶瓷的分类及性能5.3.3 陶瓷材料成型习题与思考题第6章 快速原型制造6.1 快速原型制造的原理6.2 快速成型工艺6.2.1 立体印刷成型6.2.2 层合实体制造6.2.3 选域激光烧结6.2.4 熔融沉积造型6.3 快速原型制造技术的应用6.3.1 原型制造6.3.2 模具制造6.3.3 模型制造6.3.4 零部件及工具制造6.4 快速原型制造技术的发展趋势习题与思考题参考文献',998,1,2,'2018-06-01 17:10:24','2018-06-01 17:10:26');
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `picture`
--

DROP TABLE IF EXISTS `picture`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `picture` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `path` varchar(512) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '图片地址',
  `type` tinyint(4) NOT NULL DEFAULT '1' COMMENT '图片类型',
  `target_url` varchar(512) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '目标地址',
  `grade` tinyint(4) NOT NULL COMMENT '图片评分',
  `gmt_create` datetime NOT NULL COMMENT '记录创建时间',
  `gmt_modified` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '记录修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='图片表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `picture`
--

LOCK TABLES `picture` WRITE;
/*!40000 ALTER TABLE `picture` DISABLE KEYS */;
INSERT INTO `picture` VALUES (1,'/tmp/zs.png',1,'https://img-blog.csdn.net/20180523141459552?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3VfYXNjZW5k/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70',1,'2018-06-04 14:11:48','2018-06-04 14:11:48');
/*!40000 ALTER TABLE `picture` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `test_student`
--

DROP TABLE IF EXISTS `test_student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `test_student` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_name` char(20) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '姓名',
  `age` tinyint(3) unsigned NOT NULL COMMENT '年龄',
  `gmt_create` datetime NOT NULL COMMENT '记录创建时间',
  `gmt_modified` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '记录修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='测试学生表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `test_student`
--

LOCK TABLES `test_student` WRITE;
/*!40000 ALTER TABLE `test_student` DISABLE KEYS */;
INSERT INTO `test_student` VALUES (1,'张三2',20,'2018-05-31 13:39:55','2018-06-01 17:02:43');
/*!40000 ALTER TABLE `test_student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_info`
--

DROP TABLE IF EXISTS `user_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
  `pass_word` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
  `role_name` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '系统管理员\n普通管理员',
  `gmt_create` datetime NOT NULL COMMENT '记录创建时间',
  `gmt_modified` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '记录修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='用户信息表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_info`
--

LOCK TABLES `user_info` WRITE;
/*!40000 ALTER TABLE `user_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_info` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-11 15:09:55
