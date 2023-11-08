package com.teachmeskills.lesson3.homeworktasks.additional_tasks;

public class AdditionalTask1 {
    public static void main(String[] args) {
        int n = 15; //Amount of numbers we want to see in output
        int a = 0;
        int b = 1;
        System.out.print("Fibonacci Numbers: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }

}
