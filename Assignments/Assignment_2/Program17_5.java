// Write a program to print the multiplication table of a number.

///////////////////////////////////////////////////////////////////////////////////
//
// Function Name: printTable
// Description:   Used to print the multiplication table of a number.
// Input:         Integer
// Output:        Integer
// Author:        Umesh Shivaji Bhabad
// Date:          04/11/2025
//
///////////////////////////////////////////////////////////////////////////////////


class Logic
{
    void printTable(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= 10; iCnt++)
        {
            System.out.println(iNo * iCnt);
        }
    }
}

class Program17_5
{
    public static void main(String args[])
    {
        Logic obj =new Logic();
        obj.printTable(5);
    }
}