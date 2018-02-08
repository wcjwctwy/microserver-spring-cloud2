package wang.congjun;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author WangCongJun
 * @date 2018/2/7
 * Created by WangCongJun on 2018/2/7.
 */
@FeignClient(name="MICRO-USER-SERVER",fallback = MovieConfig.HystrixHandler.class)
public interface MovieConfig {

    /**
     * feign客户端获取user
     * @param id user的id
     * @return
     */
   @RequestMapping(value="/user/{id}",method = RequestMethod.GET)
   String getUserById(@PathVariable("id") Integer id);

   @Component
   static class HystrixHandler implements MovieConfig{

       @Override
       public String getUserById(Integer id) {
           return "出错了！！";
       }
   }
}
