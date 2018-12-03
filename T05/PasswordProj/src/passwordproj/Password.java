package passwordproj;

import java.util.Scanner;

public class Password
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        final String PASSWORD = "Hey"; 
        
        System.out.print("Password: ");
        String pswd = sc.nextLine();
        
        if(pswd.equals(PASSWORD))
            System.out.println("Welcome back 1");
    }
    
}
