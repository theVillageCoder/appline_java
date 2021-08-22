package com.ibs.akalimullin.task12;

public class LikeJava {
    public static void main(String[] args) {
        String str = "I like Java!!!";

        if (str.contains("Java") && str.startsWith("I like") && str.endsWith("!!!")) {
            System.out.println(str.toUpperCase());
            String strO = str.replace('a', 'o');
            System.out.println(strO.substring(7,11));
        }


    }
}
