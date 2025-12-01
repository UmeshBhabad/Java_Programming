import java.util.*;

class program246
{
    public static void main(String args[])                      // Main method
    {
        Scanner scanobj = new Scanner(System.in);               // Scanner Object Instantiation

        System.out.println("Enter String : ");                  // Accept String
        String sobj = scanobj.nextLine();

        char Arr[] = sobj.toCharArray();                        // String to Character array 

        System.out.println(Arr[0]);
        System.out.println(Arr[1]);
        System.out.println(Arr[2]);
        System.out.println(Arr[3]);
        System.out.println(Arr[4]);
    }
}