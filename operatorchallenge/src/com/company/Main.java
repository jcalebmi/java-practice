package com.company;

public class Main {

    public static void main(String[] args) {
        double val = 20d;
        double val2 = 80d;

        double total = ((val + val2) * 100) % 40;

        boolean isZero = total == 0 ? true : false;

        System.out.println(isZero);

        if (!isZero) {
            System.out.println("Got Remainder");
        }
    }
}
