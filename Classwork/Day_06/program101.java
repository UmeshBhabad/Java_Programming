// Accept N elements from the User and print the count of the even Numbers.

import java.util.*;

class Arrayx
{
    public void Display(int Brr[])
    {
        int iCnt = 0;

        System.out.println("Elements of an array are : ");
        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            System.out.println(Brr[iCnt]);
        }
    }

    public int CountEven(int Brr[])
    {
        int iCnt = 0, iCount = 0;

        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            if(Brr[iCnt] % 2 == 0)
            {
                iCount++;
            }
        }

        return iCount;
    }
}

class program101
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0, iCnt = 0, iRet = 0;
    
        System.out.println("Enter the size of an array : ");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the Elements");

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
        
        Arrayx aobj = new Arrayx();

        aobj.Display(Arr);
        iRet = aobj.CountEven(Arr);

        System.out.println("Even Numbers are : "+iRet);

        // Important

        aobj = null;
        Arr = null;
        sobj = null;

        System.gc();
    }
}