package shapesproj;

public class Shapes
{
    public static void main(String[] args)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
       
        int choice, rows = 0;
        
        do
        {
            System.out.println("---- Please choose ----");
            System.out.println("1. Left-aligned, right-angled");
            System.out.println("2. Right-aligned, right-angled");
            System.out.println("3. Triangle Isosceles");
            System.out.println("4. Triangle Inverted isosceles");
            System.out.println("5. Rectangle");
            System.out.println("6. Quit");
            
            choice = sc.nextInt();
            
            if(choice >= 1 && choice < 5)
            {
                System.out.print("How many rows ? ");
                rows = sc.nextInt();
            }
                     
            switch (choice)
            {
                case 1:
                    for(int i = 0; i < rows; i++)
                    {
                        for(int j = 0; j <= i; j++)
                        {                                
                            if(j == 0 || j == i  || i == rows - 1)
                                System.out.print("* ");
                            else 
                                System.out.print("  ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    for(int i = 0; i < rows; i++)
                    {
                        for(int j = 0; j <= rows; j++)
                        {                                
                            if(j == rows - 1 || (i == rows - 1 && j != rows) || j == rows - (i + 1))
                                System.out.print(" *");
                            else 
                                System.out.print("  ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    for(int i = 0; i < rows; i++)
                    {
                        for(int j = 0; j <= i; j++)
                        {
                            if(i != rows - 1 && j == 0)
                            {
                                for(int x = 0; x < rows - 1 - i; x++)
                                    System.out.printf(" ");  
                            }
                            if(i == rows - 1 || j == 0 || j == i)
                                System.out.printf("* "); 
                            else
                                System.out.printf("  "); 
                        }
                        System.out.println("");       
                    }  
                    break;
                case 4:
                    for(int i = rows; i > 0; i--)
                    {
                        for(int j = 0; j < i; j++)
                        {
                            if(i != rows && j == 0)
                            {                        
                                for(int x = 0; x < rows - i; x++)
                                {
                                    System.out.print(" ");
                                }
                            }
                            if(j == 0 || i == rows || j == i - 1)
                                System.out.printf("* ");
                            else 
                                System.out.printf("  ");
                        }
                        System.out.println("");       
                    }
                    break;
                case 5:
                    System.out.print("Width ? ");
                    int w = sc.nextInt();
                    
                    System.out.print("Hight ? ");
                    int h = sc.nextInt();
                    
                    for(int i = 0; i < w; i++)
                    {
                        for(int j = 0; j < h; j++)
                        {
                            if(i == 0 || j == 0 || i == w - 1 || j == h - 1)
                                System.out.printf("* "); 
                            else
                                System.out.printf("  ");                     
                        }
                        System.out.println("");       
                    }
                    break;
            }    
        }while(choice != 6);
    }
}