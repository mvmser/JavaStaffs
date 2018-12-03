package averageproj;

import java.util.Scanner;

public class Average
{
    public static void main (String args[])
    {
        Scanner kybd = new Scanner(System.in);
 
        System.out.print("Enter first integer: ");
        int num1 = kybd.nextInt();
        kybd.nextLine(); //clear buffer
        
        System.out.print("Enter second integer: ");
        int num2 = kybd.nextInt();
        kybd.nextLine(); //clear buffer

        System.out.print("Enter third integer: ");
        int num3 = kybd.nextInt();
        kybd.nextLine(); //clear buffer
 
        double ave = (num1 + num2 + num3) / 3.0;
 
        System.out.printf("Average is: %.2f \n", ave);
    }
}

