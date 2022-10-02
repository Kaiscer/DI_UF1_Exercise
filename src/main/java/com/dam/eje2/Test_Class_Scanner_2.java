package com.dam.eje2;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Test_Class_Scanner_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean valueOK = true;
        double logCirc;
        double areaCirc;
        double rd;
        while (valueOK){

            try{
                System.out.println("Please enter the radius of the circumference");
                rd = Double.parseDouble(sc.nextLine());

                if (rd > 0){

                    logCirc = Math.round(2*PI*rd);

                   areaCirc = Math.round(PI*Math.pow(rd,2));


                    System.out.println("The longitude and Area of the circumference is: "
                            + logCirc + "cm - " + areaCirc + "cm");


                    valueOK = false;
                }else {
                    throw new Exception("Value Incorrect");
                }

            }catch (NumberFormatException e){
                System.out.println("The program only accepts decimal number");
            }catch (Exception e){
                System.out.println(e.getMessage());
            }


        }






        sc.close();
    }
}
