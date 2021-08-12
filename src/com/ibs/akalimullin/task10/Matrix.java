package com.ibs.akalimullin.task10;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество строк матрицы");
        int rows = sc.nextInt();
        System.out.println("Введите количество столбцов матрицы");
        int cols = sc.nextInt();

        int matrix[][] = new int[rows][cols];

        System.out.println("Введите числа");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < matrix[0].length; j++) {
            matrix[0][j] *= 3;
        }
        System.out.println(Arrays.toString(matrix[0]));

    }
}
