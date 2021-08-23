package com.ibs.akalimullin.finaltask3;

import java.util.Scanner;

public class UniqueSymbols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Количество строк: ");
        int rowsAmount = Integer.parseInt(sc.next());

        String[] strArray = new String[rowsAmount];
        for (int x = 1; x <= strArray.length; x++) {
            System.out.printf("Строка %d: ", x);
            String row = sc.next();
            strArray[x-1] = row;
        }

        int uniqueCounter = 0;
        String uniqueWord = "";

        for (int i = 0; i < strArray.length; i++) {
            int uniqueSymbols = strArray[i].replaceAll("(.)(?=.*?\\1)", "").length();

            if (uniqueSymbols > uniqueCounter) {
                uniqueCounter = uniqueSymbols;
                uniqueWord = strArray[i];
            } else if (uniqueSymbols == uniqueCounter) {
                continue;
            }
        }
        System.out.println("Ответ: " + uniqueWord);
    }
}
