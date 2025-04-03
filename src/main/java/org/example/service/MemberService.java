package org.example.service;

import org.example.dao.MemberDao;

import java.sql.Connection;

public class MemberService {

    private MemberDao memberDao;

    public MemberService() {
        this.memberDao = new MemberDao();
    }

    public boolean isLoginIdDup(Connection conn, String loginId) {
        return memberDao.isLoginIdDup(conn, loginId);
    }

    public boolean isLoginPwDup(Connection conn, String loginPw) {
        return memberDao.isLoginIdDup(conn, loginPw);
    }

    public int doJoin(Connection conn, String loginId, String loginPw, String name) {
        return memberDao.doJoin(conn,loginId, loginPw, name);
    }
}