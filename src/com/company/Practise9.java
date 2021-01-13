package com.company;

class Practise9 extends Person1{
    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - A*n integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here
    Practise9(String firstName, String lastName, int id, int []testScores){
        super(firstName,lastName,id);
        this.testScores=testScores;
        this.firstName=firstName;
        this.lastName=lastName;
        this.idNumber=id;

    }

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here

    public char calculate(){
        int sum = 0;
        for(int i =0; i < testScores.length; i ++){
            sum += testScores[i];

        }
        int average = sum/testScores.length;

        if (average >= 90 && average <= 100){
            return 'O';
        }
        if (average >= 80 && average < 90){
            return 'E';
        }
        if (average >= 70 && average < 80){
            return 'A';
        }
        if (average >= 55 && average < 70){
            return 'P';
        }
        if (average >= 40 && average < 55){
            return 'D';
        }
        if (average < 40){
            return 'T';
        }
        else
            return Character.MIN_VALUE;
    }}
