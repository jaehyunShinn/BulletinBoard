package com.nextcode.bulletin.board.domain;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;


public class ListDTO {

    private int lastSeq =0;
    private int size =11;
    private int page =1;

    public ListDTO(int lastSeq, int size, int page) {
        this.lastSeq = lastSeq;
        this.size = size;
        this.page = page;
    }

    public int getLastSeq() {
        return lastSeq;
    }

    public void setLastSeq(int lastSeq) {
        this.lastSeq = lastSeq;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSkip() {
        return (page-1) *size;
    }


}
