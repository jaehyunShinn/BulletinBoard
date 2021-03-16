package com.nextcode.bulletin.board.domain;

import lombok.Data;

@Data
public class BoardVO {
    private String id;
    private String parent_id;
    private int grpNum;
    private int grpOrd;

    private int depth;
    private String title;
    private String content;

    private String email;

}