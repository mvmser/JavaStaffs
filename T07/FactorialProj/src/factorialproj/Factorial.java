package factorialproj;

public class Factorial 
{
    public static void main(String[] args) 
    {
        calculateFactorial();
    }

    static void calculateFactorial()
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Factorial: ");
        int f = sc.nextInt();
        int factorial = 1;
        
        for(int i = 0; i < f; i++)
        {
            factorial = factorial * (f - i);
        }
        
        System.out.printf("%d! = %d \n", f, factorial );
    }
}
