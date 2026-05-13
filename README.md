# 迷你淘宝电商后端项目

一个基于 Spring Boot 的微型电商后端 Demo，实现了商品列表、商品详情、订单创建等基础接口。

## 技术栈
- Java 17
- Spring Boot 2.7.18
- Spring Data JPA
- H2 内存数据库

## 快速启动
1.  克隆项目到本地
2.  使用 IDEA 打开项目，等待 Maven 依赖加载完成
3.  运行 `MiniTaobaoApplication.java` 启动类
4.  访问接口：
    - 商品列表：`http://localhost:8080/api/product/list`
    - 商品详情：`http://localhost:8080/api/product/{id}`

## 项目功能
- 商品数据初始化
- 商品信息查询
- 订单创建（基础逻辑）
