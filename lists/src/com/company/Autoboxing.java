package com.company;

import java.util.ArrayList;

public class Autoboxing {

    public static void main(String[] args) {
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();

        for (int i = 0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }

        for(int i= 0; i <= 10; i++) {
            System.out.println(intArrayList.get(i).intValue());
        }

        ArrayList<Double> doubleValues = new ArrayList<Double>();

        for (double dbl=0.0; dbl <=10.0; dbl += 0.5) {
            doubleValues.add(Double.valueOf(dbl));
        }

        for(int i = 0; i < doubleValues.size(); i++) {
            double value = doubleValues.get(i).doubleValue();
            double easy = doubleValues.get(i);
            System.out.println(value);
        }
    }



}
