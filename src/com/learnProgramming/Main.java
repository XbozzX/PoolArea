package com.learnProgramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Rectangle rectangle1 = new Rectangle(7,5);
        System.out.println("Width= " + rectangle1.getWidth());
        System.out.println("Area= " + rectangle1.getArea());
        System.out.println("Length= " + rectangle1.getLength());

        Cuboid cuboid1 = new Cuboid(1.2, 4.2,2.3);
        System.out.println("Width= " + cuboid1.getWidth());
        System.out.println("Area= " + cuboid1.getArea());
        System.out.println("Length= " + cuboid1.getLength());
        System.out.println("Height= " + cuboid1.getHeight());
        System.out.println("Volume= " + cuboid1.getVolume());
    }
}
