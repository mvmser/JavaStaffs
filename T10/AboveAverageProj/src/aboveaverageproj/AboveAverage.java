package aboveaverageproj;
import java.util.Scanner;

public class AboveAverage 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int nbStudents;
        do
        {
            System.out.println("How many students ? ");
            nbStudents = sc.nextInt();
        }while(nbStudents <= 0);
        
        
        String[] stringArray = new String[nbStudents];
        int[] intArray = new int[nbStudents];
        
        initArrays(stringArray, intArray);
        System.out.println("Marks average: " + averageMark(intArray));
        System.out.println("Students above the average: ");
        aboveAverage(stringArray, intArray, averageMark(intArray));
    }
    public static void initArrays(String[] stringArray, int[] intArray)
    {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < stringArray.length ; i++)
        {
            System.out.printf("Name of student %d: ", i+1);
            stringArray[i] = sc.nextLine();
                        
            System.out.printf("Mark of student %d: ", i+1);
            intArray[i] = sc.nextInt();
            sc.nextLine();
            
            System.out.println("");
        }
        System.out.println("");
    }
    public static double averageMark(int[] intArray)
    {
        int sum = 0;
        for(int i = 0; i < intArray.length; i++)
            sum += intArray[i];                
        return sum / (intArray.length );
    }
    public static void aboveAverage(String[] stringArray, int[] intArray, double average)
    {
        for(int i = 0; i < stringArray.length; i++)
        {
            if(intArray[i] < average)
                System.out.println(stringArray[i]);
        }
    }

}
