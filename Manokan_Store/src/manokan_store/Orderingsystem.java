

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class Orderingsystem {
    
    public static Scanner input = new Scanner(System.in);
    public static String again;
    public static int choose,quantity=1;
    public static double total=0,pay;
    public static void menu(){
    System.out.println("\t\t\t\t-      MAPAPA WOW KA SA SARAP      -");
  
    System.out.println("\t\t\t\t   1. Chicken Pako        Php.40");
    System.out.println("\t\t\t\t   2. Chicken Unod        Php.50 ");
    System.out.println("\t\t\t\t   3. Chicken Isaw        Php.15");
    System.out.println("\t\t\t\t   4. Chicken Liog        Php.25");
     System.out.println("\t\t\t\t   5. Chicken Panit       Php.20");
    System.out.println("\t\t\t\t   6. Coke                Php.20");
    
  
    }
    
    public static void order(){
      System.out.println("Enter choice (1-7)");
    System.out.print("Unsay Ato? Pili Lang :");
    
    choose = input.nextInt();
        //conditions
        switch (choose) {
            case 1:
                     System.out.println(" Chicken Pako? ");
                System.out.print("Pila Kabuok? :");
                quantity =input.nextInt();
                total = total +(quantity*50);
                System.out.println("Naa pakay lain Paliton? ");
                System.out.println("Enter Y for Yes and N for No : ");
                again = input.next();
                if(again.equalsIgnoreCase("Y")){
                    order();//call the method you to create
                }else{
                    System.out.println("Bayad Please ");
                    pay = input.nextDouble();
                    if(pay <=total){
                        System.out.println("Not enough payment");
                    }else{
                        System.out.println("Total price is " + total);
                        total = pay-total;
                        System.out.println("The change is " + total);
                    }
                }       break;
            case 2:
                System.out.println(" Chicken Unod? ");
                System.out.print("Pila Kabuok? :");
                quantity =input.nextInt();
                total = total +(quantity*50);
                System.out.println("Naa pakay lain Paliton? ");
                System.out.println("Enter Y for Yes and N for No : ");
                again = input.next();
                if(again.equalsIgnoreCase("Y")){
                    order();//call the method you to create
                }else{
                    System.out.println("Bayad Please ");
                    pay = input.nextDouble();
                    if(pay <=total){
                        System.out.println("Not enough payment");
                    }else{
                        System.out.println("Total price is " + total);
                        total = pay-total;
                        System.out.println("The change is " + total);
                    }
                }       break;
            case 3:
                System.out.println("Chicken Isaw?");
                System.out.print("Pila Kabuok? :");
                quantity =input.nextInt();
                total = total +(quantity*60
                        );
                System.out.println("Naa pakay Paliton? ");
                System.out.println("Enter Y for Yes and N for No : ");
                again = input.next();
                if(again.equalsIgnoreCase("Y")){
                    order();//call the method you to create
                }else{
                    System.out.println("Bayad Please ");
                    pay = input.nextDouble();
                    if(pay <=total){
                        System.out.println("Not enough payment");
                    }else{
                        System.out.println("Total price is " + total);
                        total = pay-total;
                        System.out.println("The change is " + total);
                    }
                }
                 case 4:
                System.out.println("Chicken Liog?");
                System.out.print("Pila Kabuok? :");
                quantity =input.nextInt();
                total = total +(quantity*60
                        );
                System.out.println("Mupalit paka? ");
                System.out.println("Enter Y for Yes and N for N : ");
                again = input.next();
                if(again.equalsIgnoreCase("Y")){
                    order();//call the method you to create
                }else{
                    System.out.println("Bayad Please ");
                    pay = input.nextDouble();
                    if(pay <=total){
                        System.out.println("Not enough payment");
                    }else{
                        System.out.println("Total price is " + total);
                        total = pay-total;
                        System.out.println("The change is " + total);
                    }
                }       break;
                case 5:
                System.out.println("Chicken Panit?");
                System.out.print("Pila Kabuok? :");
                quantity =input.nextInt();
                total = total +(quantity*100
                        );
                System.out.println("Mupalit paka? ");
                System.out.println("Enter Y for Yes and N for N : ");
                again = input.next();
                if(again.equalsIgnoreCase("Y")){
                    order();//call the method you to create
                }else{
                    System.out.println("Bayad Please ");
                    pay = input.nextDouble();
                    if(pay <=total){
                        System.out.println("Not enough payment");
                    }else{
                        System.out.println("Total price is " + total);
                        total = pay-total;
                        System.out.println("The change is " + total);
                        
                        
                    }
                }       break;
                
                  case 6:
                System.out.println("Coke?");
                System.out.print("Pila Kabuok? :");
                quantity =input.nextInt();
                total = total +(quantity*100
                        );
                System.out.println("Mupalit paka? ");
                System.out.println("Enter Y for Yes and N for N : ");
                again = input.next();
                if(again.equalsIgnoreCase("Y")){
                    order();//call the method you to create
                }else{
                    System.out.println("Bayad Please ");
                    pay = input.nextDouble();
                    if(pay <=total){
                        System.out.println("Not enough payment");
                    }else{
                        System.out.println("Total price is " + total);
                        total = pay-total;
                        System.out.println("The change is " + total);
                        
                        
                    }
                }       break;
                
            case 7:
                System.exit(0);//close program
            default:
                System.out.println("Choose 1 to 6 only!");
                order();
                break;
        }
    }
    public static void main(String[] args) {
       menu();
       order();
    }
    
}
