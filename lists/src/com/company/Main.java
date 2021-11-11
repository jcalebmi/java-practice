package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
	// write your code here
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;

            }
        }
    }
    public static void addItem() {
        System.out.println("Add Item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }
    public static void modifyItem() {
        System.out.println("Enter Item Name; ");
        String itemNo = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryList(itemNo, newItem);
    }
    public static void removeItem(){
        System.out.println("Enter Item Number; ");
        String itemNo = scanner.nextLine();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }
    public static void searchForItem() {
        System.out.println("item to search: ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem);
        } else {
            System.out.println(searchItem + " not found");
        }
    }
    public static void printInstructions() {
        System.out.println("0 TO PRINT CHOICE");
        System.out.println("1 TO PRINT ITEMS");
        System.out.println("2 TO ADD ITEM");
        System.out.println("3 TO MODIFY");
        System.out.println("4 TO REMOVE ITEM");
        System.out.println("5 TO SEARCH");
        System.out.println("6 TO QUIT");
    }
}
