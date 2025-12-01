// Accept string from user and convert the characters to toggle the case.

import java.util.*;

// Logic class
class StringX
{
    public String strToggleX(String str)                                 // Function defination
    {
        char Arr[] = str.toCharArray();                                 // String to character array

        int iCnt = 0;                                                   // Local Variable 

        for(iCnt = 0; iCnt < Arr.length; iCnt++)                        // Business Logic
        {
            if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                Arr[iCnt] = (char)(Arr[iCnt] + (32));
            }
            else if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {
                Arr[iCnt] = (char)(Arr[iCnt] - (32));
            }
        }

        return new String(Arr);
    }
}

// Main class
class program256
{
    public static void main(String args[])                              // Main Method
    {
        String sRet = null;                                             // Local Variable
        
        Scanner scanobj = new Scanner(System.in);                       // Scanner Object Instantiation

        System.out.println("Enter String : ");                          // Accept String
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();                                 // Logic class Object Instantiation

        sRet = strobj.strToggleX(sobj);                                 // Function call

        System.out.println("Updated String : " + sRet);                 // Display Output
    }
}