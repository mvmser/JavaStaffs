package gradeproj;

public class Grade
{
    public static void main(String[] args)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int percent = 0;
        
        do
        { 
            if(percent < 0 || percent > 100)
                System.out.print("Please re-enter a percentage between 0 and 100: ");
            else
                System.out.print("Enter a percentage: ");
            
            percent = sc.nextInt();
        }while(percent < 0 || percent > 100);
        
        if (percent >= 70)
            System.out.println("A");
        else if (percent >= 60)
            System.out.println("B");
        else if (percent >= 50)
            System.out.println("C");
        else if (percent >= 40)
            System.out.println("D");
        else
            System.out.println("E");
    }
}
