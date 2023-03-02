package com.sbs.exam.sb_app_2022_10_13.article.controller;

import com.sbs.exam.sb_app_2022_10_13.article.service.ArticleService;
import com.sbs.exam.sb_app_2022_10_13.article.vo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UsrArticleController {

    @Autowired
    private ArticleService articleService;


    @RequestMapping("/user/article/doAdd")
    @ResponseBody
    public Article doAdd(String title, String body){

        Article article = articleService.writeArticle(title, body);

        return article;
    }
    @RequestMapping("/user/article/getArticles")
    @ResponseBody
    public List<Article> getArticles(){
        return articleService.getArticles();
    }

    @RequestMapping("/user/article/doDelete")
    @ResponseBody
    public String doDelete(int id){
        Article article = articleService.getArticle(id);

        if( article == null ){
            return id + "번 게시물이 존재하지 않습니다.";
        }

        articleService.deleteArticle(id);
        return id + "번 게시물을 삭제하였습니다.";
    }

    @RequestMapping("/user/article/getArticle")
    @ResponseBody
    public Object getArticleAction(int id){
        Article article = articleService.getArticle(id);

        if( article == null ){
            return id + "번 게시물이 존재하지 않습니다.";
        }

        return article;
    }

    @RequestMapping("/user/article/doModify")
    @ResponseBody
    public String doModify(int id, String title, String body){
        Article article = articleService.getArticle(id);

        if( article == null ){
            return id + "번 게시물이 존재하지 않습니다.";
        }

        articleService.ModifyArticle(id, title, body);
        return id + "번 게시물을 수정하였습니다.";

    }
}
