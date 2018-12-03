package timetakenproj;

import java.util.Scanner;

public class TimeTaken 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        double a = 9.8;

        System.out.print("Distance in meters: ");
        double s = sc.nextDouble();
        sc.nextLine();
        
        double t = Math.sqrt((2 * s) / a);
        System.out.printf("Time taken in seconds: %.2f \n", t);
    }
    
}
