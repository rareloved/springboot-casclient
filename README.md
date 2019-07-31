# Getting Started
##框架特性
1、springboot
2、页面thymeleaf
3、数据持久层mybatis
4、集成shiro权限框架
5、集成cas单点登录

##使用
1、安装mysql库，建库castest
2、建表student
-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` varchar(64) NOT NULL DEFAULT '',
  `name` varchar(64) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `homeAddress` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '张三', '18', '河北省石家庄市桥西区');