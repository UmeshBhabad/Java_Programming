// OOP Design: Accept N numbers from user and find the average of them.

import java.util.*;

// Logic Class

class Arrayx
{
    // Instance Variables
    private int Arr[];                                              // Array Declaration
    private int iSize;                                              // Array size

    public Arrayx(int iNo)                                          // Parameterized Constructor
    {
        System.out.println("Inside Constructor");
        
        iSize = iNo;                                                // Assignment
        Arr = new int[iSize];                                       // Array Instantation, Memory allocation
    }

    public void Accept()                                            // Function to accept array elements
    {
        Scanner sobj = new Scanner(System.in);                      // Scanner object

        int iCnt = 0;

        System.out.println("Enter the Elements of an array :");     // Accepting input from user

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    public void Display()                                           // Function to display Array Elements
    {
        int iCnt = 0;

        System.out.println("Elements of the array are : ");

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }

    // Business Logic
    public float Average()                                          // Function to find average of array elements  
    {
        int iCnt = 0, iSum = 0;                                     // Local Variables
        
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            iSum += Arr[iCnt];                                      // Logic
        }

        return iSum / iSize;
    }
}

// Main Class

class program108
{
    public static void main(String[] args)                          // Main Method
    {
        float fRet = 0.0f;                                          // Local Variable
        
        Arrayx aobj1 = new Arrayx(5);                               // Array Object Instantiation

        // Function call
        aobj1.Accept();
        aobj1.Display();
        fRet = aobj1.Average();

        Arrayx aobj2 = new Arrayx(7);                               // Object Instantiation               

        System.out.println("The average of the elements is "+fRet); // Display Output

    }
}