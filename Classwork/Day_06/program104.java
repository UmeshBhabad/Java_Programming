// OOP Design: Applying object-oriented practices by keeping the main class, logic class, and business logic separate for better maintainability.

import java.util.*;

// Logic class

class Arrayx
{
    public int Arr[];                                               // Instance Variables 
    public int iSize;

    public Arrayx(int iNo)                                          // Parameterized Constructor
    {
        System.out.println("Inside Constructor");
        
        iSize = iNo;                                                // Assignment
        Arr = new int[iSize];                                       // Array Instantiation, Memory Allocation
    }

    public void Accept()                                            // Function to Accept Array Elements
    {
        Scanner sobj = new Scanner(System.in);                      // Scanner Object

        int iCnt = 0;                                               // Local Variable

        System.out.println("Enter the Elements of an array :");     // Accept Input array elements from user

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    public void Display()                                           // Function to Display array Elements
    {
        int iCnt = 0;                                               // local Variable

        for(iCnt = 0; iCnt < Arr.length; iCnt++)                    // Display output
        {
            System.out.println(Arr[iCnt]);
        }
    }
}

// Main Class

class program104
{
    public static void main(String[] args)                          // Main method
    {
        Arrayx aobj1 = new Arrayx(5);                               // Logic class Object Instantiation, Constructor Call

        Arrayx aobj2 = new Arrayx(7);                               // Logic class Object Instantiation, Constructor Call
    }
}


// Output : Inside Constructor
//          Inside Constructor