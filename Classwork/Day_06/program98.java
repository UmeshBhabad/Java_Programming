// Accept size and array elements from user and display them.

import java.util.*;

// Logic class

class Arrayx
{
    void Display(int Brr[])                                     // Function Defination
    {
        int iCnt = 0;                                           // Loop counter

        for(iCnt = 0; iCnt < Brr.length; iCnt++)                // Business Logic 
        {
            System.out.println(Brr[iCnt]);
        }
    }
}

// Main class

class program98
{
    public static void main(String args[])                      // Main Method
    {
        Scanner sobj = new Scanner(System.in);                  // Scanner object creation

        int iSize = 0;                                          // Local Variable
    
        System.out.println("Enter the size of an array : ");    // Accepting Input array size 
        iSize = sobj.nextInt();     // 5

        int Arr[] = new int[iSize];                             // Array Declaration, Memory Allocation

        System.out.println("Enter the Elements");               // Accepting Input from User and storing them in array
        Arr[0] = sobj.nextInt();
        Arr[1] = sobj.nextInt();
        Arr[2] = sobj.nextInt();
        Arr[3] = sobj.nextInt();
        Arr[4] = sobj.nextInt();

        Arrayx aobj = new Arrayx();                             // Creating Logic class Object

        aobj.Display(Arr);                                      // Calling Logic Function
    }
}