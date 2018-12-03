package distanceproj;

import java.util.Scanner;

public class Distance 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Initial velocity: ");
        double u = sc.nextDouble();
        sc.nextLine();
        
        System.out.print("Time taken: ");
        double t = sc.nextDouble();
        sc.nextLine();
        
        System.out.print("Acceleratio: ");
        double a = sc.nextDouble();
        sc.nextLine();
        
        double s = u * t + (a * t * t)/2;
        System.out.print("Distance: " + s + "\n");
        
    }
    
}
