package com.mastercoding.javalib;

import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Scanner;

import sun.security.util.Length;

public class HelloWorld {

    public static void main(String[] args){

        int[] nums = {5,7,2,4,9};
        int even_counter = 0;
        int odd_counter = 0;

        for (int i=0; i< nums.length; i++){
            if (nums[i] %2 == 0){
                even_counter++;
            } else {
                odd_counter++;
            }
        }

        System.out.println("Number of even numbers: " +even_counter);
        System.out.println("Number of odd numbers: "+ odd_counter);

    }

}