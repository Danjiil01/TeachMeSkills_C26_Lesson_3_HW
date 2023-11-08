package com.teachmeskills.lesson3.homeworktasks.additional_tasks;

import java.util.Scanner;

public class AdditionalTask1_100Limit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many Fibonacci numbers to generate: ");
        int limit = scanner.nextInt();

        if (limit > 100) {
            limit = 100;
            System.out.println("The maximum number of Fibonacci numbers has been exceeded. The first 100 numbers will be displayed.");
        }

        int n1 = 0, n2 = 1;
        System.out.print("First " + limit + " Fibonacci numbers: ");

        for (int i = 1; i <= limit; ++i) {
            System.out.print(n1 + " ");
            int next = n1 + n2;
            n1 = n2;
            n2 = next;
        }
    }

}
