package posnegproj;

import java.util.Scanner;

public class PosNeg
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int integer = sc.nextInt();
        
        if(integer < 0)
            System.out.println(integer + " is negative !");
        else if(integer > 0)
            System.out.println(integer + " is positive !");
        else
            System.out.println(integer + " is zero !");
    }  
}
