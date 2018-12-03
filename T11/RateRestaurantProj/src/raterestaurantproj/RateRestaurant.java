package raterestaurantproj;
import java.util.*;
/**
 *
 * @author Mohamed SERHIR
 */
public class RateRestaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rate = -1;
        int sum = 0;
        int nbRate = 0;
        ArrayList array = new ArrayList();
        
        do{      
            System.out.print("Please enter a rate: ");

            try{
                rate = sc.nextInt();
            }catch(InputMismatchException e){
                 System.out.println("Please enter a rate between 1 and 5.");
                 sc.nextLine();
            }

            if(rate >= 1 && rate <= 5){
                sum += rate;
                nbRate++;
                array.add(rate);
            }
            else
                System.out.println("Please enter a rate between 1 and 5.");
            
        }while (rate != -1);
        
        System.out.println("The rate are: " + array);   
        System.out.println("The average of rates is: " + sum/nbRate);        
    }
    
}
