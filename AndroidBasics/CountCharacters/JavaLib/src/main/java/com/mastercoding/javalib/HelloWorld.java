package com.mastercoding.javalib;

import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Scanner;

import sun.security.util.Length;

public class HelloWorld {

    public static void main(String[] args){

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a word: ");

        String input_String = s1.nextLine();
        count(input_String);

    }

    public static void count(String x){

        char[] ch = x.toCharArray();
        int letter = 0, space = 0, num = 0, others = 0;

        for (int i = 0; i< x.length(); i++) {

            if (Character.isLetter(ch[i])){
                letter++;
            } else if(Character.isDigit(ch[i])){
                num++;
            } else if(Character.isSpaceChar(ch[i])){
                space++;
            } else {
                others++;
            }
        }

        System.out.println("Letters: "+ letter);
        System.out.println("Numbers: "+ num);
        System.out.println("Spaces: "+ space);
        System.out.println("Others: "+ others);

    }

}