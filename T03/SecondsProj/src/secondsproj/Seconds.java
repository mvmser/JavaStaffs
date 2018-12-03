package secondsproj;

import java.util.Scanner;

public class Seconds
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int nbSeconds;
        
        do
        {
           System.out.print("Enter a positive number of seconds: ");
           nbSeconds = sc.nextInt();
        }while(nbSeconds < 0);
        
        int hour = nbSeconds/3600;
        int minutes = (nbSeconds%3600) / 60;
        int seconds = (nbSeconds%60);
        
        System.out.printf("Input \t Hour \t Minutes \t Secondes \n%d \t %d \t %d \t \t%d\n", nbSeconds, hour, minutes, seconds);
    }
}
