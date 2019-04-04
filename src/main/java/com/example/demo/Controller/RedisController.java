package com.example.demo.Controller;

import com.example.demo.Service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wwx
 * @date 2019/4/4 11:53
 **/
@RestController
public class RedisController {
    @Autowired
    private RedisService redisService ;


    @RequestMapping(value = "/test")
    public String demoTest(){
        redisService.set("1","value22222");
        System.out.println(redisService.get("1"));
        return redisService.get("1").toString();
    }
}
