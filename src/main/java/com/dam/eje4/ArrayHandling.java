package com.dam.eje4;

import java.util.Scanner;

public class ArrayHandling {

    static int [] values = new int[10];

    public static void main(String[] args) {

        fillVector(values);

        showVector();

        averageVector();


    }

    private static void averageVector() {
        int contPos = 0;
        int contNeg = 0;
        double mediaPos;
        double mediaNeg;
        int sumaPos = 0;
        int sumaNeg = 0;

        for (int i = 0; i < values.length; i++) {

            if (values[i] > 0) {
                contPos++;
                sumaPos += values[i];
            }else if (values[i] < 0) {
                contNeg++;
                sumaNeg += values[i];
            }else {

            }
        }

        if (contPos > 0) {

            mediaPos = (double)sumaPos / contPos;
            System.out.println("\nThe average number of positives is: " + mediaPos);

        }else {
            System.out.println("No positive numbers have been entered");
        }

        if (contNeg > 0) {
            mediaNeg = (double)sumaNeg / contNeg;

            System.out.println("\nThe average of the negatives is: " + mediaNeg);
        }else {
            System.out.println("No negative numbers have been entered");
        }


    }

    private static void showVector() {
        System.out.print(" { ");

        for (int i = 0; i < values.length; i++) {
            if (i != values.length -1){
                System.out.print(values[i] + ", ");
            }else {
                System.out.print(values[i]);
            }
        }
        System.out.print(" }");

    }

    private static void fillVector(int[] values) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < values.length ; i++) {
            System.out.println("Enter value " + (i+1) + "º");
            values[i] = Integer.parseInt(sc.nextLine());
        }

        sc.close();


    }
}
