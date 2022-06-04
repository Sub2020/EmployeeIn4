package project;

//hello check check check

import java.util.Scanner;

public class EmployeeIn4 {
    public static void main(String[] args) {


        int choice;
        String answer = null;
        Scanner scan = new Scanner(System.in);

        do {


            System.out.println(" . . . . . . . . . Welcome to Software Company . . . . . . . . . . .");

            System.out.println("Please Enter the name of the Employee: ");
            String empName = scan.nextLine();
            System.out.println("Please Enter the Employee Department: ");
            String empDprmt = scan.nextLine();
            System.out.println("Please Enter the ID of Employee: ");
            int empId = scan.nextInt();


            System.out.println("Employee Name: " + empName);
            System.out.println("Employee ID: " + empId);
            System.out.println("Employee Department: " + empDprmt);

            System.out.println("do you want to convert other amount? 1- Yes, 2- No");
           //answer = sc.nextInt();


        }while (answer == 1);

        System.out.println("Subrat keep on trying");

    }
}

