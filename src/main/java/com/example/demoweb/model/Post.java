package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private String text;
    private Integer likes;
    private Long id;
    private Date creationDate;

    public Post(Long id, String text, Date date)
    {
        this.id = id;
        this.text = text;
        this.likes = 0;
        this.creationDate = date;
    }

    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }

    public Long getId() {
        return id;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Date getCreationDate() {
        return creationDate;
    }
}
