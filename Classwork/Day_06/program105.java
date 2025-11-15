// OOP Design

import java.util.*;

class Arrayx
{
    public int Arr[];
    public int iSize;

    public Arrayx(int iNo)
    {
        System.out.println("Inside Constructor");
        
        iSize = iNo;
        Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        int iCnt = 0;

        System.out.println("Enter the Elements of an array :");

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    public void Display()
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
}

class program105
{
    public static void main(String[] args)
    {
        Arrayx aobj1 = new Arrayx(5);
        System.out.println(aobj1.iSize);

        // Bad Code
        aobj1.iSize = 11;                           // Need of access specifier
        aobj1.Arr = null;

        Arrayx aobj2 = new Arrayx(7);
        System.out.println(aobj2.iSize);

    }
}