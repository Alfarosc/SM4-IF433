package oop_kelas_b_2023;
// import java.util.Scanner;
// import java.io.*;

import java.util.Scanner;

public class AlfarizkyOscandar_palindrom {
    public static void main(String[] args)
    {
        Scanner thiScanner = new Scanner(System.in);
        
        System.out.println("input: ");
        String inputString = thiScanner.nextLine();

        // findPalindrome(inputString);
        
        if(isPalindrome(inputString) == true){
            System.out.println("Output: Palindrom");
        } else
            System.out.println("Output: Bukan Palindrom");
    }

    public static boolean isPalindrome(String str)
    {
        boolean isPalindrome;
        String reverse = "";
        int strLenght = str.length();

        str = str.toLowerCase();

        for(int i = (strLenght - 1); i >= 0; --i){
            reverse = reverse + str.charAt(i);
        }

        if(str.equals(reverse)){
            isPalindrome = true;
            return isPalindrome;
        }
        else{
            isPalindrome = false;
            return isPalindrome;
        }
    }

    // public static void findPalindrome(String str){
    //     String reverse = "";
    //     int strLenght = str.length(); str.toLowerCase();

    //     for(int i = (strLenght - 1); i >= 0; --i){
    //         reverse = reverse + str.charAt(i);
    //     }

    //     if(str.equals(reverse)){
    //         System.out.println("Output: Palindrome");
    //     }
    //     else
    //         System.out.println("Output: Bukan Palindrome");
    // }

}
