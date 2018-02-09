#chapter06代码介绍
###主要的服务：
- User服务（提供者）
- Movie服务（消费者） 
- eureka服务（服务注册中心，用的是其他项目的eureka）

###系统逻辑介绍
- feign client调用服务
- ribbon 负载均衡
- hystrix 断路器配置
- zuul 网关配置


