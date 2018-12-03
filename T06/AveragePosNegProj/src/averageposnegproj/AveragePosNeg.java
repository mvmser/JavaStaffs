package averageposnegproj;

public class AveragePosNeg 
{
    public static void main(String[] args) 
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        final int sizeTAB = 10;
        int intTab[] = new int[sizeTAB];
        int sumNeg = 0, sumPos = 0, nbNeg = 0, nbPos = 0;
        
        System.out.println("Only positive or negative integer !");
        
        for(int i = 0; i < sizeTAB; i++)
        {
            System.out.print("Please enter number " + (i+1) + ": ");
            intTab[i] = sc.nextInt();
        }
                
        for(int i = 0; i < sizeTAB; i++)
        {
            if(intTab[i] < 0)
            {
                sumNeg += intTab[i];
                nbNeg++;
            }
            else 
            {
                sumPos += intTab[i];
                nbPos++;
            }
        }
        double avNeg = sumNeg/(double)nbNeg;
        double avPos = sumPos/(double)nbPos;

        System.out.println("Average of all positive number: " + avPos);
        System.out.println("Average of all positive number: " + avNeg);
    }
}
