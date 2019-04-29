package com.I.LoveU.po;



public class Photo {

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String userid;
    private String username;
    private String photoname;

    public void setPhotoname(String photoname){
        this.photoname=photoname;
    }
    public String getPhotoname(){
        return "../../images/"+userid +" " +username+".png";
    }

    public Photo(){}

    public Photo(String userid,String username,String photoname){
        this.username=username;
        this.photoname=photoname;
    }
}
