package com.example.nhom04_nguyentrunghieu_caotuankiet_ngothithanhngan;

import java.io.Serializable;

public class Post implements Serializable {
    String avt;
    String namepost;
    String content;
    String imgpost;

    public Post(String avt, String namePost, String content, String imgPost) {
        this.avt = avt;
        this.namepost = namePost;
        this.content = content;
        this.imgpost = imgPost;
    }

    public Post() {
    }

    public String getAvt() {
        return avt;
    }

    public void setAvt(String avt) {
        this.avt = avt;
    }

    public String getNamepost() {
        return namepost;
    }

    public void setNamepost(String namepost) {
        this.namepost = namepost;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImgpost() {
        return imgpost;
    }

    public void setImgpost(String imgpost) {
        this.imgpost = imgpost;
    }

    @Override
    public String toString() {
        return "Post{" +
                "avt='" + avt + '\'' +
                ", namePost='" + namepost + '\'' +
                ", content='" + content + '\'' +
                ", imgPost='" + imgpost + '\'' +
                '}';
    }
}
