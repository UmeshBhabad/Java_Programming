// Checked Exception

// Dynamic program to find factors of a number(using BufferedReader class).

import java.io.*;

class program74
{
    public static void main(String args[])                                              // Main Method
    {
        int iNo = 0;                                                                    // Local Variables
        int iCnt = 0;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));     // BufferesReader object created for taking input

        System.out.println("Enter the Number");                                         // Accepting input from user
        iNo = Integer.parseInt(bobj.readLine());                                        // Throws Checked Exception

        for(iCnt = 1; iCnt <= iNo / 2; iCnt++)                                          // Business Logic
        {
            if(iNo % iCnt == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}