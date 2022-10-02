package com.dam.eje1;

import java.util.Random;

public class Conditional_2 {
    private static int MAX = 100;
    private static int MIN = 1;

    public static void main(String[] args) {


        int b = 0;
        Random rd = new Random();

        do {

            b = rd.nextInt(MAX + 1 - MIN)+ MIN;

        }while (b == 0);

        if(b % 2 == 0){
            System.out.println("The number " + b + " is even");
        }else {
            System.out.println("the number " + b + " is odd");
        }


    }
}
