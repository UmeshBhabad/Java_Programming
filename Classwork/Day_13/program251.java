// Accept string from user and count the capital characters.

import java.util.*;

// Logic class
class StringX
{
    public int CountCapital(String str)                                 // Function defination
    {
        int iCnt = 0;                                                   // Local Variable
        int iCount = 0;

        char Arr[] = str.toCharArray();                                 // String to character array

        for(iCnt = 0; iCnt < Arr.length; iCnt++)                        // Business Logic
        {
            if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                iCount++;
            }
        }

        return iCount;
    }
}

// Main class
class program251
{
    public static void main(String args[])                              // Main Method
    {
        Scanner scanobj = new Scanner(System.in);                       // Scanner Object Instantiation

        System.out.println("Enter String : ");                          // Accept String
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();                                 // Logic class Object Instantiation
        
        int iRet = 0;

        iRet = strobj.CountCapital(sobj);                               // Function call

        System.out.println("Count of Capital characters is " + iRet);   // Display Output
    }
}