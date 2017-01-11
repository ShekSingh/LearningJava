package com.shektest.java;

/**
 * Created by Shek on 1/10/17.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class TheGreatXor {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int q = in.nextInt();


        for(int a0 = 0; a0 < q; a0++){
            long x = in.nextLong();
            // your code goes here
            int sum = 0;
            for(long a1 = 0; a1 < x; a1++){

                long val = a1 ^ x;
                if(val > x){
                    sum++;
                }
            }
            System.out.println(sum);

        }
    }
/*
    public static long compareBinary(long a, long x){

        String[] aBin;
        String[] xBin;

        aBin = intToBinary(a).split("");
        xBin = intToBinary(x).split("");;

        for(int i=0; i < xBin.length; i++){


        }


        System.out.println("a " + intToBinary(a));
        System.out.println("x " + intToBinary(x));
        return  a;

    }


    public static String intToBinary(long n) {
        String bin = "";
        if (n == 0) {
            return "0";
        }
        while (n > 0) {
            long remainder = n % 2;
            bin = remainder + bin;
            n = n / 2;
        }
        return bin;
    }

    */
}
