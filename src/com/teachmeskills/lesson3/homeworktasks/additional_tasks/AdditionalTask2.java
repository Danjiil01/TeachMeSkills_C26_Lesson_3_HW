package com.teachmeskills.lesson3.homeworktasks.additional_tasks;

import java.util.Scanner;

public class AdditionalTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the geometric shape: 1 - rectangle, 2 - triangle, 3 - circle");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter length and width for rectangle:");
                double length = sc.nextDouble();
                double width = sc.nextDouble();
                double rectangleArea = length * width;
                System.out.println("Rectangle area equals to " + rectangleArea);
                break;

            case 2:
                System.out.println("Enter the sides of triangle:");
                double side1 = sc.nextDouble();
                double side2 = sc.nextDouble();
                double side3 = sc.nextDouble();
                double s = (side1 + side2 + side3) / 2;
                double triangleArea = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
                System.out.println("Triangle area equals to: " + triangleArea);
                break;

            case 3:
                System.out.println("Enter the radius for circle:");
                double radius = sc.nextDouble();
                double circleArea = Math.PI * radius * radius;
                System.out.println("Circle area equals to: " + circleArea);
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
    }

}
