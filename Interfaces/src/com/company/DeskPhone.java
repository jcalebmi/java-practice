package com.company;

public class DeskPhone implements ITelephone{

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
        this.isRinging = isRinging;
    }

    @Override
    public void powerOn() {
        System.out.println("No Power Button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Ringing " + phoneNumber);
    }

    @Override
    public void answer() {
        System.out.println("Answering desk phone");
        isRinging = false;
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Ring ring");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
