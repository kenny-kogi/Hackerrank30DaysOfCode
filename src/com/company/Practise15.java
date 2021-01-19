package com.company;
import java.io.*;
import java.util.*;

public class Practise15{
    // Write your code here.
    Stack<Character> stk = new Stack<>();
    LinkedList<Character> ll
            = new LinkedList<>();
    void pushCharacter(char s){
        stk.push(s);
    }

    void enqueueCharacter(char s){
        ll.add(s);

    }

    char popCharacter(){
        return stk.pop();

    }

    char  dequeueCharacter(){
        return ll.removeFirst();
    }





    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Practise15 p = new Practise15();
        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}