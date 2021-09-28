package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printConversion(95.75);
        printMegaBytesAndKiloBytes(2500);
    }
    public static long toMilesPerHour (double kilometersPerHour) {
        long mph = Math.round(kilometersPerHour / 1.609);
        return kilometersPerHour < 0 ? -1 : mph;
    }

    public static void printConversion(double kilometersPerHour) {
        long mph = toMilesPerHour(kilometersPerHour);

        if (kilometersPerHour < 0) {
            System.out.print("Invalid Value");
        } else {
            System.out.print(kilometersPerHour + " km/h = " + mph + " mi/h");
        }
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        int MB = kiloBytes / 1024;
        int KB = kiloBytes % 1024;


        System.out.print(kiloBytes + " KB = " + MB + " MB and " + KB + " KB");
    }

}
