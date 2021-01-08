package com.company;
//reversing an array in java

import java.util.Scanner;

public class Practise4 {


    private static final Scanner scanner = new Scanner(System.in);

    static  void reverse(int a[], int n){
        int[] b = new int[n];
        int j = n;
        for(int p =0; p < n; p++){
            b[j-1] = a[p];
            j --;

        }
        String ret = "";
        for (int k =0; k<n; k++ ){
            ret += b[k] + " ";

        }
        System.out.println(ret);

    }


    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        reverse(arr, arr.length);

        scanner.close();
    }
}






