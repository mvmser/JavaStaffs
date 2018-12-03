package smallest4proj;

public class Smallest4 {

    public static void main(String[] args) 
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        int tab[] = new int[4];
        
        for(int i = 0; i < 4; i++)
        {
            System.out.printf("Integer %d: ", i+1);
            tab[i] = sc.nextInt();
        }
        
        System.out.printf("\n%d is smaller\n", smaller(smaller(tab[0], tab[1]), smaller(tab[2], tab[3]) ));
    }
    
    static int smaller(int a, int b)
    {
        if(a < b)
            return a;
        else
            return b;
    }
}
