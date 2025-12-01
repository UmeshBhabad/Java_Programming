import java.util.*;

class program247
{
    public static void main(String args[])                      // Main method
    {
        Scanner scanobj = new Scanner(System.in);               // Scanner Object Instantiation

        System.out.println("Enter String : ");                  // Accept String
        String sobj = scanobj.nextLine();

        char Arr[] = sobj.toCharArray();                        // String to Character array

        int iCnt = 0;
        
        for(iCnt = 0; iCnt < Arr.length; iCnt++)                // Display Characters in the string
        {
            System.out.println(Arr[iCnt]);
        }
    }
}