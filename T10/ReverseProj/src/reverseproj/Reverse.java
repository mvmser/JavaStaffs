package reverseproj;

public class Reverse 
{
    public static void main(String[] args) 
    {
        int[] tab = new int[10];
        
        initArray(tab);
        printArray(tab);
        reverseArray(tab);
    }
    public static void initArray(int[] tab)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        for(int i = 0; i < tab.length ; i++)
        {
            tab[i] = sc.nextInt();
        }
        System.out.println("");
    }
    public static void printArray(int[] tab)
    {
        System.out.println("Print array:");
        for(int i = 0; i < tab.length ; i++)
        {
            System.out.print(tab[i] + " ");
        }
        System.out.println("");
    }
    public static void reverseArray(int[] tab)
    {
        System.out.println("Reverse array:");

        for(int i = tab.length -1; i >= 0 ; i--)
        {
            System.out.print(tab[i] + " ");
        }
        System.out.println("");
    }
}
