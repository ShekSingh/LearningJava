package com.shektest.java;

/**
 * Created by Shek on 1/6/17.
 * https://www.hackerrank.com/challenges/encryption
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Encryption {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        int stringLength = s.length();
        int row;
        int col;
        int intSqr;
        System.out.println(stringLength);

        double sqrRoot = Math.sqrt((double)stringLength);

        System.out.println(sqrRoot);
        System.out.println((int)sqrRoot);



        intSqr = (int)sqrRoot;

        if(intSqr != sqrRoot){
            // this means its not a perfect square
            row = intSqr;
            col = intSqr + 1;
            //ensure that row X col >= L
            if((row*col) < stringLength) {
                row += 1;
            }
        }

        else
        {
            row = col = intSqr;

        }

//thisiswhatiamtalkingaboutwhenitalkaboutlife

        System.out.println("Row : " + row + " Col " + col );
        char[] chArray = s.toCharArray();
        String wordArray[][] = new String[row][col];
        int innerCount = 0;
        String insertedFormat = "";
        for(int i=0; i < row; i++)

        {
            insertedFormat = "";

            for (int j=0; j< col && innerCount < stringLength; j++){

                wordArray[i][j] =  String.valueOf(chArray[innerCount]);
                innerCount++;
                insertedFormat += wordArray[i][j];

            }

            System.out.println(insertedFormat);
        }

        String finalOutput = "";
        innerCount = 0;
        for (int j=0; j< col && innerCount < stringLength; j++){

            for(int i=0; i < row; i++){
                if(wordArray[i][j] != null){
                    finalOutput += wordArray[i][j];
                }

                innerCount++;
            }

            finalOutput += " ";

        }


        System.out.println("Loop iterations " + innerCount);

        System.out.println(finalOutput);

    }
}
