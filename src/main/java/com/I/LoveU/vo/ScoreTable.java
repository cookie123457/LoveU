package com.I.LoveU.vo;

public class ScoreTable {
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

    public ScoreTable(){}

    public ScoreTable(String username,int score){
        this.username=username;
        this.score=score;
    }

    private String username;
    private int score;
}
