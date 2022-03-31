/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addtwonumbers;

import java.util.Scanner;

/**
 *
 * @author sjcet
 */
public class Addtwonumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num1,num2,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number:");
        num1=sc.nextInt();
        System.out.println("enter the second number:");
        num2=sc.nextInt();
        sc.close();
        sum=num1+num2;
        System.out.println("sum of these numbers:"+sum);
    }
    
}
