package com.learnProgramming;

public class Rectangle {
    //declare the field
    private double width;
    private double length;

    //Create the constructor for init the field
    public Rectangle(double width, double length){
        //condition of the field
        if (width <= 0){
            this.width = 0;
        } else {
            this.width = width;
        }

        if (length <= 0){
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    //Set up the getter
    public double getWidth(){
        return this.width;
    }

    public double getLength(){
        return this.length;
    }

    public double getArea(){
        double TotalArea = (this.width * this.length);
        return TotalArea;
    }
}

