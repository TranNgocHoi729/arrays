/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package add;

import java.io.Console;

/**
 *
 * @author dell
 */
public class Delete extends addANumber{
    public static void main(String[] args) {
        int[] m = {1,2,3,4,5,6};
        Delete d = new Delete();
        m=d.delete(m, 3);
        d.prints(m);

    }
    public int[] delete(int[] ar, int index){
        boolean check = false;
        for (int i = 0; i < ar.length-1; i++) {
            if(ar[i] ==index){
                check=true;
            }
            if(check == true){
                ar[i] = ar[i+1];
            }
            
        }
        int[] newAr = new int[ar.length-1];
        for (int i = 0; i < newAr.length; i++) {
            newAr[i] = ar[i];
        }
        return newAr;
    }
    public void prints(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
