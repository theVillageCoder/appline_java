package com.ibs.akalimullin.task4;

import java.util.Scanner;


public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextInt();
        double y = in.nextInt();
        double z = in.nextInt();

        double avg = (x + y + z) / 3;
        System.out.println(avg);

        double halfAvg = (avg - avg % 2) / 2;

        if (halfAvg > 3)
            System.out.println("Программа выполнена корректно");
    }
}
