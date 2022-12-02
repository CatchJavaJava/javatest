package javatest.nine_exception.Solutions.Q1;

import java.util.Scanner;


public class Q1{
    public static void main(String[] args) {
        String[] words = {"apple", "sigma", "java", "node", "beta", "apple pie", "java.lang.Math"};
        Scanner scan = new Scanner(System.in);
        String word = null;

        System.out.print("입력 : ");
        word = scan.next();

        for(String i : words){
            if(i.startsWith(word))
                System.out.println(i);
        }

        scan.close();
        
    }
}