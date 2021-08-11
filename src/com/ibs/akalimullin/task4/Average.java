package com.ibs.akalimullin.task4;

import java.util.Scanner;


public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();

        double avg = (x + y + z) / 3;
        System.out.println(avg);

        double halfAvg = Math.floor(avg / 2);

        if (halfAvg > 3)
            System.out.println("Программа выполнена корректно");
    }
}
