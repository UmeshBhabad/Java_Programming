// Write a program to print all even Number up to N.

///////////////////////////////////////////////////////////////////////////////////
//
// Function Name: printEvenNumber
// Description:   Used to print all even Number up to N.
// Input:         Integer
// Output:        Integer
// Author:        Umesh Shivaji Bhabad
// Date:          04/11/2025
//
///////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void printEvenNumber(int iNo)
    {
        int iCnt = 0;
        int iFrequency = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                System.out.println(iCnt);
            }
        }

    }
}

class Program18_2
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.printEvenNumber(11);    
    }
}