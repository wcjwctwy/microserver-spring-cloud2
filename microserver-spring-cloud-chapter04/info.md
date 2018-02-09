#chapter04代码介绍
###主要的服务：
- User服务（提供者）
- Movie服务（消费者） 
- eureka服务（服务注册中心，用的是其他项目的eureka）

###系统逻辑介绍
- 使用eureka上面注册的用户名作为url，不再使用host:port的形式
- 在客户端实现负载均衡（通过ribbon实现）


