package com.ibs.akalimullin.task9;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int arraySize = sc.nextInt();
        double array[] = new double[arraySize];
        System.out.println("Введите числа");

        for (int i = 0; i < arraySize; i++) {
            array[i] = sc.nextDouble();
        }

        double avg = Arrays.stream(array).sum() / arraySize;
        for (int i = 0; i < arraySize; i++) {
            array[i] *= avg;
        }
        System.out.println(Arrays.toString(array));
    }
}
