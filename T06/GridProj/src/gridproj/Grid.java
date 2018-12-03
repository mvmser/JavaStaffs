package gridproj;

public class Grid 
{
    public static void main(String[] args) 
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Heigth: ");
        int heigth = sc.nextInt();
        System.out.print("Width: ");
        int width = sc.nextInt();
        
        char grid[][] = new char[heigth][width];
        
        for(int i = 0; i < heigth; i++)
        {
            for(int j = 0; j < width; j++)
            {
               grid[i][j] = '*';
               System.out.print(grid[i][j]);
            }
            System.out.println("");
        }
    }
}
