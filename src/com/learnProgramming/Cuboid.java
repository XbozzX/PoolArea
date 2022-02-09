package com.learnProgramming;

public class Cuboid extends Rectangle{ //import the parent class method
    //declare the field
    private double height;

    //Create the constructor for init the field
    public Cuboid(double width, double length, double height){
        //inherent the parent class field
        super(width, length);

        //condition for the Cuboid field
        if (height <= 0){
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Set up the getter
    public double getHeight(){
        return this.height;
    }

    public double getVolume(){
        double area = getArea();
        double TotalVolume = this.height * area;
        return TotalVolume;
    }
}

