/*
 Navicat Premium Data Transfer

 Source Server         : Firstsnow
 Source Server Type    : MySQL
 Source Server Version : 80032 (8.0.32)
 Source Host           : localhost:3306
 Source Schema         : jdbc

 Target Server Type    : MySQL
 Target Server Version : 80032 (8.0.32)
 File Encoding         : 65001

 Date: 26/09/2023 01:49:27
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `book` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `plane` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `date` date NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1006 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES (1001, '格列夫游记', '乔纳森·斯威夫特', '38元', '2022-12-17');
INSERT INTO `book` VALUES (1002, '朝花夕拾', '周树人', '36元', '2022-12-17');
INSERT INTO `book` VALUES (1003, '一千零一夜', '安徒生', '22', '2022-12-18');
INSERT INTO `book` VALUES (1004, '繁星~春水', 'vnsdiif', '215611564', NULL);
INSERT INTO `book` VALUES (1005, '繁星春水', 'vnsdiif', '215611564', NULL);

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(40) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `password` varchar(40) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `email` varchar(60) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `birthday` date NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, 'Lucy', '12345', '123321@qq.com', '1990-02-12');
INSERT INTO `users` VALUES (2, 'Bob', '123', '112233@qq.com', '1991-02-23');
INSERT INTO `users` VALUES (3, 'Lilly', 'abc', '123321@qq.com', '1986-12-20');
INSERT INTO `users` VALUES (6, 'kk', '123456', '1234321@123.com', '2003-03-23');

SET FOREIGN_KEY_CHECKS = 1;
