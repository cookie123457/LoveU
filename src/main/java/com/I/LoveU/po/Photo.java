package com.I.LoveU.po;



public class Photo {


    public String getPhotoname() {
        return photoname;
    }

    public void setPhotoname(String photoname) {
        this.photoname = photoname;
    }



    private String photoname;


    public Photo(){}

    public Photo(int id,String photoname,String username){

        this.photoname=photoname;


    }
}
