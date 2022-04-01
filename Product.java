/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

import java.util.Scanner;

/**
 *
 * @author sjcet
 */
public class Product {
    int pcode;
    String pname;
    int price;
public Product(){
Scanner s=new Scanner(System.in);
    System.out.println("ENTER THE PRODUCT CODE:");
    pcode=s.nextInt();
    System.out.println("ENTER THE PRODUCT NAME:");
    pname=s.next();
    System.out.println("ENTER THE PRICE:");
    price=s.nextInt();
}
public void disp()
{
    System.out.println("details of the product which has lowest price");
    System.out.println("product code is:"+pcode);
    System.out.println("product name is:"+pname);
    System.out.println("product price is:"+price);
    }

    public static void main(String[] args) {
      Product p1=new Product();
      Product p2=new Product();
      Product p3=new Product();
        if(p1.price<p2.price&&p1.price<p3.price)
            p1.disp();
           else if(p2.price<p1.price&&p2.price<p3.price) 
                    p2.disp();
             else 
                p3.disp();
    }
    
}