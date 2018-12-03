package bmiproj;

public class BMI 
{
    public static void main(String[] args) 
    {
        outputBMI(heightInInches(), weightInPounds());      
    }
    static int heightInInches()
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int feet = -1, inches = -1;
        
        do
        {           
            if(feet < 2 || feet > 7)
            {
                System.out.print("Please enter feet in the range 2 - 7: ");
                feet = sc.nextInt(); 
            }  
            if (inches < 0 || inches > 11)
            {
                System.out.print("Please enter inches in the range 0 - 11: ");
                inches = sc.nextInt();
            }
        }while(feet < 2 || feet > 7 || inches < 0 || inches > 11);
        
        return inches + feet  * 12;        
    }
    static int weightInPounds()
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int stone = -1, pounds = -1;
        
        do
        {           
            if(stone < 3 || stone > 30)
            {
                System.out.print("Please enter stone in the range 3 - 30: ");
                stone = sc.nextInt(); 
            }  
            else if (pounds < 0 || pounds > 13)
            {
                System.out.print("Please enter pounds in the range 0 - 13: ");
                pounds = sc.nextInt();
            }
        }while(stone < 3 || stone > 30 || pounds < 0 || pounds > 13);
        
        return pounds + stone * 14;  
    }
    static void outputBMI(int heightInInches, int weightInPounds)
    {
        System.out.printf("BMI: %.1f\n", (weightInPounds * 703 / (double)(heightInInches * heightInInches)));      
    }
}