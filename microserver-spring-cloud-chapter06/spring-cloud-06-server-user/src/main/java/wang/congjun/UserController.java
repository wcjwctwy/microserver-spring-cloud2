package wang.congjun;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WangCongJun
 * @date  2018/2/7
 * Created by WangCongJun on 2018/2/7.
 */
@RestController
@Slf4j
public class UserController {

    @RequestMapping("/user/{id}")
    public String getUserById(@PathVariable() Integer id){
        log.info("【请求服务】");
        return String.format("find user by id %d",id);
    }

}
