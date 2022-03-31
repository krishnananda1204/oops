/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largestamong3num;

import java.util.Scanner;

/**
 *
 * @author sjcet
 */
public class Largestamong3num {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1,num2,num3;
        System.out.println("ENTER THREE INTEGERS:");
        Scanner in=new Scanner(System.in);
        num1=in.nextInt();
        num2=in.nextInt();
        num3=in.nextInt();
        if(num1>num2 && num1>num3)
            System.out.println("THE LARGEST NUMBER IS:"+num1);
        else if (num2>num1 && num2>num3) 
            System.out.println("THE LARGEST NUMBER IS:"+num2);
        else if (num3>num1 && num3>num2) 
            System.out.println("THE LARGEST NUMBER IS:"+num3);
        else
            System.out.println("THE NUMBERS ARE SAME");
            
        }
            
        }
    
    }
    
}
