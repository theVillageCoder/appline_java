package com.ibs.akalimullin.task8;

import java.util.Scanner;

public class SumUneven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите любое целое положительное число");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }

        System.out.printf("Сумма нечетных чисел от 1 до %d равна %d", num, sum);
    }
}
