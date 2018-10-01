package com.example.qw.materialtest;

/**
 * Created by qw on 2018/9/29.
 */

public class Fruit {
    private String name;
    private int imagedId;
    public Fruit(String name,int imagedId){
        this.name=name;
        this.imagedId=imagedId;
    }

    public int getImagedId() {
        return imagedId;
    }

    public String getName() {
        return name;
    }
}
