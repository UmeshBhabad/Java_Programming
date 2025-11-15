// Dynamic Array

import java.util.*;

class Arrayx
{
    void Display(int Brr[])
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            System.out.println(Brr[iCnt]);
        }
    }
}

class program100
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0;
    
        System.out.println("Enter the size of an array : ");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the Elements");
        
        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
        

        Arrayx aobj = new Arrayx();

        aobj.Display(Arr);

        // Important

        aobj = null;
        Arr = null;
        sobj = null;

        System.gc();
    }
}