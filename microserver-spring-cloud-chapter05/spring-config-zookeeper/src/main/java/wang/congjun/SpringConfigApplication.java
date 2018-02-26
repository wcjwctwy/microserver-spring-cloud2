package wang.congjun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringConfigApplication.class,args);
    }
}
