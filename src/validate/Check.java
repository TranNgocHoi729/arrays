/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validate;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Check {
    Scanner sc = new Scanner(System.in);
    public int getNumber(){
        while(true){
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
