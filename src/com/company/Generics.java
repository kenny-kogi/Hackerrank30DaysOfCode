package com.company;

import java.util.Scanner;

public class Generics {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] a = new Integer[n];

        for (int i = 0; i < n; i ++){
            a[i] = scanner.nextInt();
        }

        int s = scanner.nextInt();
        String [] b = new String[s];


        for (int j =0; j < s; j ++){
            b[j] = scanner.next();
        }

        Pointer<Integer> p = new Pointer<>();
        Pointer<String> z = new Pointer<>();
        p.PrintArray(a);
        z.PrintArray(b);



    }
}
