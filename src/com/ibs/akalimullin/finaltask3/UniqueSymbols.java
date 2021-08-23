package com.ibs.akalimullin.finaltask3;

import java.util.Scanner;

public class UniqueSymbols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Количество строк: ");
        int rowsAmount = Integer.parseInt(sc.next());

        int uniqueCounter = 0;
        String uniqueWord = "";

        for (int x = 1; x <= rowsAmount; x++) {
            System.out.printf("Строка %d: ", x);
            String row = sc.next();

            int uniqueSymbols = row.replaceAll("(.)(?=.*?\\1)", "").length();

            if (uniqueSymbols > uniqueCounter) {
                uniqueCounter = uniqueSymbols;
                uniqueWord = row;
            } else if (uniqueSymbols == uniqueCounter) {
                continue;
            }
        }

        System.out.println("Ответ: " + uniqueWord);
    }
}
