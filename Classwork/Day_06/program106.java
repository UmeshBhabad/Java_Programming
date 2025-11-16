// OOP Design

import java.util.*;

// Logic class

class Arrayx
{
    private int Arr[];                                                  // Setting Instance Variables to private
    private int iSize;

    public Arrayx(int iNo)                                              // Parameterized construcor
    {
        System.out.println("Inside Constructor");
        
        iSize = iNo;                                                    // Assignment                     
        Arr = new int[iSize];                                           // Array Declaration, memory allocation
    }

    public void Accept()                                                // Fucntion to accept array Elements
    {
        Scanner sobj = new Scanner(System.in);                          // Scanner Object

        int iCnt = 0;

        System.out.println("Enter the Elements of an array :");         // Accepting Input from user

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    // Business Logic
    public void Display()                                               // Function to display Array elements
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
}

// Main Class

class program106
{
    public static void main(String[] args)                              // Main Method
    {
        Arrayx aobj1 = new Arrayx(5);                                   // Object Instantiation
        System.out.println(aobj1.iSize); // Error

        // Bad Code
        aobj1.iSize = 11; // Error    
        aobj1.Arr = null; // Error

        Arrayx aobj2 = new Arrayx(7);                                   // Object Instantiation
        System.out.println(aobj2.iSize); // Error

    }
}