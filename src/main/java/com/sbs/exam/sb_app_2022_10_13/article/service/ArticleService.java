package com.sbs.exam.sb_app_2022_10_13.article.service;

import com.sbs.exam.sb_app_2022_10_13.article.repository.ArticleRepository;
import com.sbs.exam.sb_app_2022_10_13.article.vo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository){
        this.articleRepository = articleRepository;
    }

    public int writeArticle(String title, String body) {
        articleRepository.writeArticle(title, body);
        return articleRepository.getLastInsertId();
    }

    public List<Article> getArticles() {
        return articleRepository.getArticles();
    }

    public Article getArticle(int id) {
        return articleRepository.getArticle(id);
    }

    public void deleteArticle(int id) {
        articleRepository.deleteArticle(id);
    }

    public void ModifyArticle(int id, String title, String body) {
        articleRepository.modifyArticle(id, title, body);
    }
}

