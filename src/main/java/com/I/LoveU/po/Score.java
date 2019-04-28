package com.I.LoveU.po;

public class Score {
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Score(){}

    public Score(String userid,String username,int score){
        this.userid=userid;
        this.username=username;
        this.score=score;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    private String userid;
    private String username;
    private int score;
}
