package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Customer customer = new Customer("timm", 54.96);

        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println(customer.getBalance());


        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        for (int i = 0; i <intList.size(); i++) {
            System.out.println(intList.get(i));
        }
        intList.add(1, 2);

        for(int i = 0; i <intList.size(); i++) {
            System.out.println(intList.get(i));
        }
    }
}
