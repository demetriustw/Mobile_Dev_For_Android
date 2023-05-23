package com.mastercoding.javalib;

import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Scanner;

import sun.security.util.Length;

public class HelloWorld {

    public static void main(String[] args){

        int i,j, x, n, s;

        System.out.println("Please enter a number: ");
        Scanner s1 = new Scanner(System.in);
        n = s1.nextInt();

        s = n+4-1;

        for (i = 1; i <= n; i++){ // Rows

            for (x = s; x != 0; x--){ // Spaces
                System.out.print(" ");
            }

            for (j = 1; j<=i; j++){ // Numbers
                System.out.print(i+ " ");
            }
            System.out.println();
            s--;

        }

    }

}