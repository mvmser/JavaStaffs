package oddorevenproj;

public class OddOrEven
{
    public static void main(String[] args)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Input an integer : ");
        int number = sc.nextInt();
        
        if(number%2 == 0)
            System.out.println(number + " is an even integer !");
        else
            System.out.println(number + " is an odd integer !");      
    }
}
