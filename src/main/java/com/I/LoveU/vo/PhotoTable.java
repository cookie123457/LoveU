package com.I.LoveU.vo;

import java.util.Date;

public class PhotoTable {

    private int id ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    private String userid;
    private String username;
    private Date updatetime;
    private int score;


    public PhotoTable(){}

    public PhotoTable(int id,String userid,String username,Date updatetime,int score){
        this.id=id;
        this.userid=userid;
        this.username=username;
        this.updatetime=updatetime;
        this.score=score;
    }
}
