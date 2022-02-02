package com.giovane.spreadsheet;

import java.util.Scanner;

public class Spreadsheet {

    public void choiceArea() {
        String areaCompany = """
                What area of the company are you from?:\s
                ----------------------------------
                Area A: 1.
                Area B: 2.
                Area C: 3.
                ----------------------------------
                Enter the area number:
                """;

        Scanner scan = new Scanner(System.in);
        System.out.print(areaCompany);

        int passwordA = 191001;
        int passwordB = 181002;
        int passwordC = 171003;
        int number = scan.nextInt();

        switch (number) {

            case 1 -> {
                System.out.println("----------------------------------");
                System.out.print("Enter a password: ");
                int inputPasswordA = scan.nextInt();
                if (inputPasswordA == passwordA) {
                    System.out.println("----------------------------------");
                    System.out.println(showDataAreaA());
                } else {
                    System.out.println("Password invalid");
                }
            }

            case 2 -> {
                System.out.println("----------------------------------");
                System.out.print("Enter a password: ");
                int inputPasswordB = scan.nextInt();
                if (inputPasswordB == passwordB) {
                    System.out.println("----------------------------------");
                    System.out.println(showDataAreaB());
                } else {
                    System.out.println("Password invalid");
                }
            }

            case 3 -> {
                System.out.println("----------------------------------");
                System.out.print("Enter a password: ");
                int inputPasswordC = scan.nextInt();
                if (inputPasswordC == passwordC) {
                    System.out.println("----------------------------------");
                    System.out.println(showDataAreaC());
                } else {
                    System.out.println("Password invalid");
                }
            }

        }

    }


    public final String showDataAreaA(){
        return "Salary: U$1,500";
    }

    public final String showDataAreaB(){
        return "Salary: U$2,500";
    }

    public final String showDataAreaC(){
        return "Salary: U$3,500";
    }

}

