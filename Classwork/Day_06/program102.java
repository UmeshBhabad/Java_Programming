// Accept N elements from the User and print its Summation.

import java.util.*;

// Logic Class

class Arrayx
{
    public void Display(int Brr[])                                              // Function Defination
    {
        int iCnt = 0;                                                           // Local Variable

        System.out.println("Elements of an array are : ");                      // Business Logic
        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            System.out.println(Brr[iCnt]);
        }
    }

    public int Summation(int Brr[])                                             // Function Defination
    {
        int iCnt = 0, iSum = 0;                                                 // Local Variable

        for(iCnt = 0; iCnt < Brr.length; iCnt++)                                // Business Logic
        {
            iSum += Brr[iCnt];
        }

        return iSum;
    }
}

class program102
{
    public static void main(String args[])                                      // Main method
    {
        Scanner sobj = new Scanner(System.in);                                  // Scanner Object

        int iSize = 0, iCnt = 0, iRet = 0;                                      // Local Variable
    
        System.out.println("Enter the size of an array : ");                    // Accepting input array size
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];                                             // Array Declaration, Memory Allocation

        System.out.println("Enter the Elements");                               // Accepting Array elements

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
        
        Arrayx aobj = new Arrayx();                                             // Logic Class Object

        aobj.Display(Arr);                                                      // Function call

        iRet = aobj.Summation(Arr);                                             // Function call

        System.out.println("Summation of elements of an array is : "+iRet);     // Display Object

        // Important

        aobj = null;
        Arr = null;
        sobj = null;

        System.gc();                                                            // Garbage Collector
    }
}