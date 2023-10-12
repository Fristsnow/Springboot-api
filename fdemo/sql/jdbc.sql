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

 Date: 12/10/2023 21:09:02
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
) ENGINE = InnoDB AUTO_INCREMENT = 1012 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES (1001, '格列夫游记', '乔纳森·斯威夫特', '38元', '2022-12-17');
INSERT INTO `book` VALUES (1002, '朝花夕拾', '周树人', '36元', '2022-12-17');
INSERT INTO `book` VALUES (1003, '一千零一夜', '安徒生', '22', '2022-12-18');
INSERT INTO `book` VALUES (1004, '繁星~春水', 'vnsdiif', '215611564', NULL);
INSERT INTO `book` VALUES (1006, '你好世界', 'my', '99', NULL);
INSERT INTO `book` VALUES (1007, '格林童话', '你猜', '9999', NULL);
INSERT INTO `book` VALUES (1008, '113', '1321', '123', NULL);
INSERT INTO `book` VALUES (1009, '1', '1', '12', NULL);
INSERT INTO `book` VALUES (1010, '', '', '', NULL);
INSERT INTO `book` VALUES (1011, '', '', '', NULL);

-- ----------------------------
-- Table structure for informations
-- ----------------------------
DROP TABLE IF EXISTS `informations`;
CREATE TABLE `informations`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '资讯id\r\n',
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '资讯标题',
  `content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '资讯内容',
  `replyCount` int NOT NULL COMMENT '回复次数',
  `viewCount` int NOT NULL COMMENT '查看次数',
  `reportTime` datetime NOT NULL COMMENT '发表时间',
  `lastPostTime` datetime NOT NULL COMMENT '最后回复时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of informations
-- ----------------------------
INSERT INTO `informations` VALUES (1, 'Android开发者预览版可以免费下载了', 'Android开发者预览版可以免费下载了，有想尝鲜的机友赶快行动吧！！！', 1, 6, '2023-10-09 14:59:42', '2023-10-09 14:59:47');
INSERT INTO `informations` VALUES (2, 'Android开发者预览版可以免费下载了', 'Android开发者预览版可以免费下载了，有想尝鲜的机友赶快行动吧！！！', 3, 6, '2023-10-09 14:59:42', '2023-10-09 14:59:47');
INSERT INTO `informations` VALUES (3, 'Android开发者预览版可以免费下载了', 'Android开发者预览版可以免费下载了，有想尝鲜的机友赶快行动吧！！！', 2, 6, '2023-10-09 14:59:42', '2023-10-09 14:59:47');
INSERT INTO `informations` VALUES (4, 'Android开发者预览版可以免费下载了', 'Android开发者预览版可以免费下载了，有想尝鲜的机友赶快行动吧！！！', 1, 6, '2023-10-09 14:59:42', '2023-10-09 14:59:47');
INSERT INTO `informations` VALUES (5, 'Android开发者预览版可以免费下载了', 'Android开发者预览版可以免费下载了，有想尝鲜的机友赶快行动吧！！！', 1, 6, '2023-10-09 14:59:42', '2023-10-09 14:59:47');
INSERT INTO `informations` VALUES (6, 'Android开发者预览版可以免费下载了', 'Android开发者预览版可以免费下载了，有想尝鲜的机友赶快行动吧！！！', 1, 6, '2023-10-09 14:59:42', '2023-10-09 14:59:47');
INSERT INTO `informations` VALUES (7, 'Android开发者预览版可以免费下载了', 'Android开发者预览版可以免费下载了，有想尝鲜的机友赶快行动吧！！！', 1, 6, '2023-10-09 14:59:42', '2023-10-09 14:59:47');
INSERT INTO `informations` VALUES (8, 'Android开发者预览版可以免费下载了', 'Android开发者预览版可以免费下载了，有想尝鲜的机友赶快行动吧！！！', 1, 6, '2023-10-09 14:59:42', '2023-10-09 14:59:47');

-- ----------------------------
-- Table structure for replies
-- ----------------------------
DROP TABLE IF EXISTS `replies`;
CREATE TABLE `replies`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '回复id',
  `content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '回复内容',
  `replyTime` datetime NOT NULL COMMENT '回复时间',
  `infoId` int NOT NULL COMMENT '资讯id',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `infoId`(`infoId` ASC) USING BTREE,
  CONSTRAINT `infoId` FOREIGN KEY (`infoId`) REFERENCES `informations` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of replies
-- ----------------------------
INSERT INTO `replies` VALUES (1, 'nfhadbvo', '2023-10-09 16:14:20', 1);
INSERT INTO `replies` VALUES (2, 'cadnvandv', '2023-10-09 16:14:35', 3);
INSERT INTO `replies` VALUES (3, 'caibhvdoabvbd', '2023-10-10 00:00:00', 3);
INSERT INTO `replies` VALUES (4, 'caibhvdoabvbd', '2023-10-10 00:00:00', 3);
INSERT INTO `replies` VALUES (5, 'caibhvdoabvbd', '2023-10-10 00:00:00', 3);
INSERT INTO `replies` VALUES (6, 'caibhvdoabvbd', '2023-10-10 00:00:00', 3);

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
  PRIMARY KEY (`id`, `name`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 22 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, 'Lucy', '123456c', '123321@qq.com', '1990-02-12');
INSERT INTO `users` VALUES (3, 'Lilly', 'abcabc', '123321@qq.com', '1986-12-20');
INSERT INTO `users` VALUES (6, 'Tome', '123456', '1234321@123.com', '2003-03-23');
INSERT INTO `users` VALUES (7, 'Tom2', '123456', 'tom2@tom2.com', '2020-12-03');
INSERT INTO `users` VALUES (9, 'Tom1', '123456', 'tom@123.com', '2020-12-03');
INSERT INTO `users` VALUES (10, 'Toms', '123456', 'tom22@123.com', '2020-12-05');
INSERT INTO `users` VALUES (15, 'Tomsq', '123456', 'tom222@123.com', '2020-12-05');
INSERT INTO `users` VALUES (17, 'Tom', '123456', 'tom2@tom2.com', '2020-12-05');
INSERT INTO `users` VALUES (18, 'Tooooom', '123456', 'tom@1223.com', '2020-12-05');
INSERT INTO `users` VALUES (20, 'fgasdfh', '123456', 'kk@ad.com', '2023-10-11');
INSERT INTO `users` VALUES (21, '2rzdfvdfg', '123456', 'kk@sad.com', '2023-10-11');

SET FOREIGN_KEY_CHECKS = 1;
