package project;

//hello check check check

import java.util.Scanner;

public class EmployeeIn4 {
    public static void main(String[] args) {


        int choice;
        String answer;
        Scanner scan = new Scanner(System.in);

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

    }


}















