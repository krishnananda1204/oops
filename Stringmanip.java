/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmanip;


import java.util.Scanner;
public class Stringmanip {
    String str1,str2;
    
    Stringmanip(String s1,String s2){
        str1=s1;
        str2=s2;
        
    }
    
    public void strLen(){
        System.out.println("\n The length of string-1 :"+str1.length());
        System.out.println("\n The length of string-2 :"+str2.length());
        
        
    }
    
    public void strConcat(){
        System.out.println("\n Concatenated String-1 and String-2:"+(str1.concat(str2)));
        
    }
    
    public void compare(){
        System.out.println("\n Compare String-1 and String-2 "+(str1.equals(str2)));
    }
    public void LowerCase(){
        System.out.println("\n lowercase of String-1 "+(str1.toLowerCase()));
    }
    public void UpperCase(){
        System.out.println("\n uppercase of String-1 "+(str2.toUpperCase()));
    }
    
    
    public static void main(String[] args) {
        String s1,s2;
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter the String-1");
        s1=sc.nextLine();
        System.out.println("Enter the String-2");
        s2=sc.nextLine();
        
        Stringmanip s=new Stringmanip(s1,s2);
                s.strLen();
                s.strConcat();
                s.compare();
                s.LowerCase();
                s.UpperCase();
        
        
        
        
    }
    
}
