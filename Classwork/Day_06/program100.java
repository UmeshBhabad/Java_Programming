// Dynamic Array declaration, Initialization and Displaying its elements.

import java.util.*;

// Logic class

class Arrayx
{
    void Display(int Brr[])                                     // Function Defination
    {
        int iCnt = 0;                                           // Loop Counter

        for(iCnt = 0; iCnt < Brr.length; iCnt++)                // Business Logic
        {
            System.out.println(Brr[iCnt]);
        }
    }
}

class program100
{
    public static void main(String args[])                      // main method
    {
        Scanner sobj = new Scanner(System.in);                  // Scanner Object

        int iSize = 0;                                          // Local Variables
        int iCnt = 0;
    
        System.out.println("Enter the size of an array : ");    // Accepting array size
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];                             // Array declaration, Memory Allocation

        System.out.println("Enter the Elements");               // Accepting array elements

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
        

        Arrayx aobj = new Arrayx();                             // Logic class object

        aobj.Display(Arr);                                      // Logic-Function call

        // Important

        aobj = null;
        Arr = null;
        sobj = null;

        System.gc();                                            // Garbage Collector call
    }
}