package com.shektest.java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LuckyNumberEight {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String number = in.next();
        // your code goes here

        String[] numArr = number.split("");

        String combo;
        for(int i = 0; i < numArr.length; i++){
            System.out.println(numArr[i]);
            for(int j = 1; j < i+1; j++) {
                System.out.println(numArr[i] + numArr[j]);
            }

        }






    }
}
