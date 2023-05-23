package com.mastercoding.javalib;

import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Scanner;

import sun.security.util.Length;

public class HelloWorld {

    public static void main(String[] args){

        Scanner s1 = new Scanner(System.in);

        System.out.println("Input the String to reverse it: ");
        char[] letters = s1.nextLine().toCharArray();
        System.out.println("The Reversed String is: ");

        for (int i = letters.length-1; i >= 0; i--){
            System.out.print(letters[i]);
        }
        System.out.println("\n");

    }

}