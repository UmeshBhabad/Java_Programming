// Accept N numbers from user and return frequency of even numbers.

///////////////////////////////////////////////////////////////////////////////////
//
// Java Standard Library
//
///////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

///////////////////////////////////////////////////////////////////////////////////
//
// Function Name    :   CountEven
// Description      :   used to count frequency of even elements
// Input            :   Integer
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

    public Arrayx(int iNo)                                                 // Parameterized Constructor
    {
        this.iSize = iNo;
        Arr = new int[iSize];
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

    public int CountEven()                                                 // Logic Function
    {
        int iCnt = 0;                                                      // Local Variables
        int iFreq = 0;

        Accept();                                                          // Function call
        Display();                                                         // Function call

        for(iCnt = 0; iCnt < iSize; iCnt++)                                // Business Logic
        {
            if(Arr[iCnt] % 2 == 0)
            {
                iFreq++;
            }
        }

        return iFreq;
    }
}

// Main Class
class Program22_1
{
    public static void main(String A[])                                    // Main method
    {
        Scanner sobj = new Scanner(System.in);                             // Scanner Object Instantiation

        int iLength = 0;                                                   // Local Variables
        int iRet = 0;

        System.out.println("Enter the Length of an array : ");             // Accept array length
        iLength = sobj.nextInt();

        Arrayx aobj = new Arrayx(iLength);                                 // Logic class Object Instantiation

        // aobj.Accept();   ?
        iRet = aobj.CountEven();                                           // Function call

        System.out.printf("Frequency of even elements is %d.\n", iRet);    // Display Output
    }
}