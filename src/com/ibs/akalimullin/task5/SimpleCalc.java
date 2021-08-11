package com.ibs.akalimullin.task5;

import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double x = in.nextDouble();
        double y = in.nextDouble();
        String action = in.next();

        switch (action) {
            case "+":
                System.out.println(x + y);
                break;
            case "-":
                System.out.println(x - y);
                break;
            case "*":
                System.out.println(x * y);
                break;
            case "/":
                System.out.println(x / y);
                break;
            default:
                System.out.println("Операция не найдена");
        }
    }
}
