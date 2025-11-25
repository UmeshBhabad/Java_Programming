// Accept N numbers from user and check whether it contains number 11 in it or not.

///////////////////////////////////////////////////////////////////////////////////
//
// Java Standard Library
//
///////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////////////////
//
// Function Name    :   Check
// Description      :   used to check whether array contains number 11 in it or not
// Input            :   Integer
// Output           :   Integer
// Author           :   Umesh Shivaji Bhabad
// Date             :   24/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////

// Logic class
class Arrayx
{
    private int Arr[];                                                              // Instance Variables
    private int iSize;

    public Arrayx(int iNo)                                                          // Parameterized Constructor
    {
        this.iSize = iNo;
        Arr = new int[iSize];
    }

    public void Accept()                                                            // Function to Accept Elements
    {
        Scanner sobj = new Scanner(System.in);                                      // Scanner Object Instantiation

        int iCnt = 0;                                                               // Local Variable

        System.out.println("Enter the Elements : ");                                // Accept elements
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }        
    }

    public void Display()                                                           // Function to display array elements
    {
        int iCnt = 0;                                                               // loop counter
        
        System.out.println("Given Array : ");                                       // Display elements
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            System.out.print(Arr[iCnt]+ "\t");
        }
        System.out.println();
    }

    public boolean Check()                                                          // Logic Function
    {
        int iCnt = 0;                                                               // Local Variables
        boolean bFlag = false;

        Accept();                                                                   // Function call
        Display();                                                                  // Function call

        for(iCnt = 0; iCnt < iSize; iCnt++)                                         // Business Logic
        {
            if(Arr[iCnt] == 11)
            {
                bFlag = true;
                break;
            }
        }

        return bFlag;
    }
}

// Main Class
class Program22_3
{
    public static void main(String A[])                                             // Main method
    {
        Scanner sobj = new Scanner(System.in);                                      // Scanner Object Instantiation

        int iLength = 0;                                                            // Local Variables
        boolean bRet =false;

        System.out.println("Enter the Length of an array : ");                      // Accept array length
        iLength = sobj.nextInt();

        Arrayx aobj = new Arrayx(iLength);                                          // Logic class Object Instantiation

        // aobj.Accept();   ?
        bRet = aobj.Check();                                                        // Function call

        if(bRet)                                                                    // Display Output
        {
            System.out.println("Contains 11");
        }
        else
        {
            System.out.println("Not Contain 11");
        }
    }
}