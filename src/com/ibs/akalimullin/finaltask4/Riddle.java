package com.ibs.akalimullin.finaltask4;

import java.util.Scanner;

public class Riddle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Эй, юзер, отгадай загадку! У тебя три попытки!");
        System.out.println("\"Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает.\"");
        System.out.println("Если нужна подсказка, просто введи слово \"подсказка\"");

        int i = 0;
        while (i < 3) {
            System.out.print("Ответ: ");
            String answer = sc.nextLine().toLowerCase();

            if (answer.equals("заархивированный вирус") && (i < 3)) {
                System.out.println("Правильно!");
                break;
            } else if (answer.equals("подсказка")) {
                System.out.println("Это вирус, но какой же он?");
                i += 2;
                continue;
            } else if (i == 0 || i == 1) {
                System.out.println("Подумай еще!");
                i++;
                continue;
            } else {
                System.out.println("Обидно, приходи в другой раз");
            }
            i++;
        }
    }
}
