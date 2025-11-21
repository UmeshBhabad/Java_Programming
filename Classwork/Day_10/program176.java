
/*
    Input : 5

    Output :    A   B   C   D   E
    index :     1   2   3   4   5
    ASCII :     65  66  67  68  69
*/

import java.util.*;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        // int i = 65;
        char ch = 'A';

        for(iCnt = 1; iCnt <= iNo; ch++, iCnt++)
        {
            System.out.printf("%c\t", ch);
        }
    }
}

class program176
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