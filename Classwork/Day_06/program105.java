// OOP Design

import java.util.*;

// Logic Class

class Arrayx
{
    public int Arr[];                                               // Instance Variables
    public int iSize;

    public Arrayx(int iNo)                                          // Parameterized Constructor
    {
        System.out.println("Inside Constructor");   
        
        iSize = iNo;                                                // Asssignment
        Arr = new int[iSize];                                       // Array Instantiation, Memory allocation
    }

    public void Accept()                                            // Function to accept array Element
    {
        Scanner sobj = new Scanner(System.in);                      // Scanner Object

        int iCnt = 0;                                               // Local variable

        System.out.println("Enter the Elements of an array :");     // Accepting Input from user

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    public void Display()                                           // Displaying Values
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)                    // Business Logic
        {
            System.out.println(Arr[iCnt]);
        }
    }
}

// Main Method

class program105
{
    public static void main(String[] args)                          // Main Method
    {
        Arrayx aobj1 = new Arrayx(5);                               // Logic Class Object Instantiation
        System.out.println(aobj1.iSize);

        // Bad Code
        aobj1.iSize = 11;                                           // Need of access specifier
        aobj1.Arr = null;

        System.out.println(aobj1.iSize);

        Arrayx aobj2 = new Arrayx(7);                               // Logic Class Object Instantiation
        System.out.println(aobj2.iSize);

    }
}