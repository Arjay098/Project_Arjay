/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import static com.sun.javafx.geom.BaseBounds.BoundsType.BOX;

/**
 *
 * @author Student
 */
public class OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       BOX  Circle=new BOX();
       
       Circle.Paran_printName();
       Circle.compute_SUM(10, 5);
       int BOX=Circle.compute_SUM(10, 5);
       int Triangol=Circle.compute_SUM(10, 6)+Circle.compute_SUM(10, 5);
       int Diamon=Circle.compute_SUM(10, 7);
       
       
       
       System.out.println(BOX+" + "+Triangol+" = "+Diamon);
    }
    
}