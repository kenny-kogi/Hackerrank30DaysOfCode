package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int sec;
        double dub;
        String seco;

        /* Read and save an integer, double, and String to your variables.*/
        sec = scan.nextInt();
        dub = scan.nextDouble();
        seco = scan.next();
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        System.out.println(sec + i);


        /* Print the sum of the double variables on a new line. */
        System.out.println(dub + d);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        String new1 = s.concat(seco);
        System.out.println(new1);

        scan.close();
    }
    }