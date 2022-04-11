package com.example.nhom04_nguyentrunghieu_caotuankiet_ngothithanhngan;

import java.io.Serializable;

public class Post implements Serializable {
    String avt;
    String namePost;
    String content;
    String imgPost;

    public Post(String avt, String namePost, String content, String imgPost) {
        this.avt = avt;
        this.namePost = namePost;
        this.content = content;
        this.imgPost = imgPost;
    }

    public Post() {
    }

    public String getAvt() {
        return avt;
    }

    public void setAvt(String avt) {
        this.avt = avt;
    }

    public String getNamePost() {
        return namePost;
    }

    public void setNamePost(String namePost) {
        this.namePost = namePost;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImgPost() {
        return imgPost;
    }

    public void setImgPost(String imgPost) {
        this.imgPost = imgPost;
    }

    @Override
    public String toString() {
        return "Post{" +
                "avt='" + avt + '\'' +
                ", namePost='" + namePost + '\'' +
                ", content='" + content + '\'' +
                ", imgPost='" + imgPost + '\'' +
                '}';
    }
}
