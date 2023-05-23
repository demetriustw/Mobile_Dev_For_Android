package com.mastercoding.javalib;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args){

        // user input obtained with Scanner as s1
        Scanner s1 = new Scanner(System.in);

        System.out.println("Please enter a radius: ");
        int radius = s1.nextInt();

        float peri = (float) ((float) 2*Math.PI*radius);
        float area = (float) Math.PI*radius*radius;

        System.out.println("Area: "+ area + " Perimeter: "+ peri);

    }
}