
import java.util.Scanner;

public class MakeMeBetter
{
    public static void main(String[] args)
    {
        int a1, a2, a3, a4;
        Scanner b = new Scanner(System.in);
        
        System.out.println("Please input 4 numbers in the range 1-19 :> ");
        int c = b.nextInt();
        while (c < 1 || c > 19)
        {
            System.out.println("Not in the range 1-19, please try again :> ");
        }
        a1 = c;
        
        int d = b.nextInt();
        while (d < 1 || d > 19)
        {
            System.out.println("Not in the range 1-19, please try again :> ");
        }
        a2 = d;
        
        int e = b.nextInt();
        while (e < 1 || e > 19)
        {
            System.out.println("Not in the range 1-19, please try again :> ");
        }
        a3 = e;
        
        int f = b.nextInt();
        while (f < 1 || f > 19)
        {
            System.out.println("Not in the range 1-19, please try again :> ");
        }
        a4 = f;
        

        System.out.println("\nThe numbers you input:");
        System.out.print((a1 < 10 ? " " : "") + a1 + "  ");
        System.out.print((a2 < 10 ? " " : "") + a2 + "  ");
        System.out.print((a3 < 10 ? " " : "") + a3 + "  ");
        System.out.print((a4 < 10 ? " " : "") + a4 + "  ");
        System.out.println();
        
        double min = a1;
        if (a2 < min)
        {
            min = a2;
        }
        if (a3 < min)
        {
            min = a3;
        }
        if (a4 < min)
        {
            min = a4;
        }
        
        double max = a1;
        if (a2 > max)
        {
            max = a2;
        }
        if (a3 > max)
        {
            max = a3;
        }
        if (a4 > max)
        {
            max = a4;
        }
        
        double ave = (a1 + a2 + a3 + a4) / 4;
        
        System.out.println("The minimum number is: " + min);
        System.out.println("The maximum number is: " + max);
        System.out.println("The average value is: " + ave);
    }
}