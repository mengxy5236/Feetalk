
基于 Spring Boot 和 WebSocket 构建的即时通讯系统

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
