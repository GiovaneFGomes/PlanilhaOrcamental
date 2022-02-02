package com.giovane.employee;

import com.giovane.spreadsheet.Spreadsheet;

import java.util.Scanner;

public class Employee extends Spreadsheet {

    private final String name;
    private final String area;
    private final Integer age;

    public Employee(String name, String area, Integer age) {
        this.name = name;
        this.area = area;
        this.age = age;
        this.choiceArea();
    }

    public String getName() {
        return name;
    }

    public String getArea() {
        return area;
    }
    
    public int getAge() {
        return age;
    }

    public void showEmployeeData() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Area: " + getArea());
        System.out.println("----------------------------------");
    }

    @Override
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
                    showEmployeeData();
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
                    showEmployeeData();
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
                    showEmployeeData();
                } else {
                    System.out.println("Password invalid");
                }
            }

        }

    }

}
