package allevenproj;
import java.util.Scanner;
/**
 *
 * @author Mohamed SERHIR
 */
public class AllEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter the size of an array: ");
        int size = sc.nextInt();
        
        int[] array = new int[size];
        read(array);
        print(getEven(array));
    }
    public static void read(int[] array){
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++){
            System.out.printf("Please enter the number %d: ", i+1);
            array[i] = sc.nextInt();
        }
    }
    public static int[] getEven(int[] array){
        int size = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i]%2 == 0)
                size++;
        }
        
        int[] evenArray = new int[size];
        int j = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i]%2 == 0){
                evenArray[j] = array[i];
                j++;
            }
        }
        return evenArray;
    }
    public static void print(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.printf("%d ", array[i]);
        }
    }
}
