package com.mastercoding.javalib;

import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Scanner;

import sun.security.util.Length;

public class HelloWorld {

    public static void main(String[] args){
        int[] numbers = new int[]{1,2,5,7,9,8};

        // Calculate the sum of all elements
        int sum = 0;
        for (int i=0; i<numbers.length; i++){
            sum += numbers[i];
        }

        // Calculate the average value
        double average = (double)sum/numbers.length;
        System.out.println("The average is: " + average);



    }

}