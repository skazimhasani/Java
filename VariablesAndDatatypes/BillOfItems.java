package VariablesAndDatatypes;

import java.util.Scanner;

public class BillOfItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;
        float newtotal = total + (0.18f * total);
        System.out.println("Total bill with 18% GST is : " + newtotal);
        sc.close();
    }
}
