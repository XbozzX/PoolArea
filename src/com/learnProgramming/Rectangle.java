package com.learnProgramming;

public class Rectangle {
    //Declare all the field
    private double width;
    private double length;

    //Create the constructor
    public Rectangle(double width, double length){
        if (width <= 0 ){ //Condition to check the number is valid or not
            this.width = 0;
        } else {
            this.width = width;
        }
        if (length <= 0){ //Condition to check the number is valid or not
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    //Create the getter
    public double getWidth(){
        return this.width;
    }
    public double getLength(){
        return this.length;
    }
    public double getArea(){
        return (this.width * this.length);
    }
}

