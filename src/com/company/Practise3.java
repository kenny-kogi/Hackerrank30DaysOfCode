package com.company;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//find even and odd string in java 30days of code

public class Practise3 {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scan = new Scanner(System.in);
            int T = scan.nextInt();
            for(int i=0;i<T;i++){
                String s = scan.next();
                for(int j=0;j<s.length();j++){
                    if(j%2 ==0){
                        System.out.print(s.charAt(j));
                    }
                }
                System.out.print(" ");
                for(int j=0;j<s.length();j++){
                    if(j%2==1){
                        System.out.print(s.charAt(j));
                    }

                }
                System.out.println();

            }
        }
    }

