package com.ibs.akalimullin.task11;

import java.util.Scanner;

public class NumComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число");
        String x = sc.next();

        System.out.println("Введите второе число:");
        int y = sc.nextInt();

        int bigger = 0;
        int smaller = 0;

        if (Integer.parseInt(x) > y) {
            bigger = Integer.parseInt(x);
            smaller = y;
        } else if (Integer.parseInt(x) < y) {
            bigger = y;
            smaller = Integer.parseInt(x);
        }

        double smallerDouble = smaller;

        System.out.println("Большее число: " + bigger);
        System.out.println("Меньшее число: " + smallerDouble);
    }
}
