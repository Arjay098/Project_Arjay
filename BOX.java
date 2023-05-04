/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author Student
 */
public class BOX {
    String Type;
    double Sides;
    double size;
    double area;
    String style;
    double weight;
    double thickness;
    String color;
    double volume;
    String strength;
    
    public BOX() {
           
}

void Paran_printName() {
System.out.println("Lemon Square WOW Square Lemon");

    
}


int compute_SUM( int length, int width){
    
    return length+width;
}

int compute_Product(int length, int width){

return length*width;

}

int Computer_Power(int base, int power){
    int ans=1;
    for(int i = 0; i <power; i++){
        ans=ans*base;
    }
    
    return ans;
}

