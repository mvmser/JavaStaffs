package vatproj;

import java.util.Scanner;

public class VAT
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        final int VAT = 20;
        
        System.out.print("Cost of item befor VAT: ");
        double costBeforVAT = sc.nextDouble();
        sc.nextLine();
        
        double amountOfVAT = costBeforVAT * (VAT/100.0);
        double costWithVAT = costBeforVAT + amountOfVAT;
        
        System.out.println("VAT payable: " + amountOfVAT);
        System.out.println("Total cost with VAT: " + costWithVAT);
    }
}
