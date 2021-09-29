package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        printConversion(95.75);
//        printMegaBytesAndKiloBytes(2500);
//        shouldWakeUp(true, 23);
        isLeapYear(1855);

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

    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
        if(hourOfDay < 0 || hourOfDay > 24) {
            return false;
        }
        boolean wakeUp = false;
       if (!barking) {
           return false;
       } else {
           wakeUp = hourOfDay > 22 || hourOfDay < 8 ? true : false;
       }

       return wakeUp;
    }

    public static boolean isLeapYear (int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (year % 4 == 0) {
            return false;
        }
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                return true;
            } else {
                System.out.println(year % 100);
                return false;
            }
        } else {
            System.out.println(year % 100);
            return true;
        }
    }

}
