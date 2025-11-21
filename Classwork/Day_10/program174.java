
/*
    Input : 5

    Output :    a   b   c   d   e
    index :     1   2   3   4   5
    ASCII :     97  98  99  100 101
*/

import java.util.*;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        int i = 97;

        for(iCnt = 1; iCnt <= iNo; iCnt++, i++)
        {
            System.out.printf("%c\t", i);            
        }
    }
}

class program174
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