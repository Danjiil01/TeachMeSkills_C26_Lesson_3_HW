package com.teachmeskills.lesson3.homeworktasks.primary_tasks;

public class HomeWork2 {
    public static void main(String[] args) {
        char firstVar = '1';
        int secondVar = 1;
        System.out.println("The result: " + (firstVar + secondVar));
        /* The result is going to be 50 due to the fact that when we try to sum "char" and "int"
        variables, the char variable is being converted from ASCII.
        ASCII stands for American Standard Code for Information Interchange
        In ASCII table the "1" symbol equals to 49. We add 49 to 1 and get 50. */
    }

}
