/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_ivan;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Project_Ivan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
       Scanner input = new Scanner(System.in); 
            int square;
            System.out.println("Enter a number");

            int a = input.nextInt();
            square = a * a;
            System.out.println(square);

            if (square >= 36 && square <= 199) {
                System.out.println("The number belongs between 36 and 199! \n enter  number: \n");
                int x = input.nextInt();

                int cube = x * x * x;

                int difference= square+ cube;
                
                System.out.println("the difference is :" + difference);

            }
            else{
                System.out.println("the number if squared will not belong between 36 and 199");
            }
    }
    
}
