package adressproj;

import java.util.Scanner;

public class Adress
{
    public static void main(String[] args)
    {        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Surname: ");
        String surname = sc.nextLine();
        
        System.out.print("House number: ");
        int houseNumber = sc.nextInt();
        sc.nextLine();//clear buffer
        
        System.out.print("Road name: ");
        String roadName = sc.nextLine();
        
        System.out.print("Town: ");
        String town = sc.nextLine();
        
        System.out.printf("Mr and Mrs %s,\n%d, %s \n%s \n", surname, houseNumber, roadName, town);
    }
}
