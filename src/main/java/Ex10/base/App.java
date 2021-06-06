/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xander Wilhelm
 */

package Ex10.base;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        double tax = 0.055;
        double itemPrice1 = myApp.getItemPrice1();
        int itemCount1 = myApp.getItemCount1();
        double itemPrice2 = myApp.getItemPrice2();
        int itemCount2 = myApp.getItemCount2();
        double itemPrice3 = myApp.getItemPrice3();
        int itemCount3 = myApp.getItemCount3();
        double subtotal = myApp.calc(itemPrice1, itemPrice2, itemPrice3, itemCount1, itemCount2, itemCount3);
        double taxAlone = myApp.calcTax(subtotal, tax);
        double total = myApp.calcFinal(subtotal, taxAlone);
        String output = myApp.genOutput(subtotal, taxAlone, total);
        myApp.output(output);
    }

    private void output(String output) {
        System.out.print(output);
    }

    private String genOutput(double subtotal, double taxAlone, double total) {
        return "Subtotal: $" + String.format("%.2f", subtotal) + "\nTax: $" + String.format("%.2f", taxAlone) + "\nTotal: $" + String.format("%.2f", total);
    }

    private double calcFinal(double subtotal, double taxAlone) {
        return subtotal + taxAlone;
    }

    private double calcTax(double subtotal, double tax) {
        return subtotal * tax;
    }

    private double calc(double itemPrice1, double itemPrice2, double itemPrice3, int itemCount1, int itemCount2, int itemCount3) {
        return ((itemPrice1 * itemCount1) + (itemPrice2 * itemCount2) + (itemPrice3 * itemCount3));
    }

    private double getItemPrice1() {
        System.out.print("Enter the price of item 1: ");
        return Double.parseDouble(in.nextLine());
    }

    private int getItemCount1() {
        System.out.print("Enter the quantity of item 1: ");
        return Integer.parseInt(in.nextLine());
    }

    private double getItemPrice2() {
        System.out.print("Enter the price of item 2: ");
        return Double.parseDouble(in.nextLine());
    }

    private int getItemCount2() {
        System.out.print("Enter the quantity of item 2: ");
        return Integer.parseInt(in.nextLine());
    }

    private double getItemPrice3() {
        System.out.print("Enter the price of item 3: ");
        return Double.parseDouble(in.nextLine());
    }

    private int getItemCount3() {
        System.out.print("Enter the quantity of item 3: ");
        return Integer.parseInt(in.nextLine());
    }

}
