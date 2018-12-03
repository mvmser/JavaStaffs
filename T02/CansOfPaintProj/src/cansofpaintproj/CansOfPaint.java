package cansofpaintproj;

public class CansOfPaint 
{
    public static void main(String[] args) 
    {
        /*Output 1 */
        int floorLarge = 25;
        int floorWeidth = 30;
        double floorHeight = 3.6;
        int canOfPaintCovers = 28;
        
        double amountOfCans = (2 *(floorLarge * floorHeight) + 2 *(floorWeidth * floorHeight)) / canOfPaintCovers;
        int nbCans = (int) Math.ceil(amountOfCans);
        System.out.println("The Minimum number of cans that must be bought: " + nbCans);
        
        /*Output 2 */
        int boxLarge = 60;
        int boxWeidth = 30;
        int boxHeidth = 35;
        
        int caintoPaintDiameter = 15;
        int caintOfPaintHeight = 30;
        
        //Calculate nb of paint in a box
        int nbOfCainsInBox = (int)(boxLarge / caintoPaintDiameter) * (int)(boxWeidth / caintoPaintDiameter) * (int)(boxHeidth / caintOfPaintHeight);
        System.out.println("Number of cans in a box: " + nbOfCainsInBox);
        
        //Calculate nb full box        
        int nbFullBox = (int)(nbCans/nbOfCainsInBox);
        System.out.println("Number of full boxes given: " + nbFullBox);
        
        /*Output 3 */
        double nbNotPacked = nbCans - (nbOfCainsInBox * nbFullBox) ;
        System.out.println("number of cans not packed: " + nbNotPacked);
    }
}