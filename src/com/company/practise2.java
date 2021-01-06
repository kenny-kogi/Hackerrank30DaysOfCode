package com.company;

import java.math.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class practise2{
    public  static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();



        double amount_tip = (tip_percent * meal_cost)/ 100;
        double amount_tax = ((tax_percent * meal_cost)/100);

        double total_amount = meal_cost +  amount_tip +  amount_tax;

        System.out.println(Math.round(total_amount));



    }

}