// Accept N numbers from user and return difference between summation of even elements and summation of odd elements.

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
    public int Difference(int Arr[], int iLength)               // Function defination
    {
        int iCnt = 0;                                           // Local Variables
        int iEvenSum = 0, iOddSum = 0;

        for(iCnt = 0; iCnt < iLength; iCnt++)                   // Business Logic
        {
            if(Arr[iCnt] % 2 == 0)
            {
                iEvenSum += Arr[iCnt];
            }
            else
            {
                iOddSum += Arr[iCnt];
            }
        }

        return (iEvenSum - iOddSum);
    }
}

// Main Class
class Program25_1
{
    public static void main(String A[])                         // Main Method
    {
        int iSize = 0;                                          // Local Variables
        int iCnt = 0;
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

        Arrayx aobj = new Arrayx();                             // Logic class object Instantiation

        iRet = aobj.Difference(Arr, iSize);                     // Function call

        System.out.println("Difference is "+iRet);              // Display Output

        aobj = null;                                            // Set objects to null after use
        Arr = null;
        sobj = null;

        System.gc();                                            // call to Garbage collector
    }
}