
/*
    Input : 8

    Output :    1   A   3   B   5   C   7   D
    Index :     1   2   3   4   5   6   7   8
    
*/

import java.util.*;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        char ch = 'A';

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 1)
            {
                System.out.printf("%d\t", iCnt);
            }
            else
            {
                System.out.printf("%c\t", ch);
                ch++;
            }
        }
    }
}

class program177
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