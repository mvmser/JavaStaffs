package theaterticketproj;
public class TheaterTicket
{
    public static void main(String[] args)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        final double ADULT_TICKET = 10.50;
        final double CHILD_TICKET = 7.30;
        final double CONCESSIONS_TICKET = 8.40;
                
        System.out.println("Welcome to our theater ! ");
        System.out.println("Please to complete the following instruction: ");
        
        System.out.print("How many adults ? ");
        int nbAdult = sc.nextInt(); 
        System.out.print("How many children ? ");
        int nbChild = sc.nextInt();
        System.out.print("How many concessions ? ");
        int nbConcessions = sc.nextInt();

        int freeAdult = nbChild / 10;
        int discount = 0;
        double addCharge = 0.0;
       
        System.out.println("Collected in person ? (y/n) ");
        sc.nextLine(); // clear buffer
        String choice = sc.nextLine();
        if("n".equals(choice))
            addCharge = 2.34;
        
        double totalPrice = nbAdult * ADULT_TICKET + nbChild * CHILD_TICKET + nbConcessions * CONCESSIONS_TICKET - freeAdult * ADULT_TICKET + addCharge;
 
        if(totalPrice > 100) // > 100£ : 10% discount
        {
            discount = 10;
            totalPrice = totalPrice - (totalPrice * discount/100.0);
        }
        
        System.out.println("\n\n------ Receipt ------");
        System.out.println("Tickets \t|Nb    Price|   \t |Total");
        System.out.printf("Adults: \t|%3d * %5.2f|  =\t |%6.2f£\n", nbAdult,  ADULT_TICKET, nbAdult * ADULT_TICKET );
        System.out.printf("Children: \t|%3d * %5.2f|  =\t |%6.2f£\n", nbChild,  CHILD_TICKET, nbChild * CHILD_TICKET );
        System.out.printf("Concessions: \t|%3d * %5.2f|  =\t |%6.2f£\n", nbConcessions,  CONCESSIONS_TICKET, nbConcessions * CONCESSIONS_TICKET );
        System.out.printf("Free Adults: \t|%3d * %5.2f|  =\t |-%5.2f£\n", freeAdult,  ADULT_TICKET, freeAdult * ADULT_TICKET );
        
        System.out.println("\nAdditionnal charge: " + addCharge +"£");
        if(discount > 0)
            System.out.println("Discount: " + discount +"%");        
       
        System.out.printf("\n\t\t\t\t  [TOTAL: %.2f£]\n", totalPrice);
   
    }
    
}
