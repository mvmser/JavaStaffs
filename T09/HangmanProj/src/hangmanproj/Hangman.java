package hangmanproj;

public class Hangman
{
    public static void main(String[] args)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Word to be guessed : ");
        String word = sc.nextLine();
        
        String display = "";
        char letter;
        int time = 0;
        
        for(int i = 0; i < word.length(); i++)
            display = display + "-";
        System.out.print("Display :      \t " + display + "\n");
        
        while(!display.equals(word))
        {
            System.out.print("Letter to be guesed : ");
            letter = sc.nextLine().charAt(0);
            time++;

            for(int i = 0; i < word.length(); i++)
            {
                if(letter == word.charAt(i))
                    display = replaceChar(display, i, letter);
            }        
            System.out.println("Display :      \t " + display);
        }
        System.out.println("Successful in " + time + " guesses !");        
    }
    
    public static String replaceChar(String display, int i, char letter) 
    {
        char tab[] = display.toCharArray();
        tab[i] = letter;
        return String.valueOf(tab);
    }
    
}
