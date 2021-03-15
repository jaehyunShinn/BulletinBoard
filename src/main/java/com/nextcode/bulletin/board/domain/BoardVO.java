package com.nextcode.bulletin.board.domain;

import java.io.Serializable;

public class BoardVO {
    private int id;
    private int parent_id;
    private int grpNum;
    private int grpOrd;

    private int depth;
    private String title;
    private String content;

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public int getGrpNum() {
        return grpNum;
    }

    public void setGrpNum(int grpNum) {
        this.grpNum = grpNum;
    }

    public int getGrpOrd() {
        return grpOrd;
    }

    public void setGrpOrd(int grpOrd) {
        this.grpOrd = grpOrd;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "BoardVO{" +
                "id=" + id +
                ", parent_id=" + parent_id +
                ", grpNum=" + grpNum +
                ", grpOrd=" + grpOrd +
                ", depth=" + depth +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}