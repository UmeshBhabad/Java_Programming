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

    public int Summation(int Brr[])
    {
        int iCnt = 0, iSum = 0;

        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            iSum += Brr[iCnt];
        }

        return iSum;
    }
}

class program102
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
        iRet = aobj.Summation(Arr);

        System.out.println("Summation of elements of an array is : "+iRet);

        // Important

        aobj = null;
        Arr = null;
        sobj = null;

        System.gc();
    }
}