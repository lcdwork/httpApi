/*
 Navicat Premium Data Transfer

 Source Server         : 172.21.29.14_3306
 Source Server Type    : MySQL
 Source Server Version : 50724
 Source Host           : 172.21.29.14:3306
 Source Schema         : aganzhen

 Target Server Type    : MySQL
 Target Server Version : 50724
 File Encoding         : 65001

 Date: 24/03/2020 10:10:40
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for send_log
-- ----------------------------
DROP TABLE IF EXISTS `send_log`;
CREATE TABLE `send_log`  (
  `TABLE_NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ERR_CODE` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ERR_MSG` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ERR_DATA` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `SEND_SIZE` bigint(24) NULL DEFAULT NULL,
  `SEND_TIME` datetime(0) NULL DEFAULT NULL,
  `STATUS` smallint(6) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
