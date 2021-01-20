package com.company;

public class Rectangle implements polygon {
    private static int numberofsides = 4;
    private int side1;
    private int side2;

    public Rectangle(int side1, int side2){
        this.side1 = side1;
        this.side2 = side2;

    }


    public double getPerimeter(){
        double perimeter = (side1 * 2) + (side2 * 2);
        return perimeter;


    }

    public int getNumberofsides(){
        return numberofsides;
    }








}
