/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package add;

import java.util.ArrayList;
import java.util.Scanner;
import validate.Check;

public class addANumber {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        addANumber add = new addANumber();
        int[] arr = {1, 3, 4, 5, 6, 8};
        System.out.print("Enter index : ");
        int index = add.getNumberInRange(arr.length);
        System.out.print("Enter number : ");
        int number = add.getNumber();
        arr = add.add(arr, index, number);
        add.prints(arr);

    }

     public void prints(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public int[] add(int[] ar, int index, int number) {
        int newSize = ar.length + 1;
        int[] arrNew = new int[newSize];
        int j = 0;
        for (int i = 0; i < newSize; i++) {
            if (i == index) {
                arrNew[i] = number;
                continue;
            }
            arrNew[i] = ar[j];
            j++;
        }
        return arrNew;
    }

    public int getNumberInRange(int size) {

        while (true) {
            try {
                int num = Integer.parseInt(sc.nextLine());
                if (num <= size && num >= 0) {
                    return num;
                }
                System.out.println("Nmber must be in range ( 0 ," + size + ")");
                System.out.println("Re-Enter : ");
            } catch (NumberFormatException e) {
                System.out.println("Input must be a number !!");
                System.out.println("Enter : ");
            }
        }
    }

    public int getNumber() {
        while (true) {
            try {
                int num = Integer.parseInt(sc.nextLine());
                return num;
            } catch (NumberFormatException e) {
                System.out.println("Input must be a number !!");
                System.out.println("Enter : ");
            }
        }
    }
}
