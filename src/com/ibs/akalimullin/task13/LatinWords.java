package com.ibs.akalimullin.task13;

import java.util.Scanner;

public class LatinWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String [] strArray = str.split(" ");
        int cnt = 0;

        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].matches("^[a-zA-Z]+$")) {
                System.out.println(strArray[i]);
                cnt++;
            }
        }
        System.out.println("Количество слов на латинице равно " + cnt);
    }
}
