package com.mastercoding.javalib;

import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Scanner;

import sun.security.util.Length;

public class HelloWorld {

    public static void main(String[] args){
        int row,col,c,d;

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number of Rows: ");
        row = s1.nextInt();
        System.out.println("Enter the number of Columns: ");
        col = s1.nextInt();

        // Creating the matrices
        int array1[][] = new int[row][col];
        int array2[][] = new int[row][col];
        int sum[][] = new int[row][col];

        // Getting the elements of Matrix
        System.out.println("Enter the elements of 1st matrix");
        for (c = 0; c < row; c++){ // Row
            for (d = 0; d < col; d++){ // Col
                array1[c][d] = s1.nextInt();
            }
        }


        System.out.println("Enter the elements of 2nd matrix");
        for (c = 0; c < row; c++){ // Row
            for (d = 0; d < col; d++){ // Col
                array2[c][d] = s1.nextInt();
            }
        }

        // Making the addition of 2 matrices
        for (c = 0; c < row; c++){ // Row
            for (d = 0; d < col; d++){ // Col
                sum[c][d] = array1[c][d] + array2[c][d];
            }
        }

        System.out.println("Sum of the Matrices: ");

        // Displaying the result matrix
        for (c = 0; c < row; c++){ // Row
            for (d = 0; d < col; d++){ // Col
                System.out.print(sum[c][d] + "\t");
            }
            System.out.println();
        }

    }

}