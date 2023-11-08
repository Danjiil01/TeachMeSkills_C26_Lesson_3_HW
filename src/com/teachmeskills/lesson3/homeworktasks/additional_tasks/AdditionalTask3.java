package com.teachmeskills.lesson3.homeworktasks.additional_tasks;

import java.util.Scanner;

public class AdditionalTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int sum = 0;
        int originalNumber = number;

        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println("The sum of digits of " + originalNumber + " equals to " + sum);
    }

}
