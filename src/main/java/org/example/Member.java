package org.example;

import java.util.Map;

public class Member {
    private int id;
    private String regDate;
    private String updateDate;
    private String loginId;
    private String loginPw;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLoginPw() {
        return loginPw;
    }

    public void setLoginPw(String loginPw) {
        this.loginPw = loginPw;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    private String loginName;

    public Member(int id, String regDate, String updateDate, String loginId, String loginPw, String loginName) {
        this.id = id;
        this.regDate = regDate;
        this.updateDate = updateDate;
        this.loginId = loginId;
        this.loginPw = loginPw;
        this.loginName = loginName;
    }


    public Member(Map<String, Object> articleMap) {// db에서 가져온걸 자바가 해석할 수 잇게 변경
        this.id = (int) articleMap.get("id");
        this.regDate = (String) articleMap.get("regDate");
        this.updateDate = (String) articleMap.get("updateDate");
        this.loginId = (String) articleMap.get("loginId");
        this.loginPw = (String) articleMap.get("loginPw");
        this.loginName = (String) articleMap.get("name");
    }

}