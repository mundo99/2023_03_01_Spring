package com.sbs.exam.sb_app_2022_10_13.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UsrHomeController {
    private int count;

    public UsrHomeController() {
        count = -1;
    }

    @RequestMapping("/user/home/main")
    @ResponseBody
    public String showMain(){
        return "안녕하세요.ㅎㅎ";
    }

    @RequestMapping("/user/home/main2")
    @ResponseBody
    public String showMain2(){
        return "반갑습니다.ㅎㅎ";
    }

    @RequestMapping("/user/home/main3")
    @ResponseBody
    public String showMain3(){
        return "또 만나요.ㅎㅎㅎㅎ";
    }

    @RequestMapping("/user/home/getCount")
    @ResponseBody
    public int getCount(){
        count++;
        return count;
    }

    @RequestMapping("/user/home/getString")
    @ResponseBody
    public String getString(){
        return "HI";
    }

    @RequestMapping("/user/home/getInt")
    @ResponseBody
    public int getInt(){
        return 10;
    }

    @RequestMapping("/user/home/getFloat")
    @ResponseBody
    public float getFloat(){
        return 10.5f;
    }

    @RequestMapping("/user/home/getBoolean")
    @ResponseBody
    public Boolean getBoolean(){
        return true;
    }

    @RequestMapping("/user/home/getMap")
    @ResponseBody
    public Map<String, Object> getMap(){
        Map<String, Object> map = new HashMap<>();
        map.put("철수나이",22);
        map.put("영희나이",21);
        return map;
    }



    @RequestMapping("/user/home/doSetCount")
    @ResponseBody
    public String doSetCount(int count){
        this.count = 0;
        return "count의 값이" + this.count + "으로 초기화 되었습니다.";
    }
}
