package breakevenproj;

import java.util.Scanner;

public class BreakEven
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the cost per item :");
        double costItem = sc.nextDouble();
        sc.nextLine(); //clear buffer
        
        System.out.print("Enter the price of item :");
        double priceItem = sc.nextDouble();
        sc.nextLine(); //clear buffer
        
        System.out.print("Enter the overhead expenses :");
        double overhead = sc.nextDouble();
        sc.nextLine(); //clear buffer
        
        //Calculate profit
        double profit = priceItem - costItem;
        System.out.println("Profit per item:" + profit);
        
        //Calculate break even
        double profitTotal = 0;
        int nbItem = 0;
        
        while(overhead > profitTotal)        
        {
            nbItem++;
            profitTotal += profit;
        }

        System.out.println("Nb of Item must be sold before break even :" + nbItem);
    }    
}