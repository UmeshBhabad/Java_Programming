// Accept string from user and convert the characters to lower case.

import java.util.*;

// Logic class
class StringX
{
    public String toLowerCaseX(String str)                              // Function defination
    {
        char Arr[] = str.toCharArray();                                 // String to character array

        int iCnt = 0;                                                   // Local Variable

        for(iCnt = 0; iCnt < Arr.length; iCnt++)                        // Business Logic
        {
            if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                Arr[iCnt] = (char)(Arr[iCnt] + (32));   // type cast into char
            }
        }

        return new String(Arr);
    }
}

// Main class
class program255
{
    public static void main(String args[])                              // Main Method
    {
        String sRet = null;
        
        Scanner scanobj = new Scanner(System.in);                       // Scanner Object Instantiation

        System.out.println("Enter String : ");                          // Accept String
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();                                 // Logic class Object Instantiation

        sRet = strobj.toLowerCaseX(sobj);                               // Function call

        System.out.println("Updated String : " + sRet);                 // Display Output
    }
}