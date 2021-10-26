package com.company;

public class parsingStrings {
    public static void main(String[] args) {
        String numberString = "2018";

        int number = Integer.parseInt(numberString);
        System.out.println(number);

        String doubleStr = "2018.123";
        double doubleNum = Double.parseDouble(doubleStr);

        System.out.println(doubleNum);

    }
}
