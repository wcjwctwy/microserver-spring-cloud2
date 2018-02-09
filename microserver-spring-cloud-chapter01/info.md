#chapter01代码介绍
##主要的服务：User服务（提供者），Movie服务（消费者）
###这里主要使用的RestTemplate来进行服务之间的调用
```
@Bean
public RestTemplate getRestTemplate(){
    return new RestTemplate();
}
```
###http调用user服务
```
@GetMapping("/user/{id}")
public User findUserById(@PathVariable Long id){
    User user = restTemplate.getForObject("http://localhost:8000/"+id, User.class);
    return user;
}
```

