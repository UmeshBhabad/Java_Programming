// Write a program to print numbers from N down to 1 in reverse order.

///////////////////////////////////////////////////////////////////////////////////
//
// Function Name: printReverse
// Description:   used to print numbers from N down to 1 in reverse order.
// Input:         Integer
// Output:        Integer
// Author:        Umesh Shivaji Bhabad
// Date:          04/11/2025
//
///////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void printReverse(int iNo)
    {
        int iCnt = 0;

        for(iCnt = iNo; iCnt >= 1; iCnt--)
        {
            System.out.println(iCnt);
        }

    }
}

class Program20_2
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.printReverse(10);    
    }
}