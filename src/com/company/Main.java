package com.company;

import com.company.models.Product;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product code in following format:");
        System.out.println("Vertical coordinate A-E: horizontally coordinate 1-5: product count");

        Command command = new Command(scanner.nextLine());
        VendingMachine vendingMachine = new VendingMachine();
        Product product = vendingMachine.giveProduct(command);

        vendingMachine.initializeBoard();
        vendingMachine.initializeProductsArrays();
        vendingMachine.removeProducts(command);

        System.out.print(product);
        vendingMachine.showProductBalance(command);
        System.out.println();
    }
}