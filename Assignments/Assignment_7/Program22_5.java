// Accept N numbers from user and accept one another number as ivalue, return frequency of iValue from it.

///////////////////////////////////////////////////////////////////////////////////
//
// Java Standard Library
//
///////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

///////////////////////////////////////////////////////////////////////////////////
//
// Function Name    :   Frequency
// Description      :   used to count frequency of iValue from array
// Input            :   Integer, Integer
// Output           :   Integer
// Author           :   Umesh Shivaji Bhabad
// Date             :   24/11/2025
//
///////////////////////////////////////////////////////////////////////////////////

// Logic class
class Arrayx
{
    private int Arr[];                                                     // Instance Variables
    private int iSize;
    private int iNum;

    public Arrayx(int iNo1, int iNo2)                                      // Parameterized Constructor
    {
        this.iSize = iNo1;
        Arr = new int[iSize];
        this.iNum = iNo2;
    }

    public void Accept()                                                   // Function to Accept Elements
    {
        Scanner sobj = new Scanner(System.in);                             // Scanner Object Instantiation

        int iCnt = 0;                                                      // Local Variable

        System.out.println("Enter the Elements : ");                       // Accept elements
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }        
    }

    public void Display()                                                  // Function to display array elements
    {
        int iCnt = 0;                                                      // loop counter
        
        System.out.println("Given Array : ");                              // Display elements
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            System.out.print(Arr[iCnt]+ "\t");
        }
        System.out.println();
    }

    public int Frequency()                                                 // Logic Function
    {
        int iCnt = 0;                                                      // Local Variables
        int iFreq = 0;

        Accept();                                                          // Function call
        Display();                                                         // Function call

        for(iCnt = 0; iCnt < iSize; iCnt++)                                // Business Logic
        {
            if(Arr[iCnt] == iNum)
            {
                iFreq++;
            }
        }

        return iFreq;
    }
}

// Main Class
class Program22_5
{
    public static void main(String A[])                                    // Main method
    {
        Scanner sobj = new Scanner(System.in);                             // Scanner Object Instantiation

        int iLength = 0;                                                   // Local Variables
        int iRet = 0;
        int iValue = 0;

        System.out.println("Enter the Length of an array : ");             // Accept array length
        iLength = sobj.nextInt();

        System.out.println("Enter the Number to find : ");                 // Accept array length
        iValue = sobj.nextInt();

        Arrayx aobj = new Arrayx(iLength, iValue);                         // Logic class Object Instantiation

        // aobj.Accept();   ?
        iRet = aobj.Frequency();                                           // Function call

        System.out.printf("Frequency of %d is %d.\n", iValue, iRet);       // Display Output
    }
}