package com.baizhi.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/first")
public class FirstAction {

    @RequestMapping("/jsp")
    public  String   jsp() throws  Exception{
        System.out.println("Hello  Wasdas 阿斯达三大");
        return "index";
    }
}
