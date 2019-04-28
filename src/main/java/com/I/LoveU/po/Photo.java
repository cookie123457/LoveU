package com.I.LoveU.po;



public class Photo {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhotoname() {
        return photoname;
    }

    public void setPhotoname(String photoname) {
        this.photoname = photoname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private int id ;
    private String photoname;
    private String username;

    public Photo(){}

    public Photo(int id,String photoname,String username){
        this.id=id;
        this.photoname=photoname;
        this.username=username;

    }
}
