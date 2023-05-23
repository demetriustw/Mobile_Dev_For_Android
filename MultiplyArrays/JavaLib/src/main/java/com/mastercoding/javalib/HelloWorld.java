package com.mastercoding.javalib;

import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Scanner;

import sun.security.util.Length;

public class HelloWorld {

    public static void main(String[] args){
        int[] arr1 = {1,3,-5,4};
        int[] arr2 = {1,4,-5,-2};
        String result = "";

        for (int i=0; i< arr1.length; i++){

            int num1 = arr1[i];
            int num2 = arr2[i];
            result += (num1*num2)+ " ";

        }
        System.out.println("\nResult: "+result);

    }

}