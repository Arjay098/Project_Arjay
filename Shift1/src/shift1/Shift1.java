/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shift1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Shift1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       Scanner input=new Scanner (System.in) ;
       System.out.println("Enter a Number") ;
       int a = input.nextInt();
       System.out.println(a);
       
       if (a >= 1 && a <= 10)  {
           System.out.println("number between 1 and 10");       
               System.out.println("enter to numbers");
               System.out.println("enter to number 1: ");
          int x = input.nextInt();
          System.out.println("enter number 2: ");
         int y = input.nextInt();
         
         
         
         int sum=x+y;
         System.out.println(" the sum is: "+sum);
       
                               
       } else if (a >= 11 && a <= 20)   {
           System.out.println("number between 11 and 20"); 
            System.out.println("enter to numbers");
               System.out.println("enter to number 1: ");
          int x = input.nextInt();
          System.out.println("enter number 2: ");
         int y = input.nextInt();
       
       
        int difference=x-y;
         System.out.println(" the sum is: "+difference);
       
       
       
       
       } else if  (a >=11 && a <=20)  {
           System.out.println("number between 21 and 22"); 
        } else if  (a == 21 ||  a == 22)  {
            System.out.println("number between 11 and 20"); 
            System.out.println("enter to numbers");
               System.out.println("enter to number 1: ");
          int x = input.nextInt();
          System.out.println("enter number 2: ");
         int y = input.nextInt();
         
         int product=x*y; 
         System.out.println(" the sum is: "+product);
            
            
           } else if  (a == 25 ||  a == 30)  {
            System.out.println("number between 11 and 20"); 
            System.out.println("enter to numbers");
               System.out.println("enter to number 1: ");
          int x = input.nextInt();
          System.out.println("enter number 2: ");
         int y = input.nextInt();
         
         int quotient=x/y; 
         System.out.println(" the sum is: "+quotient); 
         
         
          System.out.println();
       
          
           
   
        
          
   
                  
       }
        
    }
    
}
