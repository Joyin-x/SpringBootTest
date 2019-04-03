package com.example.demo.Controller;

import com.example.demo.Entity.User;
import com.example.demo.dao.UserDao;
import com.example.demo.utils.ResponseCode;
import com.example.demo.utils.baseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Wrapper;


/**
 * @author wwx
 * @date 2019/4/3 15:20
 **/
@Controller
@RequestMapping("/user")
public class userController {
    @Autowired
    private UserDao userDao;

    @RequestMapping("/selectById")
    @ResponseBody
    public baseResponse selectById(){
        baseResponse response=new baseResponse();
        response.setData(userDao.selectById(1));
        response.setStatus(ResponseCode.SUCCESS);
        return response;
    }

    @RequestMapping("/selectOne")
    @ResponseBody
    public baseResponse selectOne(){
        baseResponse response=new baseResponse();
        User user=new User();
        user.setId(1);
        user.setUsername("admin");
        return response;
    }
}
