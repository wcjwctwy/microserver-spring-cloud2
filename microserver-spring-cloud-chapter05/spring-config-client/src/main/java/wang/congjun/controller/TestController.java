package wang.congjun.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${url}")
    String url;

    @GetMapping("/url")
    public String test(){
        return url;
    }
}
