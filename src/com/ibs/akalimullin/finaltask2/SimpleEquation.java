package com.ibs.akalimullin.finaltask2;

import java.util.Scanner;

public class SimpleEquation {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Ввод: ");
            String equation = sc.nextLine();

            if (equation.length() != 5) {
                System.out.println("Длина строки должна быть равной 5 символам!");
                continue;
            }

            char[] equationChars = equation.toCharArray();
            char action = equationChars[1];

            if ((action == '+' || action == '-') && equationChars[3] == '=') {
                if (equationChars[0] == 'x') {
                    int firstNumber = Integer.parseInt(String.valueOf(equationChars[2]));
                    int secondNumber = Integer.parseInt(String.valueOf(equationChars[4]));

                    switch (action) {
                        case '+':
                            System.out.println("Вывод: " + (secondNumber - firstNumber));
                            break;
                        case '-':
                            System.out.println("Вывод: " + (secondNumber + firstNumber));
                            break;
                    }
                } else if (equationChars[2] == 'x') {
                    int firstNumber = Integer.parseInt(String.valueOf(equationChars[0]));
                    int secondNumber = Integer.parseInt(String.valueOf(equationChars[4]));

                    switch (action) {
                        case '+':
                            System.out.println("Вывод: " + (secondNumber - firstNumber));
                            break;
                        case '-':
                            System.out.println("Вывод: " + (firstNumber - secondNumber));
                            break;
                    }
                } else if (equationChars[4] == 'x') {
                    int firstNumber = Integer.parseInt(String.valueOf(equationChars[0]));
                    int secondNumber = Integer.parseInt(String.valueOf(equationChars[2]));

                    switch (action) {
                        case '+':
                            System.out.println("Вывод: " + (firstNumber + secondNumber));
                            break;
                        case '-':
                            System.out.println("Вывод: " + (firstNumber - secondNumber));
                            break;
                    }
                }
            } else {
                System.out.println("Некорректно составленное уравнение!");
                continue;
            }
        }



    }
}
