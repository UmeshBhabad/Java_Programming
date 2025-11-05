// Write a program to count how many even and odd numbers are present between 1 and N.

///////////////////////////////////////////////////////////////////////////////////
//
// Function Name: countEvenOddRange
// Description:   used to count how many even and odd numbers are present between 1 and N.
// Input:         Integer
// Output:        Integer
// Author:        Umesh Shivaji Bhabad
// Date:          04/11/2025
//
///////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void countEvenOddRange(int iNo)
    {
        int iCnt = 0;
        int iCountEven = 0, iCountOdd = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iCountEven++;
            }
            else
            {
                iCountOdd++;
            }
        }

        System.out.println("Even Numbers Count : " + iCountEven);

        System.out.println("Odd Numbers Count : " + iCountOdd);

    }
}

class Program21_2
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.countEvenOddRange(50);    
    }
}