package com.example.android.takehomelesson07_nuoj;

/**
 * Created by Cherry on 3/25/18.
 */

public class Person {
    public String name;
    public String info;
    public int photoId;

    public Person(String name, String info, int photoId){
        this.name = name;
        this.info = info;
        this.photoId = photoId;
    }

    public String getName(){
        return name;
    }

    public String getInfo(){
        return info;
    }

    public int getPhotoId(){
        return photoId;
    }
}
