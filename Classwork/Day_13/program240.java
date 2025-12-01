import java.util.*;

// Main class
class program240
{
    public static void main(String args[])              // main method
    {
        Scanner sobj = new Scanner(System.in);          // Scanner Object Instantiation

        System.out.println("Enter your Name : \n");     // Accept String
        String str = sobj.nextLine();

        System.out.println("Hello : "+str);             // Display String
    }
}