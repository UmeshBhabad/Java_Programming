// Accept N numbers from user and find the average of them.

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

    public float Average()
    {
        int iCnt = 0, iSum = 0;
        
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            iSum += Arr[iCnt];
        }

        return iSum / iSize;
    }
}

class program108
{
    public static void main(String[] args)
    {
        float fRet = 0.0f;
        
        Arrayx aobj1 = new Arrayx(5);

        aobj1.Accept();
        aobj1.Display();
        fRet = aobj1.Average();

        Arrayx aobj2 = new Arrayx(7);               

        System.out.println("The average of the elements is "+fRet);

    }
}