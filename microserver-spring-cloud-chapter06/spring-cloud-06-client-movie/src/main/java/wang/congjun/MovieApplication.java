package wang.congjun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

/**
 * @author WangCongJun
 * @date 2018/2/7
 * Created by WangCongJun on 2018/2/7.
 */
@SpringBootApplication
@ComponentScan(excludeFilters = {@ComponentScan.Filter(ExcludeConfig.class)})
@EnableEurekaClient
@RibbonClient(name="MICRO-USER-SERVER",configuration = {RibbonConfig.class})
@EnableFeignClients
@EnableCircuitBreaker
public class MovieApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieApplication.class,args);
    }
}
