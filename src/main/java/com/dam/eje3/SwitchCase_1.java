package com.dam.eje3;

import java.util.Scanner;

public class SwitchCase_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month;
        int days = 0;
        String name = "";
        boolean valueOk = true;


        while (true) {
            try {

                System.out.println("Enter the number of the month");
                month = Integer.parseInt(sc.nextLine());

                switch (month) {
                    case 1 -> {
                        name = "January";
                        days = 31;
                    }
                    case 2 -> {
                        name = "February";
                        days = 28;
                    }
                    case 3 -> {
                        name = "March";
                        days = 31;
                    }
                    case 4 -> {
                        name = "April";
                        days = 30;
                    }
                    case 5 -> {
                        name = "May";
                        days = 31;
                    }
                    case 6 -> {
                        name = "June";
                        days = 30;
                    }
                    case 7 -> {
                        name = "July";
                        days = 31;
                    }
                    case 8 -> {
                        name = "August";
                        days = 31;
                    }
                    case 9 -> {
                        name = "September";
                        days = 30;
                    }
                    case 10 -> {
                        name = "October";
                        days = 31;
                    }
                    case 11 -> {
                        name = "November";
                        days = 30;
                    }
                    case 12 -> {
                        name = "December";
                        days = 31;
                    }
                    default -> throw new Exception("The month of the year run from 1 to 12 ");
                }

                System.out.println("The month " + month + " is " + name + " and have " + days + " days");


                sc.close();
                break;

                }catch (NumberFormatException e){
                    System.out.println("The program  only accepts numbers integers");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
        }



    }



}
