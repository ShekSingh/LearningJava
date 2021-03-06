package com.shektest.java;

public class OperatorPrecedence {

    public static void main(String[] args) {
	System.out.println("Hello, package test");
        System.out.println("\n");
        javaOperators();
        System.out.println("\n");
        operatorPrecedence();
        System.out.println("\n");
        typeConversions();
    }

    // Notes: implicit conversion e.g. long = int, java will convert to the largest type.
    // e.g float = int, double = float
    // above is also called widening conversion
    // the opposite is narrowing primitive conversion

      public static void typeConversions(){


        //arithmetic types
        //short, int, long, float, double


        float val1 = 52223233.45f;
        int val3 = 6;

        // this works
        float val4 = val3;

        //but this does not
       // int val2 = val1;

          //explicit conversion
          int val2 = (int)val1;

// this will print out
          System.out.println("Conversion Successful "  +val2);


          // implicit conversion from large primitive type to smaller primitive type
          // will not work.
          // explicit conversion will work, but it might result in loss.

    }

     //<editor-fold desc="operator precedence">
    private static void operatorPrecedence() {
        //operator precedence

        //1. postfix  val++
        //2. prefix  ++val
        //3. parenthesis; if nested then starting with the inner most one
        //4. multiplicative operations e.g. /, *
        //5. additive operations e.g. +, -
        //6. left to right for operators of same precedence


       int valA = 21;
       int valB = 6;
       int valC = 3;
       int valD = 1;

       //division and then subtraction
       int result1 = valA - valB / valC;

       // paren then division
       int result2 = (valA - valB)/valC;

       System.out.println(result1);


       System.out.println(result2);
      //division then multiplication then addition
       int result3 = valA / valC * valD + valB;
       // inner paren, then outer paren then division
       int result4 = valA / (valC * (valD + valB));


        System.out.println(result3);

        System.out.println(result4);


    }


    public static void javaOperators(){
        int myval = 5;

        // prefix operator
         System.out.println("prefix operator "  + ++myval);
        System.out.println("prefix operator "  + myval);

        // post fix operator
        System.out.println("postfix operator "  +  myval++);
        System.out.println("postfix operator "  +  myval);



    }

    //</editor-fold>


}
