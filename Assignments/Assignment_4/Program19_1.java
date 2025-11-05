// Write a program to check whether a given Year is a leap year or not.

///////////////////////////////////////////////////////////////////////////////////
//
// Function Name: checkLeapYear
// Description:   used to check whether a given Year is a leap year or not.
// Input:         Integer
// Output:        String
// Author:        Umesh Shivaji Bhabad
// Date:          04/11/2025
//
///////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void checkLeapYear(int iYear)
    {
        if(iYear % 4 == 0 && iYear % 100 != 0 || iYear % 400 == 0)
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not a Leap Year");
        }

    }
}

class Program19_1
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.checkLeapYear(2024);    
    }
}