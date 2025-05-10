# FeeTalk 🍑💬

FeeTalk 是一个基于 Spring Boot 和 WebSocket 构建的即时通讯系统，支持用户注册、登录、好友管理、实时聊天等功能，致力于提供一个轻量、高效、安全的聊天体验。

## ✨ 项目亮点

- 🚀 **实时通信**：基于 WebSocket 实现消息即时收发
- 🔐 **安全认证**：使用 Spring Security + JWT 实现登录验证与权限控制
- 🧩 **模块清晰**：遵循分层架构，便于后续功能扩展
- 🛢 **数据持久化**：采用 PostgreSQL + Spring Data JPA 进行数据管理
- 🌐 **RESTful 接口**：前后端分离，接口设计规范清晰

## 🛠 技术栈

- 后端框架：Spring Boot  
- 通信协议：WebSocket  
- 安全机制：Spring Security + JWT  
- 数据库：PostgreSQL  
- ORM：Spring Data JPA  
- 构建工具：Maven  
- 前端（待开发）：Vue.js 或 React

## 🗂 项目结构

feetalk/
├── src/
│ ├── main/
│ │ ├── java/com/feetalk/ # Java 源码目录
│ │ │ ├── controller/ # 控制器
│ │ │ ├── model/ # 实体类
│ │ │ ├── repository/ # 数据访问
│ │ │ ├── security/ # 安全配置
│ │ │ └── service/ # 业务逻辑
│ │ └── resources/
│ │ ├── application.yml # 配置文件
│ │ ├── static/ # 静态资源
│ │ └── templates/ # 模板文件
└── pom.xml # Maven 构建文件

## 📌 TODO（后续规划）

- 好友管理与请求  
- 群聊功能与权限控制  
- 消息已读未读状态  
- 前端聊天页面 UI  
- 消息离线推送  


---

**作者**：FranklinTJU  
