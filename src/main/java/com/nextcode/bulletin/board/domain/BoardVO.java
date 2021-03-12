package com.nextcode.bulletin.board.domain;

import java.io.Serializable;

public class BoardVO implements Serializable {
    private static final long serialVersionUID =-2343L;
    private int id;
    private int parent_id;
    private int grpNum;
    private int grpOrd;

    private int depth;
    private String title;
    private String content;


    public BoardVO(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}