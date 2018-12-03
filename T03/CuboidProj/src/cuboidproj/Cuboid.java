package cuboidproj;

import java.util.Scanner;

public class Cuboid
{
    public static void main(String[] args)
    {
        int large;
        int weight;
        int height;
        
        Scanner sc = new Scanner(System.in);
        
        do
        {
            System.out.print("Enter positive large: ");
            large = sc.nextInt();

            System.out.print("Enter positive weight: ");
            weight = sc.nextInt();

            System.out.print("Enter positive height: ");
            height = sc.nextInt();
        }while(large < 0 || weight < 0 || height < 0);
        
        System.out.println("");
        
        int cuboidArea = 2 * (large * weight) + 2 * (large * height) + 2 * (weight * height);
        int cuboidVolume = large * weight *height;
        
        System.out.printf("The surface area of your cuboid (%d*%d*%d) is: %d  \n", large, weight, height, cuboidArea);
        System.out.printf("The volume of your cuboid (%d*%d*%d) is: %d \n", large, weight, height, cuboidVolume);
    }  
}
