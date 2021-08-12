package com.ibs.akalimullin.task6;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int massOrDistance = in.nextInt();

        if (massOrDistance == 1) {
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - фунт, 3 - унция, 4 - пуд");
            int massSwitch = in.nextInt();

            if (massSwitch == 1 || massSwitch == 2 || massSwitch == 3 || massSwitch == 4) {
                System.out.println("Введите число");
                double massInput = in.nextDouble();

                switch (massSwitch) {
                    case 1:
                        System.out.printf("Результат:" +
                                "\nКилограммы: " + massInput +
                                "\nФунты: " + massInput*2.205 +
                                "\nУнции: " + massInput*35.274 +
                                "\nПуды: " + massInput/16.381
                        );
                        break;
                    case 2:
                        System.out.printf("Результат:" +
                                "\nКилограммы: " + massInput/2.205 +
                                "\nФунты: " + massInput +
                                "\nУнции: " + massInput*16 +
                                "\nПуды: " + massInput/36.113
                        );
                        break;
                    case 3:
                        System.out.printf("Результат:" +
                                "\nКилограммы: " + massInput/35.274 +
                                "\nФунты: " + massInput/16 +
                                "\nУнции: " + massInput +
                                "\nПуды: " + massInput/578
                        );
                        break;
                    case 4:
                        System.out.printf("Результат:" +
                                "\nКилограммы: " + massInput*16.381 +
                                "\nФунты: " + massInput*36.113 +
                                "\nУнции: " + massInput*578 +
                                "\nПуды: " + massInput
                        );
                        break;
                    default:
                        System.out.println("Введите корректное значение");
                }
            } else {
                System.out.println("Выберите корректную единицу измерения");
            }
        } else if (massOrDistance == 2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int distanceSwitch = in.nextInt();

            if (distanceSwitch == 1 || distanceSwitch == 2 || distanceSwitch == 3 || distanceSwitch == 4) {
                System.out.println("Введите число");
                double distanceInput = in.nextDouble();

                switch (distanceSwitch) {
                    case 1:
                        System.out.printf("Результат:" +
                                "\nМетры: " + distanceInput +
                                "\nМили: " + distanceInput/1609 +
                                "\nЯрды: " + distanceInput*1.094 +
                                "\nФуты: " + distanceInput*3.281
                        );
                        break;
                    case 2:
                        System.out.printf("Результат:" +
                                "\nМетры: " + distanceInput*1609 +
                                "\nМили: " + distanceInput +
                                "\nЯрды: " + distanceInput*1760 +
                                "\nФуты: " + distanceInput*5280
                        );
                        break;
                    case 3:
                        System.out.printf("Результат:" +
                                "\nМетры: " + distanceInput/1.094 +
                                "\nМили: " + distanceInput/1760 +
                                "\nЯрды: " + distanceInput +
                                "\nФуты: " + distanceInput*3
                        );
                        break;
                    case 4:
                        System.out.printf("Результат:" +
                                "\nМетры: " + distanceInput/3.281 +
                                "\nМили: " + distanceInput/5280 +
                                "\nЯрды: " + distanceInput/3 +
                                "\nФуты: " + distanceInput
                        );
                        break;
                    default:
                        System.out.println("Выберите корректную единицу измерения");
                }
            } else {
                System.out.println("Выберите корректную единицу измерения");
            }
        } else {
            System.out.println("Введите корректное значение");
        }
    }
}
