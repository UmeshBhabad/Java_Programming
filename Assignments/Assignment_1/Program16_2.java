// Write a program to check whether given number is even or odd.

///////////////////////////////////////////////////////////////////////////////////
//
// Function Name: CheckEvenOdd
// Description:   Used check whether given number is even or odd.
// Input:         Integer
// Output:        String
// Author:        Umesh Shivaji Bhabad
// Date:          04/11/2025
//
///////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void CheckEvenOdd(int iNo)
    {
        if(iNo % 2 == 0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }

    }
}

class Program16_2
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.CheckEvenOdd(7);
    }
}