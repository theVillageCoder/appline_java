package com.ibs.akalimullin.task7;

import java.util.Scanner;

public class ConstArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int x = 5;
        final int y = 10;
        final int z = 15;

        System.out.println("Введите размер массива");
        int arraySize = sc.nextInt();
        int array[] = new int[arraySize];
        System.out.println("Введите числа");

        for (int i = 0; i < arraySize; i++) {
            int num = sc.nextInt();
            array[i] = num;
            if (array[i] == x || array[i] == y || array[i] == z)
                System.out.println("Данное значение имеется в константах");
        }
    }
}
