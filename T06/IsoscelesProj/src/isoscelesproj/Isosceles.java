package isoscelesproj;

public class Isosceles
{
    public static void main(String[] args)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("How many row ? ");
        int nbRows = sc.nextInt();
        
        for(int i = nbRows; i > 0; i--)
        {
            for(int j = 0; j < i; j++)
            {
                if(i != nbRows && j == 0)
                {                        
                    for(int x = 0; x < nbRows - i; x++)
                    {
                        System.out.print(" ");
                    }
                }
                System.out.print("* ");   
            }
            System.out.println("");       
        }
    }
}