package com.shektest.java;

/**
 * Created by Shek on 1/5/17.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Factorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //String temp;
        System.out.println("I entered " + n);
        BigInteger sum = new BigInteger("1");
        for (int i =1; i <= n; i ++) {
           // temp = (String)i;
          sum = sum.multiply(new BigInteger(Integer.toString((i))));
            //System.out.println(i);
            //System.out.println(sum);

        }

        System.out.println(sum);

    }
}
