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
-- Current Database: `damon`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `damon` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */;

USE `damon`;

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
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-11 15:15:20
