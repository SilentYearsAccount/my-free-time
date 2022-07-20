/*
 Navicat Premium Data Transfer

 Source Server         :
 Source Server Type    : MySQL
 Source Server Version : 80027
 Source Host           :
 Source Schema         : freetime

 Target Server Type    : MySQL
 Target Server Version : 80027
 File Encoding         : 65001

 Date: 25/05/2022 15:02:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for daily_task
-- ----------------------------
DROP TABLE IF EXISTS `daily_task`;
CREATE TABLE `daily_task` (
   `id` int NOT NULL AUTO_INCREMENT,
   `task_info` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '任务信息',
   `is_finish` tinyint DEFAULT '0' COMMENT '是否完成',
   `create_time` date DEFAULT NULL COMMENT '创建时间',
   `finish_time` date DEFAULT NULL,
   PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;
-- ----------------------------
-- Records of daily_task
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
