package com.dam.eje2;

import java.util.Scanner;

public class Test_Class_Scanner_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean valueOK = true;
        int temFah;

        while (valueOK){

            try{
                System.out.println("Please enter the temperature in degrees celsius: ");
                double temp = Double.parseDouble(sc.nextLine());

                if (temp != 0){

                    temFah = (int) (32 + (9 * temp /5));

                    System.out.println("Today's temperature in degrees celsius is " + temp + "ºC");

                    System.out.println("\nToday's temperature in degrees fahrenheit is " + temFah + "ºF");

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
