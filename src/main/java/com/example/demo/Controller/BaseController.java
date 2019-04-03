package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author wwx
 * @date 2019/4/3 11:36
 **/
@Controller
public class BaseController {

    @RequestMapping(value = {"/", "public/index"}, method = RequestMethod.GET)
    public String Index(Model model){
        model.addAttribute("name","zhangsan");
        return "index";
    }
}
