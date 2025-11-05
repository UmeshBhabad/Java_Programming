// Write a program to check whether a number is palindrome or not.

///////////////////////////////////////////////////////////////////////////////////
//
// Function Name: CheckPalindrome
// Description:   Used to check whether a number is palindrome or not.
// Input:         Integer
// Output:        Integer
// Author:        Umesh Shivaji Bhabad
// Date:          04/11/2025
//
///////////////////////////////////////////////////////////////////////////////////


class Logic
{
    void checkPalindrome(int iNo)
    {
        int iDigit = 0, iRet = 0, iTemp = iNo;
        

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iRet = iRet * 10 + iDigit;
            iNo /= 10;
            
        }
        if( iRet == iTemp )
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }

    }
}

class Program17_2
{
    public static void main(String args[])
    {
        Logic obj =new Logic();
        obj.checkPalindrome(121);
    }
}