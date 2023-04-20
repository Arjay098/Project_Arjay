/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew.topic;

import java.util.stream.IntStream;

/**
 *
 * @author Student
 */
public class NewTopic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
     double A [ ]={1,3,4,5,20,21,89,23};
    
     double length= A.length;
     
  
    double sum=0;
      for (int i=0; i < A.length; i++){
         sum+=A[i];
     System.out.println("Sum of array is :" + sum);
  
     
    
    }
 
   double average = sum/A.length;  
     System.out.println("Sum of array is :" + sum);
   System.out.println("Average of array is:" + average);
    }
}

