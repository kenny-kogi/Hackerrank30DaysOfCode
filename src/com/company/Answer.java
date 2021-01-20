package com.company;

import java.util.Scanner;

public class Answer {

    public static void print(polygon p){
        System.out.println( "A " + p.getClass().getSimpleName() + " has " + p.getNumberofsides() + " sides." );
        System.out.println( "The perimeter of this shape is: " +  p.getPerimeter() + '\n');
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();

        polygon rectangle = new Rectangle(n, s);
        print(rectangle);



    }
}
