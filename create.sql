/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.5.63-MariaDB : Database - demo
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`demo` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `demo`;

/*Table structure for table `clxyjh` */

DROP TABLE IF EXISTS `clxyjh`;

CREATE TABLE `clxyjh` (
  `id` decimal(10,0) NOT NULL,
  `code` varchar(100) DEFAULT NULL,
  `bizDate` datetime DEFAULT NULL,
  `JHLX` int(1) DEFAULT NULL,
  `remark` varchar(8000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `clxyjh` */

insert  into `clxyjh`(`id`,`code`,`bizDate`,`JHLX`,`remark`) values (1,'xxx','2019-02-10 21:29:19',0,'gggg');

/*Table structure for table `clxyjhclmx` */

DROP TABLE IF EXISTS `clxyjhclmx`;

CREATE TABLE `clxyjhclmx` (
  `id` decimal(10,0) NOT NULL,
  `clxyjhid` decimal(10,0) DEFAULT NULL,
  `clzdid` decimal(10,0) DEFAULT NULL,
  `DW` varchar(100) DEFAULT NULL,
  `BWMCID` decimal(10,0) DEFAULT NULL,
  `BWMC` decimal(10,0) DEFAULT NULL,
  `BWMCFULLDesc` varchar(2000) DEFAULT NULL,
  `JHL` decimal(20,5) DEFAULT NULL,
  `JHRQ` datetime DEFAULT NULL,
  `ZLYQ` varchar(2000) DEFAULT NULL,
  `PP` varchar(100) DEFAULT NULL,
  `GHDD` varchar(2000) DEFAULT NULL,
  `remark` varchar(8000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `clxyjhclmx` */

insert  into `clxyjhclmx`(`id`,`clxyjhid`,`clzdid`,`DW`,`BWMCID`,`BWMC`,`BWMCFULLDesc`,`JHL`,`JHRQ`,`ZLYQ`,`PP`,`GHDD`,`remark`) values (1,1,NULL,NULL,NULL,NULL,NULL,100.00000,'2019-02-10 21:29:59',NULL,NULL,'ddd',NULL),(2,1,NULL,NULL,NULL,NULL,NULL,200.00000,'2019-02-10 21:30:52',NULL,NULL,NULL,NULL);

/*Table structure for table `clzd` */

DROP TABLE IF EXISTS `clzd`;

CREATE TABLE `clzd` (
  `id` decimal(10,0) NOT NULL,
  `code` varchar(1000) DEFAULT NULL,
  `name` varchar(1000) DEFAULT NULL,
  `guige` varchar(1000) DEFAULT NULL,
  `xinghao` varchar(1000) DEFAULT NULL,
  `caizhi` varchar(1000) DEFAULT NULL,
  `DW` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `clzd` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `name` varchar(256) DEFAULT NULL,
  `sex` int(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`name`,`sex`) values (1,'x11',0);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
