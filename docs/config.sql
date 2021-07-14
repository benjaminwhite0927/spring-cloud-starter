/*
 Navicat Premium Data Transfer

 Source Server         : 192.168.126.16
 Source Server Type    : MySQL
 Source Server Version : 50734
 Source Host           : 192.168.126.16:3306
 Source Schema         : config

 Target Server Type    : MySQL
 Target Server Version : 50734
 File Encoding         : 65001

 Date: 14/07/2021 13:51:18
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for PROPERTIES
-- ----------------------------
DROP TABLE IF EXISTS `PROPERTIES`;
CREATE TABLE `PROPERTIES`  (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `I_KEY` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `I_VALUE` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `APPLICATION` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `PROFILE` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `LABEL` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of PROPERTIES
-- ----------------------------
INSERT INTO `PROPERTIES` VALUES (1, 'item_url', 'localhost', 'product-service', 'dev', 'master');

SET FOREIGN_KEY_CHECKS = 1;
