// Accept N numbers from user and accept one another number as No, return the index of last occurrence of that No.

///////////////////////////////////////////////////////////////////////////////////
//
// Java Standard Library
//
///////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

///////////////////////////////////////////////////////////////////////////////////
//
// Function Name    :   
// Description      :   
// Input            :   Integer, Integer
// Output           :   Integer
// Author           :   Umesh Shivaji Bhabad
// Date             :   24/11/2025
//
///////////////////////////////////////////////////////////////////////////////////

// Logic class
class Arrayx
{
    public int LastOcc(int Arr[], int iLength, int iNo)        // Function defination
    {
        int iCnt = 0;                                           // Local Variables
        int iIndex = 0;

        for(iCnt = 0; iCnt < iLength; iCnt++)                   // Business Logic
        {
            if(Arr[iCnt] == iNo)
            {
                iIndex = iCnt;
            }
        }
        return iIndex;
    }
}

// Main Class
class Program23_3
{
    public static void main(String A[])                         // Main Method
    {
        int iSize = 0;                                          // Local Variables
        int iCnt = 0;
        int iValue = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);                  // Scanner Object Instantiation

        System.out.println("Enter the size of an array : ");    // Accept array Length
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];                             // Creating array, Memory allocation

        System.out.println("Enter the elements : ");            // Accept array elements
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Enter the number to find : ");      // Accept number to find
        iValue = sobj.nextInt();

        Arrayx aobj = new Arrayx();                             // Logic class object Instantiation

        iRet = aobj.LastOcc(Arr, iSize, iValue);                // Function call

        System.out.println("Index of first occerence : "+iRet); // Display Output
        
        aobj = null;                                            // Set objects to null after use
        Arr = null;
        sobj = null;

        System.gc();                                            // call to Garbage collector
    }
}