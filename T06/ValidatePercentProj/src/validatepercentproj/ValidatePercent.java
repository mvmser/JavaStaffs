package validatepercentproj;

public class ValidatePercent
{
    public static void main(String[] args)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int percent = 0;
        
        System.out.print("Please enter a percentage between 0 and 100: ");

        do
        {
            if(percent < 0 || percent > 100)
                System.out.print("Please re-enter a percentage between 0 and 100: ");
            percent = sc.nextInt();
        }while(percent < 0 || percent > 100);
        
    }
    
}
