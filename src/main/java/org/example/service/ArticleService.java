package org.example.service;

import org.example.Article;
import org.example.dao.ArticleDao;
import org.example.dao.MemberDao;
import org.example.util.SecSql;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class ArticleService {

    private ArticleDao articleDao;

    public ArticleService(){
        this.articleDao = new ArticleDao();
    }

    public int isWriteDup(Connection conn, String title, String body) {
        return articleDao.isWriteDup(conn, title, body);
    }

    public boolean isListDup(Connection conn) {
        return articleDao.isListDup(conn);
    }
}
