package recursivefactorialproj;

public class RecursiveFactorial 
{
    public static void main(String[] args) 
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Factorial: ");
        int f = sc.nextInt();

        System.out.println(calculateFactorial(f));
    }
    static int calculateFactorial(int f)
    {
        if(f == 1)
            return 1;
        if(f < 1)
            return 0;
        
        return f * calculateFactorial(f - 1);
    }
}
