package smallestinarrayproj;

public class SmallestInArray 
{
    public static void main(String[] args) 
    {
        int[] tab = new int[10];
        
        initArray(tab);
        printArray(tab);
        smallestValue(tab);
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
    public static void smallestValue(int[] tab)
    {
        int minValue = Integer.MAX_VALUE;
        System.out.print("Smallest value: ");
        for(int i = 0; i < tab.length ; i++)
        {
            if(tab[i] < minValue)
                minValue = tab[i];
        }
        System.out.println(minValue);
    }
    
}
