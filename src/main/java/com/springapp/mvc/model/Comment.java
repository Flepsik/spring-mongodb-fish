package com.springapp.mvc.model;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Fleps_000 on 02.07.2015.
 */
@Document(collection = Comment.COMMENT_NAME)
public class Comment {

    public static final String COMMENT_NAME = "comments";


    private Long id;

    private String name;
    private String surname;
    private String phone;
    private String sex;
    private String comment;

    public Comment() {
    }

    public Comment(Long id, String name, String surname, String phone, String sex, String comment) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.sex = sex;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
