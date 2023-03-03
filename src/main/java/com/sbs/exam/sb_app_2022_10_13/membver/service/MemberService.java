package com.sbs.exam.sb_app_2022_10_13.membver.service;

import com.sbs.exam.sb_app_2022_10_13.membver.Repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    private MemberRepository memberRepository;


    public void join(String loginId, String loginPw, String name, String nikname, String cellphoneNo, String email) {
        memberRepository.join( loginId,  loginPw,  name,   nikname, cellphoneNo,  email);
    }
}
