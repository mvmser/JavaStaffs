package battleshipsproj;
import java.lang.Math; 
/**
 *
 * @author Mohamed SERHIR
 */
public class BattleShips {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[][] arrayShips = new int[12][12];
        char[][] arrayPlayer = new char[12][12];
        String another;
        
        initArrayShip(arrayShips);
        initArrayPlayer(arrayPlayer);
        
        do{
            userShots(arrayShips, arrayPlayer);
            printArray(arrayPlayer);
            do{
                System.out.print("Do you want another shot ? (y/n):");
                another = sc.nextLine();
            }while (!"y".equals(another) && !"n".equals(another));
            
        }while ("y".equals(another));       
    }
    public static void initArrayShip(int[][] array)
    {
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = (int) Math.round(Math.random());
            }
        }
    }
    public static void initArrayPlayer(char[][] array)
    {
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = ' ';
            }
        }
    }
    public static void printArray(int[][] array)
    {
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println();
    }
    public static void printArray(char[][] array)
    {
        for (int i = 0; i < array.length; i++){
            System.out.printf("%2d", i+1);
            for (int j = 0; j < array.length; j++){
                System.out.printf(" | %1s", array[i][j]);
            }
            System.out.printf(" |");
            System.out.println("");
        }
        System.out.printf("   ");
        for (int i = 0; i < array.length; i++){
            System.out.printf(" %2d ", i+1);
        }
        System.out.println();
    }
    public static void userShots(int[][] arrayShips, char[][] arrayPlayer){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int x, y;
        boolean used;
        
        do{
            do{
                System.out.print("Enter the x coordinate of your shot (1-12): ");
                x = sc.nextInt();
            }while (x < 1 || x > 12);
            do{
                System.out.print("Enter the y coordinate of your shot (1-12): ");
                y = sc.nextInt();
            }while (y < 1 || y > 12);

            if(arrayPlayer[x - 1][y - 1] == 'H' || arrayPlayer[x - 1][y - 1] == 'X'){
                System.out.println("You already use this coordinates.");
                used = true;
            }
            else{
                used = false;
            }
        }while(used == true);

        if(arrayShips[x - 1][y - 1] == 1)
            arrayPlayer[x - 1][y - 1] = 'H';
        else
            arrayPlayer[x - 1][y - 1] = 'X';
    }
}
