package com.nextcode.board;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import java.util.Hashtable;

public class MemberSession implements HttpSessionBindingListener {
    String id;
    String pw;
    static MemberSession memberSession = null;
    Hashtable userList = new Hashtable();

    private MemberSession() {


    }

    public static synchronized MemberSession getInstance() {
        if (memberSession == null) {

            memberSession = new MemberSession();
        }
        return memberSession;
    }

    public MemberSession(String id, String pw) {
        this.id = id;
        this.pw = pw;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    //세션이 연결될때마다 호출되는 메서드
    @Override
    public void valueBound(HttpSessionBindingEvent hsbe) {
        System.out.println("User객체가 session에 바인딩됨");
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent hsbe) {

        System.out.println("User 객체가 세션에서 제거됨 ");
    }

    //to do
    public void setSession(HttpSession session, String userId) {
        //Session Binding 이벤트가 일어나는 시점
        session.setAttribute(userId, this);//자기 자신의 객체를 넣는다. 유저 자신의 아이디 앞으로 로그인 매니저를 넣어 놓는다.
    }


}
