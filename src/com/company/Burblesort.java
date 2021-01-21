package com.company;

import java.util.Scanner;

public class Burblesort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        for(int k = 0; k < n; k++){
            a[k] = scanner.nextInt();
        }


        int totalSwaps = 0;

        for (int i = n -1; i > 0; i --){
            int numberofSwaps = 0;
            for(int j = 0; j < i; j ++){
                if (a[j] > a[j + 1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    numberofSwaps++;
                    totalSwaps++;

                }

            }
            if (numberofSwaps == 0){
                break;
            }
        }

        System.out.println("Array is sorted in "+totalSwaps+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[n-1]);






    }
}
