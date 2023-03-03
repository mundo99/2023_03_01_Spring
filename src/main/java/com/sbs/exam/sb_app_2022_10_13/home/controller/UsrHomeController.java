package com.sbs.exam.sb_app_2022_10_13.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UsrHomeController {
    @RequestMapping("/user/home/main")
    @ResponseBody
    public String main(){
        return "안녕";

    }
}
