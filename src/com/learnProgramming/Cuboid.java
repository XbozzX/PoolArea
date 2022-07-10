package com.learnProgramming;

import java.awt.*;

public class Cuboid  extends Rectangle {
    //Declare all the field
    private double height;

    //Create the constructor
    public Cuboid(double width, double length, double height){
        super(width,length);
        if (height <= 0){ //Condition to check the number is valid or not
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    //Create the getter
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return (getArea() * this.height);
    }
}

