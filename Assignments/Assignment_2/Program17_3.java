// Write a program to find the maximum of two numbers.

///////////////////////////////////////////////////////////////////////////////////
//
// Function Name: findMax
// Description:   Used to find the maximum of two numbers.
// Input:         Integer
// Output:        Integer
// Author:        Umesh Shivaji Bhabad
// Date:          04/11/2025
//
///////////////////////////////////////////////////////////////////////////////////


class Logic
{
    void findMax(int iNo1, int iNo2)
    {
        if( iNo1 > iNo2)
        {
            System.out.println(iNo1);
        }
        else
        {
            System.out.println(iNo2);
        }

    }
}

class Program17_3
{
    public static void main(String args[])
    {
        Logic obj =new Logic();
        obj.findMax(20, 15);
    }
}