package com.company;
import java.io.*;
import java.net.SocketTimeoutException;
import  java.util.*;

public class Practise5 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<String, Integer> myMap = new HashMap<String, Integer>();

        for (int i =0; i < n; i ++){
            String name = scanner.next();
            int phone_number = scanner.nextInt();
            scanner.nextLine();

            myMap.put(name, phone_number);
        }

        while (scanner.hasNext()){
            String query = scanner.next();

            if (myMap.get(query) == null){
                System.out.println("Not found");

            }else{

                System.out.println(query + "=" + myMap.get(query));

            }

        }
        scanner.close();

    }
}
