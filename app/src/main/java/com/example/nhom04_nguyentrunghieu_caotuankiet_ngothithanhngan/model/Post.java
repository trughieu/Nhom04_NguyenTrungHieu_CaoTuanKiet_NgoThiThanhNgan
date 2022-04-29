package com.example.nhom04_nguyentrunghieu_caotuankiet_ngothithanhngan.model;

import java.io.Serializable;

public class Post implements Serializable {
    String avt;
    String postedBy;
    String postDescription;//
    String postImage;//
    String postId;//
     String postedAt;//

    public Post(String avt, String postedBy, String postDescription, String postImage, String postId, String postedAt) {
        this.avt = avt;
        this.postedBy = postedBy;
        this.postDescription = postDescription;
        this.postImage = postImage;
        this.postId = postId;
        this.postedAt = postedAt;
    }

    public String getPostedAt() {
        return postedAt;
    }

    public void setPostedAt(String postedAt) {
        this.postedAt = postedAt;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getPostedBy() {
        return postedBy;
    }

    public void setPostedBy(String postedBy) {
        this.postedBy = postedBy;
    }


    public Post() {
    }

    public String getAvt() {
        return avt;
    }

    public void setAvt(String avt) {
        this.avt = avt;
    }


    public String getPostDescription() {
        return postDescription;
    }

    public void setPostDescription(String postDescription) {
        this.postDescription = postDescription;
    }

    public String getPostImage() {
        return postImage;
    }

    public void setPostImage(String postImage) {
        this.postImage = postImage;
    }

    @Override
    public String toString() {
        return "Post{" +
                "avt='" + avt + '\'' +
                ", namepost='" + postedBy + '\'' +
                ", content='" + postDescription + '\'' +
                ", imgpost='" + postImage + '\'' +
                '}';
    }
}
