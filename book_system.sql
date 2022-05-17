/*
 Navicat Premium Data Transfer

 Source Server         : root
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : book_system

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 17/05/2022 22:22:38
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for db_book
-- ----------------------------
DROP TABLE IF EXISTS `db_book`;
CREATE TABLE `db_book` (
  `bid` int(11) NOT NULL AUTO_INCREMENT COMMENT '图书id',
  `title` varchar(255) NOT NULL COMMENT '图书名',
  `desc` varchar(255) NOT NULL COMMENT '图书简介',
  PRIMARY KEY (`bid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of db_book
-- ----------------------------
BEGIN;
INSERT INTO `db_book` VALUES (1, '深入理解Java虚拟机', '了解Java的底层运作机制');
INSERT INTO `db_book` VALUES (2, 'Java并发编程的艺术', '了解并发编程的高级玩法');
INSERT INTO `db_book` VALUES (3, 'Redis的设计与实现', '了解Redis的底层设计');
COMMIT;

-- ----------------------------
-- Table structure for db_borrow
-- ----------------------------
DROP TABLE IF EXISTS `db_borrow`;
CREATE TABLE `db_borrow` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '借阅id',
  `uid` int(11) NOT NULL COMMENT '借阅者id',
  `bid` int(11) NOT NULL COMMENT '借阅图书id',
  PRIMARY KEY (`id`),
  UNIQUE KEY `unique_uid_bid` (`uid`,`bid`) USING BTREE,
  KEY `fk_bid` (`bid`),
  CONSTRAINT `fk_bid` FOREIGN KEY (`bid`) REFERENCES `db_book` (`bid`),
  CONSTRAINT `fk_uid` FOREIGN KEY (`uid`) REFERENCES `db_user` (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of db_borrow
-- ----------------------------
BEGIN;
INSERT INTO `db_borrow` VALUES (1, 1, 1);
INSERT INTO `db_borrow` VALUES (2, 1, 2);
INSERT INTO `db_borrow` VALUES (3, 1, 3);
INSERT INTO `db_borrow` VALUES (4, 2, 2);
COMMIT;

-- ----------------------------
-- Table structure for db_user
-- ----------------------------
DROP TABLE IF EXISTS `db_user`;
CREATE TABLE `db_user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `name` varchar(20) NOT NULL COMMENT '用户名',
  `age` int(3) NOT NULL COMMENT '年龄',
  `sex` enum('男','女','未知') DEFAULT '男' COMMENT '性别',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of db_user
-- ----------------------------
BEGIN;
INSERT INTO `db_user` VALUES (1, '张三', 18, '男');
INSERT INTO `db_user` VALUES (2, '李四', 20, '男');
INSERT INTO `db_user` VALUES (3, '小红', 18, '女');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
