package com.sbs.exam.sb_app_2022_10_13.membver.controller;

import com.sbs.exam.sb_app_2022_10_13.article.vo.Article;
import com.sbs.exam.sb_app_2022_10_13.membver.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.nio.channels.MulticastChannel;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UsrMemberController {
    @Autowired
    private MemberService memberService;


    @RequestMapping("/user/article/doJoin")
    @ResponseBody
    public String doJoin(String loginId, String loginPw, String name,  String nikname,
                         String cellphoneNo, String email){
        memberService.join( loginId,  loginPw,  name,   nikname, cellphoneNo,  email);
        return "안녕하세요";
    }
}
