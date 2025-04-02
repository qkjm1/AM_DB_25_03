package org.example.dao;

import org.example.Article;
import org.example.util.DBUtil;
import org.example.util.SecSql;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ArticleDao {

    public int isWriteDup(Connection conn, String title, String body) {
        SecSql sql = new SecSql();

        sql.append("INSERT INTO article");
        sql.append("SET regDate = NOW(),");
        sql.append("updateDate = NOW(),");
        sql.append("title = ?,", title);
        sql.append("`body` = ?;", body);

        return DBUtil.insert(conn, sql);
    }

    // 리턴타입을 리스트로 해야하므로 타입을 리스트 아티클스로
    public boolean isListDup(Connection conn) {
        List<Article> articles = new ArrayList<>();

        SecSql sql = new SecSql();
        sql.append("SELECT *");
        sql.append("FROM article");
        sql.append("ORDER BY id DESC");


        return DBUtil.selectRowBooleanValue(conn, sql);
    }
}
