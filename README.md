#### 微服务版本项目地址
- https://gitee.com/zhuimengshaonian/education-cloud
#### 后端技术栈
   
- 基于 SpringBoot + Mybatis Plus+ Shiro + mysql + redis构建的智慧云智能教育平台 
- 基于数据驱动视图的理念封装 element-ui，即使没有 vue 的使用经验也能快速上手  
- 提供 lambda 、stream api 、webflux 的生产实践  
- 集成shardingsphere， 支持mysql 数据库读写分离（详情请见V1.0.2升级版）
- 集成阿里巴巴数据同步中间件Canal，可用于mysql 与其他类型数据库进行数据实时同步
#### 前端技术

- Vue
- Vuex
- Vxe-Table (文档地址：https://gitee.com/xuliangzhan_admin/vxe-table)
- Element-UI
- vue-router
- axios 

#### 核心依赖 


依赖 | 版本
---|---
Spring Boot |  2.2.5.RELEASE  
Mybatis Plus | 3.4.0  
Mysql | 5.7
Element-UI | 2.13.0
Shiro | 1.4.0
Jfinal Weixin | 2.3
Canal | 1.1.4
shardingsphere| 3.1.0.M1

### 系统特色

- 支持填空题、综合题、选择题等多种试题类型的录入
- 支持数学公式的插入同时也支持通过excel 导入试题
- 支持系统自动评分、教师后台批阅学员试卷
- 可以将试卷试题导出word或者html,并且支持试题图片导出word
- 集成了百度地图和百度富文本编辑器

### 视频教程地址

- 学生端管理后台  https://haokan.baidu.com/v?pd=bjh&vid=16055556239765271034&fr=bjhauthor&type=video
- 学生端项目教程  https://haokan.baidu.com/v?pd=bjh&vid=13279860213867889185&fr=bjhauthor&type=video
- 完整项目实战教程 （https://www.51zxw.net/list.aspx?cid=830）
### 项目演示地址

- 管理后台  http://120.79.144.34:8002/ （admin 123456）
- 学生端  http://120.79.144.34 （student 123456）
- h5、小程序、app预览  http://120.79.144.34:8002:8003

###  模块说明


```
- education
- ├── education-api -- 系统api模块
- └── education-common -- 系统公共模块 
- └── education-business -- 系统业务模块
- └── education-canal-- canal数据同步模块
- └── education-common-api -- 系统公共api模块
- ├── education-model -- 实体类模块	
```
### 智慧云智能教育系统管理平台
- 项目源码地址：  https://gitee.com/zhuimengshaonian/wisdom-education-admin-front
- 功能模块：系统首页、教育教学模块、考试管理模块、统计分析模块、系统设置模块
- 试题管理：支持excel模板导入试题、支持使用富文本编辑试题及插入数学公式，同时还支持上传试题教学视频
- 试卷管理：支持将试卷导出成word文档、html页面进行打印、支持富文本图片导出到word
- 试卷批改功能：支持教师后台批改试卷，主观题系统自动评分、非主观题由教师评分、错题可设置添加到学员错题本
- RBCA权限管理：主要包括用户、角色、权限

### 智慧云智能教育平台学生端
- 项目源码地址：  https://gitee.com/zhuimengshaonian/wisdom-education-front
- 功能模块：学员在线做课程试题、在线考试、错题本功能记录、考试记录、个人中心

### 小程序及app
 - 项目源码地址：  https://gitee.com/zhuimengshaonian/education-app (功能开发中，敬请期待。。。)
![输入图片说明](https://images.gitee.com/uploads/images/2020/1221/154809_080680e2_1526010.jpeg "QQ图片20201221154646.jpg")
![输入图片说明](https://images.gitee.com/uploads/images/2020/1221/154818_7c275efc_1526010.jpeg "QQ图片20201221154703.jpg")
![输入图片说明](https://images.gitee.com/uploads/images/2020/1221/154831_32f292e7_1526010.jpeg "QQ图片20201221154716.jpg")
![输入图片说明](https://images.gitee.com/uploads/images/2020/1221/154841_0159e6bd_1526010.jpeg "QQ图片20201221154724.jpg")
![输入图片说明](https://images.gitee.com/uploads/images/2020/1221/154850_46395ade_1526010.jpeg "QQ图片20201221154729.jpg")
### 智慧云智能教育系统交流群（加群获取项目正式部署教程和免费视频教程）

 -  **QQ交流群1 1072042422（已满勿加）** (加群请备注码云，否则拒绝入群）
 -  **QQ交流群2 930422806** (加群请备注码云，否则拒绝入群）
 -  **作者QQ 1913188966** 

### 参与贡献

- Fork 本仓库
- 感谢大家关注，点赞，Fork，项目持续更新中，欢迎各位提出意见和建议
- 各位伙伴的star一下就是对我最大的鼓励


#### 项目运行截图 
![输入图片说明](https://images.gitee.com/uploads/images/2020/0425/115112_1eb8a6e7_1526010.png "}CI9A4HDZZAC3%M`N}JL`77.png")
![输入图片说明](https://images.gitee.com/uploads/images/2020/0311/194825_34662cb0_1526010.png "]06ZXGQ[2~7S3_28H5XZD}9.png")
![输入图片说明](https://images.gitee.com/uploads/images/2020/0311/194921_bd7bc565_1526010.png "_QG(`5{@F690KF[O$ECXBVU.png")
![输入图片说明](https://images.gitee.com/uploads/images/2020/0311/194934_9d82c452_1526010.png "0UX7[[}L@8`9QVG~1JZRJ73.png")
![输入图片说明](https://images.gitee.com/uploads/images/2020/0311/194945_3b2ed607_1526010.png "P67Y6%0X}FR~2$KSG7RZXBO.png")![输入图片说明](https://images.gitee.com/uploads/images/2020/0602/171042_d498a547_1526010.jpeg "1591088933(1).jpg")
![输入图片说明](https://images.gitee.com/uploads/images/2020/1210/200612_cbd7f027_1526010.png "I2O]CD)]]5ATJ170~PODL]N.png")
![输入图片说明](https://images.gitee.com/uploads/images/2020/1210/200737_335b320c_1526010.png "6$O6RPZ5U(OWZ~MFE42GAKF.png")
```


