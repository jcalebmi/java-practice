package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ITelephone timsPhone = new DeskPhone(12345);

        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new MobilePhone(23456);
        timsPhone.callPhone(23456);
        timsPhone.answer();
    }
}
