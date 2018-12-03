package oddorevenproj;
import java.util.*;

/**
 *
 * @author Mohamed SERHIR
 */
public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isNumber = false;
        int number = 0;
        
        do{
            System.out.print("Input an integer : ");
            try{
                number = sc.nextInt();
                isNumber = true;
            }catch(InputMismatchException e){
                 System.out.println("Please enter a number.");
                 sc.nextLine();
            }
        }while(isNumber == false);
        
        
        if(number%2 == 0)
            System.out.println(number + " is an even integer !");
        else
            System.out.println(number + " is an odd integer !");   
    }
    
}
