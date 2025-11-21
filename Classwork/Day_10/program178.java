
/*
    Input : 8

    Output :    z   y   x   w   v   u   t   s
    Index :     1   2   3   4   5   6   7   8
    
*/

import java.util.*;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        char ch = 'z';

        for(iCnt = 1; iCnt <= iNo; ch--, iCnt++)
        {
            System.out.printf("%c\t", ch);
        }
    }
}

class program178
{
    public static void main(String []args)
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the Frequency : ");
        iValue = sobj.nextInt();
        
        Pattern pobj = new Pattern();
        pobj.Display(iValue);
    }
}