package sumposnegproj;

public class SumPosNeg {

    public static void main(String[] args) 
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        final int sizeTAB = 10;
        int intTab[] = new int[sizeTAB];
        int sumNeg = 0;
        int sumPos = 0;
        
        System.out.println("Only positive or negative integer !");
        
        for(int i = 0; i < sizeTAB; i++)
        {
            System.out.print("Please enter number " + (i+1) + ": ");
            intTab[i] = sc.nextInt();
        }
                
        for(int i = 0; i < sizeTAB; i++)
        {
            if(intTab[i] < 0)
                sumNeg += intTab[i];
            else 
                sumPos += intTab[i];
        }
        
        System.out.println("Sum of all positive number: " + sumPos);
        System.out.println("Sum of all positive number: " + sumNeg);
    }
}
