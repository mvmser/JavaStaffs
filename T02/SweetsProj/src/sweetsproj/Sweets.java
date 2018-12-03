package sweetsproj;

public class Sweets 
{
    public static void main(String[] args) 
    {
        int totalSweets = 25;
        int nbStudents = 7;
        int studentSweets = totalSweets/nbStudents;
        int teacherSweets = totalSweets%nbStudents;     
        
        System.out.println("Student sweets: " + studentSweets);
        System.out.println("Teacher sweets: " + teacherSweets);
    }
}
