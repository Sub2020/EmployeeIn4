package project;

import java.util.Scanner;

public class EmployeeIn4 {
    public static void main(String[] args) {

        int mode;
        Scanner scan = new Scanner(System.in);


        System.out.println(" . . . . . . . . . Welcome to Software Company . . . . . . . . . . .");


        System.out.println("Please Enter the name of the Employee: ");
        String empName = scan.nextLine();
        System.out.println("Please Enter the Employee Department: ");
        String empDprmt = scan.nextLine();
        System.out.println("Please Enter the ID of Employee: ");
        int empId = scan.nextInt();


        System.out.println("Employee Name: "  + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Department: " + empDprmt);
        System.out.println();
        //System.out.println("Please Enter 1 for More Employee information");

        {
            System.out.println("Please Enter 1 for More Employee information");
            System.out.println("Please Enter 2 to Exit");







        }
    }
}
