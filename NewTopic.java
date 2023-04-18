/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew.topic;

/**
 *
 * @author Student
 */
public class NewTopic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        int previous=0;
            int current=1;
        for(int i=1;i<=10;i++){
    
            
      
            int next=previous+current;
            previous=current;
                    current=next;
                    System.out.println(next);
            }
    }
}

