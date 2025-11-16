// Accept N elements from the User and print the count of the even Numbers.

import java.util.*;

// Logic class

class Arrayx
{
    public void Display(int Brr[])                                  // Function defination
    {
        int iCnt = 0;                                               // Local Variable

        System.out.println("Elements of an array are : ");          // business logic
        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            System.out.println(Brr[iCnt]);
        }
    }

    public int CountEven(int Brr[])                                 // Function defination
    {
        int iCnt = 0, iCount = 0;                                   // Local Variable

        for(iCnt = 0; iCnt < Brr.length; iCnt++)                    // Business Logic
        {
            if(Brr[iCnt] % 2 == 0)
            {
                iCount++;
            }
        }

        return iCount;
    }
}

// Main Method

class program101
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);                      // Scanner object

        int iSize = 0, iCnt = 0, iRet = 0;                          // Local Variable
    
        System.out.println("Enter the size of an array : ");        // accepting input array size
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];                                 // Array Declaration, Memory Allocation

        System.out.println("Enter the Elements");                   // Accepting array elements

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
        
        Arrayx aobj = new Arrayx();                                 // Creating array object

        aobj.Display(Arr);                                          // Logic Function call

        iRet = aobj.CountEven(Arr);                                 // Logic Function call

        System.out.println("Even Numbers are : "+iRet);             // Display output

        // Important

        aobj = null;
        Arr = null;
        sobj = null;

        System.gc();                                                // Garbage Collector
    }
}