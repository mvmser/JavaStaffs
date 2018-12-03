package savingsproj;

//calculate and output half of my savings
public class Savings
{
    //your share is 25% of my savings
    public static void main (String args[])
    {
        int mySavings = 3000;
        int yourPercentage = 25;
        int yourShare = (yourPercentage * mySavings) / 100;
        System.out.println("Your share: " + yourShare);
    }
}