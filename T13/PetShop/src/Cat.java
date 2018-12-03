/**
 *
 * @author Mohamed SERHIR
 */
public class Cat {
    private int numberOfTeeth;
    private int lengthOfTail;
    
    public Cat(String name, String ownerName, int numberOfTeeth, int lengthOfTail){
        this.numberOfTeeth = numberOfTeeth;
        this.lengthOfTail = lengthOfTail;
    }
    public int getNumberOfTeeth(){
        return numberOfTeeth;
    }
    public int getLenthOfTail(){
        return lengthOfTail;
    }
}
