// Write a program to find the minimum of three numbers.

///////////////////////////////////////////////////////////////////////////////////
//
// Function Name: findMin
// Description:   Used to find the minimum of three numbers.
// Input:         Integer
// Output:        Integer
// Author:        Umesh Shivaji Bhabad
// Date:          04/11/2025
//
///////////////////////////////////////////////////////////////////////////////////


class Logic
{
    void findMin(int iNo1, int iNo2, int iNo3)
    {
        if( iNo1 < iNo2 && iNo1 < iNo3)
        {
            System.out.println(iNo1);
        }
        else if(iNo2 < iNo1 && iNo2 < iNo3)
        {
            System.out.println(iNo2);
        }
        else
        {
            System.out.println(iNo3);
        }

    }
}

class Program17_4
{
    public static void main(String args[])
    {
        Logic obj =new Logic();
        obj.findMin(3, 7, 2);
    }
}