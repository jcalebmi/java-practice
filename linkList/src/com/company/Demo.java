package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Darwin");
        addInOrder(placesToVisit, "Sydney");

        printList(placesToVisit);

        visit(placesToVisit);

    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();

        while(i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("=======");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> i = linkedList.listIterator();

        while(i.hasNext()) {
            int comparison = i.next().compareTo(newCity);

            if(comparison == 0) {
                System.out.println("Already Included");
                return false;
            } else if (comparison > 0) {
                i.previous();
                i.add(newCity);
                return true;
            } else if (comparison < 0) {

            }
        }
        i.add(newCity);
        return true;
    }

    private static void printMenu() {
        System.out.println("Press");
        System.out.println("0 - quit \n" +
                "1- Next city \n" +
                "2- Previous city \n" +
                "3- Menu");
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> i = cities.listIterator();

        if(cities.isEmpty()) {
            System.out.println("No cities");
        } else {
            System.out.println("Visiting " + i.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();

            scanner.nextLine();
            switch(action) {
                case 0:
                    System.out.println("Vacation");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward) {
                        if(i.hasNext()){
                            i.next();
                        }
                        goingForward = true;
                    }
                    if(i.hasNext()) {
                        System.out.println(i.next());
                    } else {
                        System.out.println("End");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward) {
                        if(i.hasPrevious()){
                            i.previous();
                        }
                        goingForward = false;
                    }
                    if(i.hasPrevious()) {
                        System.out.println(i.previous());
                    } else {
                        System.out.println("Start");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }

        }

    }
}
