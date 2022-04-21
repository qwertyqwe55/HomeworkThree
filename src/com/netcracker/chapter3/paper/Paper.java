package com.netcracker.chapter3.paper;

public class Paper {

    private int width;
    private int height;
    private String name;
    private int n = 0;
    public Paper() {
        width = 841;
        height = 1189;
        name = "A0";
    }

    @Override
    public String toString() {
        return "Paper{" +
                "width=" + width +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }

    public void  cutInHalf(){
        if(height > width){
            height = height/2;
            int t = width;
            width = height;
            height = t;
        }else{
            width = width/2;
            int t = height;
            height = width;
            width = t;
        }
        n++;
        name = "A" + n;
    }
}
