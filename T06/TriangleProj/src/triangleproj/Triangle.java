package triangleproj;
public class Triangle
{
    public static void main(String[] args)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("How many row ? ");
        int nbRows = sc.nextInt();
        
        for(int i = 0; i < nbRows; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
