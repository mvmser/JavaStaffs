package initialsproj;

public class Initials
{
    public static void main(String[] args)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Please enter your full name (first name, second name and surname): ");
        String name = sc.nextLine();
        
        System.out.print("Initials : " + name.charAt(0) +"."+  name.charAt(name.indexOf(" ") + 1) +"."+ name.charAt(name.lastIndexOf(" ") + 1) +"."+ "\n");               
    }
}
