package postproj;

import java.util.Scanner;

public class Post
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        
        if(word.equalsIgnoreCase("bill"))
            System.out.println("bills must be paid");
        else if(word.equalsIgnoreCase("circular"))
            System.out.println("circulars are thrown away");
        else if(word.equalsIgnoreCase("postcard"))
            System.out.println("postcards are put on the wall");
        else if(word.equalsIgnoreCase("letter"))
            System.out.println("personal letters are read and have replies written for them");
        else
            System.out.println("Error");
    }   
}
