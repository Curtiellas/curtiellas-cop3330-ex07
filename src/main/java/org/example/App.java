package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 luis curtiellas
 */

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        //set constant [feet squared to meter squared] | m2 = f2 × 0.09290304
        final float convertRatio = 0.09290304f;

        //read length
        System.out.println("What is the length of the room in feet?");
        String lengthString = sc.next();
        float length = Float.parseFloat(lengthString);

        //read width
        System.out.println("What is the width of the room in feet?");
        String widthString = sc.next();
        float width = Float.parseFloat(widthString);

        //output stating entered data
        System.out.printf("You entered dimensions of %.0f feet by %.0f feet.\n", length, width);

        //calculate area and meter squared conversion
        float areaFeet = length * width;
        float areaMeter = areaFeet * convertRatio;

        //final output
        System.out.printf("The area is\n%.0f square feet\n%.3f square meters", areaFeet, areaMeter);
    }
}
