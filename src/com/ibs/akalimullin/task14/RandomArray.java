package com.ibs.akalimullin.task14;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        Random rnd = new Random();

        int[] array = rnd.ints(10,-20, 20).toArray();
        System.out.println(Arrays.toString(array));

        int minValue = Arrays.stream(array).min().getAsInt();
        System.out.println("Минимальное значение массива: " + minValue);
        int maxValue = Arrays.stream(array).max().getAsInt();
        System.out.println("Максимальное значение массива: " + maxValue);

        System.out.println("Наибольшее значение по модулю: " + Math.max(Math.abs(minValue),Math.abs(maxValue)));


    }
}
