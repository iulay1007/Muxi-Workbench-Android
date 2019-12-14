package com.muxi.workbench.ui.progress.model;

public class Progress {

    private int sid;
    private int uid;
    private String avatar;
    private String username;
    private String time;
    private String content;
    private boolean ifLike;
    private int commentCount;
    private int likeCount;
    private boolean isSticky;

    public Progress(int sid, int uid, String avatar, String username, String time, String content, boolean ifLike, int commentCount, int likeCount) {
        this.sid = sid;
        this.uid = uid;
        this.avatar = avatar;
        this.username = username;
        this.time = time;
        this.content = content;
        this.ifLike = ifLike;
        this.commentCount = commentCount;
        this.likeCount = likeCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isIfLike() {
        return ifLike;
    }

    public void setIfLike(boolean ifLike) {
        this.ifLike = ifLike;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public boolean isSticky() {
        return isSticky;
    }

    public void setSticky(boolean sticky) {
        isSticky = sticky;
    }
}
