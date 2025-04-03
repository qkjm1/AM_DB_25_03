package org.example.session;

import org.example.dto.Member;

public class Session  {
    public Member loginedMember;
    public int loginedMemberId;

    public Session() {
        this.loginedMember = null;
        this.loginedMemberId = -1;
    }
     public void LoginedMember(Member member) {
        this.loginedMember = member;
        this.loginedMemberId = member.getId();
     }

}
