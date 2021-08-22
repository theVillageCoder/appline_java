package com.ibs.akalimullin.finaltask1;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Курс доллара: ");
        double usdCurrency = sc.nextDouble();

        System.out.print("Количество рублей: ");
        double rubAmount = sc.nextDouble();

        System.out.printf("Итого: %.2f долларов", rubAmount / usdCurrency);


    }
}
