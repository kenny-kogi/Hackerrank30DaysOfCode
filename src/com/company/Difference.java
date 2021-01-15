package com.company;

public class Difference {
    private int [] elements;
    public int maximumDifference;

    Difference(int [] a){
        this.elements = a;

    }

    public int computeDifference(){
         int min = elements[0];
         int max = elements[0];
         for (int i =0; i < elements.length; i ++){

             if (elements[i] < min){
                 min = elements[i];
             }
             if (elements[i] > max){
                 max = elements[i];
             }

         }

         maximumDifference =  Math.abs(max - min);
         return maximumDifference;
    }


}
