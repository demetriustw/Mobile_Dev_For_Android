package com.mastercoding.javalib;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args){

        // user input obtained with s1
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the First Number: ");
        // user input stored in n1
        int n1 = s1.nextInt();

        System.out.println("Enter the Second Number: ");
        // user input stored in n2
        int n2 = s1.nextInt();

        float d = (float) n1/n2;
        float r = n1 % n2;
        System.out.println( n1 + " / " + n2 +" = " + d);
        System.out.println("Remainder of: " + r);

    }
}