package wang.congjun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author WangCongJun
 * @date 2018/2/26
 * Created by WangCongJun on 2018/2/26.
 */
@SpringBootApplication
@EnableEurekaServer
public class ConfigurationEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigurationEurekaApplication.class,args);
    }
}
