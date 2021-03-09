package com.nextcode.bulletin.sample.domain;

public class SampleDto {
    private String id;
    private String name;
    private String age;
    private String notice;
    private String crt_date;
    private String crt_id;

    public String getId() {
        return id == null ? null : id.trim();
    }

    public SampleDto setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name == null ? null : name.trim();
    }

    public SampleDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getAge() {
        return age == null ? null : age.trim();
    }

    public SampleDto setAge(String age) {
        this.age = age;
        return this;
    }

    public String getNotice() {
        return notice == null ? null : notice.trim();
    }

    public SampleDto setNotice(String notice) {
        this.notice = notice;
        return this;
    }

    public String getCrt_date() {
        return crt_date == null ? null : crt_date.trim();
    }

    public SampleDto setCrt_date(String crt_date) {
        this.crt_date = crt_date;
        return this;
    }

    public String getCrt_id() {
        return crt_id == null ? null : crt_id.trim();
    }

    public SampleDto setCrt_id(String crt_id) {
        this.crt_id = crt_id;
        return this;
    }
}
