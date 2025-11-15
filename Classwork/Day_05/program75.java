// Checked Exception

// Using try and catch block to handle check exception.

import java.io.*;

class program75
{
    public static void main(String args[])                                              // Main method
    {
        int iNo = 0;                                                                    // Local Variable
        int iCnt = 0;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));     // creating BufferedReader class to take input 

        System.out.println("Enter the Number");                                         // Accepting input from user
        
        // Using try and catch block to handle exception
        try
        {
            iNo = Integer.parseInt(bobj.readLine());
        }
        catch(IOException iobj)
        {

        }

        for(iCnt = 1; iCnt <= iNo / 2; iCnt++)                                          // Business Logic
        {
            if(iNo % iCnt == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}