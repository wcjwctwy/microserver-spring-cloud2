#chapter02代码介绍
##主要的服务：
- User服务（提供者）
- Movie服务（消费者） 
- eureka服务（服务注册中心）

###系统逻辑介绍
这里主要使用的RestTemplate来进行服务之间的调用，加入了eureka服务注册中心
```java
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class,args);
    }
}
```

