package org.example.controller;

import org.example.service.MemberService;

import java.sql.Connection;
import java.util.Scanner;

public class MemberController {

    private Connection conn;
    private Scanner sc;

    private MemberService memberService;


    public MemberController(Scanner sc, Connection conn) {
        this.sc = sc;
        this.conn = conn;
        this.memberService = new MemberService();
    }

    public void doJoin() {
        String loginId = null;
        String loginPw = null;
        String loginPwConfirm = null;
        String name = null;

        System.out.println("==회원가입==");
        while (true) {
            System.out.print("로그인 아이디 : ");
            loginId = sc.nextLine().trim();

            if (loginId.length() == 0 || loginId.contains(" ")) {
                System.out.println("아이디 똑바로 써");
                continue;
            }

            boolean isLoginIdDup = memberService.isLoginIdDup(conn, loginId);

            System.out.println(isLoginIdDup);

            if (isLoginIdDup) {
                System.out.println(loginId + "은(는) 이미 사용중");
                continue;
            }
            break;

        }
        while (true) {
            System.out.print("비밀번호 : ");
            loginPw = sc.nextLine().trim();

            if (loginPw.length() == 0 || loginPw.contains(" ")) {
                System.out.println("비번 똑바로 써");
                continue;
            }

            boolean loginCheckPw = true;

            while (true) {
                System.out.print("비번 확인 : ");
                loginPwConfirm = sc.nextLine().trim();

                if (loginPwConfirm.length() == 0 || loginPwConfirm.contains(" ")) {
                    System.out.println("비번 확인 똑바로 써");
                    continue;
                }

                if (loginPw.equals(loginPwConfirm) == false) {
                    System.out.println("일치하지 않아");
                    loginCheckPw = false;
                }
                break;
            }
            if (loginCheckPw) {
                break;
            }
        }
        while (true) {
            System.out.print("이름 : ");
            name = sc.nextLine();

            if (name.length() == 0 || name.contains(" ")) {
                System.out.println("이름 똑바로 써");
                continue;
            }
            break;
        }

        int id = memberService.doJoin(conn, loginId, loginPw, name);

        System.out.println(id + "번 회원이 가입됨");
    }

    public void doLogin() {
        int limit=0;
        String loginId = null;
        String loginPw = null;
        boolean isLoginIdDup = false;

        // 로그인아이디를 올바르게 쳤을때 객체값을 가지고와서 비밀번호확인때 가지고온 객체값과 비교
        // db에 저장된 값을 자바 멤버클래스 객체값으로 저장해서 이용하기ArticleArticleArticle
        System.out.println("==로그인==");
        if(loginMember==1){
            System.out.println("로그인 중 입니다");
        }
        while (true) {
            System.out.print("ID: ");
            loginId = sc.nextLine().trim();
            if (loginId.length() == 0 || loginId.contains(" ")) {
                System.out.println("아이디 똑바로 써");
                continue;
            }
        }
        System.out.print("pw: ");
        loginPw = sc.nextLine().trim();

        boolean isLoginPwDup = memberService.isLoginPwDup(conn, loginPw);

        if(isLoginIdDup==true && isLoginPwDup ==true){
            loginMember = 1;
        }
        if(loginMember==1){
            System.out.println("로그인이 되었습니다");
        }
    }

    public void doLogout() {

    }
}