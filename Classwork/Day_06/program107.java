// OOP Design

import java.util.*;

class Arrayx
{
    private int Arr[];
    private int iSize;

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

        System.out.println("Elements of the array are : ");

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
}

class program107
{
    public static void main(String[] args)
    {
        Arrayx aobj1 = new Arrayx(5);

        aobj1.Accept();
        aobj1.Display();

        Arrayx aobj2 = new Arrayx(7);               

        aobj2.Accept();
        aobj2.Display();

    }
}