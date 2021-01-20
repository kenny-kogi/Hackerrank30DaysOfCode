package com.company;

import java.util.Scanner;

public class Practise17 implements Practise16{
    public int getDivision(int n){
        int sum = 0;
        for (int i = 1; i <= n; i ++){
            if (n % i == 0){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Practise17 p = new Practise17();

        int result = p.getDivision(n);
        System.out.println(result);




    }



}
