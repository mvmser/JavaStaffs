package dicematchproj;

public class DiceMatch
{
    public static void main(String[] args)
    {
        int diceOne, diceTwo, nbThrows = 0;
        
        do
        {
            nbThrows++;

            diceOne = (int)(Math.random() * 6 + 1);
            diceTwo = (int)(Math.random() * 6 + 1);
            
            System.out.println("Dice 1:" + diceOne);
            System.out.println("Dice 2:" + diceTwo);
            System.out.println(" ");
        }while(diceOne != diceTwo);
        
        System.out.println("Tthrows before the dice matched: " + nbThrows);
    }
    
}
