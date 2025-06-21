/*
Navicat MySQL Data Transfer

Source Server         : login
Source Server Version : 80037
Source Host           : localhost:3306
Source Database       : boot_test

Target Server Type    : MYSQL
Target Server Version : 80037
File Encoding         : 65001

Date: 2025-06-21 20:38:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for movie
-- ----------------------------
DROP TABLE IF EXISTS `movie`;
CREATE TABLE `movie` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '电影ID，自增主键',
  `moviename` varchar(100) NOT NULL COMMENT '电影名字，非空',
  `count` int NOT NULL DEFAULT '0' COMMENT '电影票数，非空，默认值为0',
  `deletestate` int NOT NULL DEFAULT '0' COMMENT '删除状态，0表示未删除，1表示已删除',
  `version` bigint NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='电影信息表';

-- ----------------------------
-- Records of movie
-- ----------------------------
INSERT INTO `movie` VALUES ('1', '复仇者联盟', '3', '0', '3');
INSERT INTO `movie` VALUES ('2', '超级蜘蛛侠', '100', '1', '1');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '用户ID（主键）',
  `username` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '登录用户名（唯一）',
  `password` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '密码（建议加密存储，如BCrypt）',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=1936323856901881858 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='系统用户表';

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'zhou', '1222221');
INSERT INTO `sys_user` VALUES ('2', 'li', '456');
INSERT INTO `sys_user` VALUES ('1936315606219415554', 'wang', '112233');
INSERT INTO `sys_user` VALUES ('1936316326435909634', 'zhao', '3333');
INSERT INTO `sys_user` VALUES ('1936317793750241281', 'gou', '33778');
INSERT INTO `sys_user` VALUES ('1936318577518858242', 'yang', '111222');
INSERT INTO `sys_user` VALUES ('1936323856901881857', 'zheng', '1222221');
