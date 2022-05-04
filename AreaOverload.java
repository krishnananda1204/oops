/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaoverload;
import java.util.Scanner;
/**
 *
 * @author sjcet
 */
public class AreaOverload {

    void  area(int x)
    {
        System.out.println("area of the square:"+(x*x));
         }
    void area(int x,int y)
    {
       System.out.println("area of the circle:"+(x*x*3.14));
    }
    void area(int x,int y,int z)
    {
      
        double s= x+y+z/2;
        double triarea;
        triarea=Math.sqrt(s*(s-x)*(s-y)*(s-z));         
       System.out.println("area of the triangle is:"+triarea);
    }
   
    public static void main(String[] args) {
        AreaOverload obj = new AreaOverload ();
       Scanner s=new Scanner(System.in);
        System.out.println("ENTER SIDE OF SQUARE");
        int side=s.nextInt();
        System.out.println("ENTER RADIUS OF CIRCLE");
        int radius=s.nextInt();
        System.out.println("enter side of triangles");
        int side1=s.nextInt();
        int side2=s.nextInt();
        int side3=s.nextInt();
        
        
        obj.area(side);
        obj.area(radius);
        obj.area(side1,side2,side3);        
    
    
    
}
}
