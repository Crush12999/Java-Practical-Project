# 简单的图书管理微服务

## 模块划分

- 登录验证服务：用于处理用户注册、登录、密码重置等，反正就是一切与账户相关的内容，包括用户信息获取等。
- 图书管理服务：用于进行图书添加、删除、更新等操作，图书管理相关的服务，包括图书的存储等和信息获取。
- 图书借阅服务：交互性比较强的服务，需要和登陆验证服务和图书管理服务进行交互。