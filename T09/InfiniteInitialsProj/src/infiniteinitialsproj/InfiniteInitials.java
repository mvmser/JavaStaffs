package infiniteinitialsproj;

public class InfiniteInitials 
{
    public static void main(String[] args) 
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("User input: ");
        String name = sc.nextLine();
        name = name.toUpperCase();
        //System.out.println("length: " + name.length());

        System.out.print("Initials : ");
        for(int i = 0; i < name.length(); i++)
        {
            if(name.charAt(0) != ' ' && i == 0)
                System.out.print(name.charAt(i));
            if(name.charAt(i) == ' ' && name.charAt(i+1) != ' ')
                System.out.print(name.charAt(i + 1));
            else if (name.charAt(i) == '-')
                System.out.print("-" + name.charAt(i + 1));
            
            for(int y = i; y <= name.indexOf(' ', i); y++)
            {
                if(name.indexOf('-', i) == -1 && name.charAt(i) == ' ' && name.charAt(i+1) != ' ')
                    System.out.print(".");                    
            }
        }
        System.out.println();        
    }
}
