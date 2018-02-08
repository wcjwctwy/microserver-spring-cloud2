package wang.congjun;

import com.netflix.discovery.EurekaClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.CloudEurekaClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WangCongJun
 * @date 2018/2/7
 * Created by WangCongJun on 2018/2/7.
 */
@RestController
public class MovieController {

    @Autowired
    private MovieConfig restTemplate;


    @HystrixCommand(fallbackMethod = "doDefault")
    @RequestMapping("/movie/user/{id}")
    public String getUser(@PathVariable("id") Integer id){
        String forEntity = restTemplate.getUserById(id);
        return forEntity;
    }

    public String doDefault(Integer id){
        return "HystrixCommand";
    }
}
