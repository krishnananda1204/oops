/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author sjcet
 */
public class Student {
int m1,m2,m3;
Student()
{
    m1=20;
    m2=30;
    m3=40;
    
}
 public void sum()
 {
     int sum;
     sum=m1+m2+m3;
     System.out.println("sum is="+sum);
 }
 public void percentage()
 {
     float percentage;
     percentage=((m1+m2+m3)*100)/300;
     System.out.println("percentage is="+percentage);
 }    
    public static void main(String[] args) {
        Student s=new Student();
        s.sum();
        s.percentage();
        
    }
    
}
