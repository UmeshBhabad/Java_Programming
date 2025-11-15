// Checked Exception

import java.io.*;

class program76
{
    public static void main(String args[]) throws IOException                       // Not a good programming method(using the throw statement)
    {
        int iNo = 0;                                                                // Local Variables
        int iCnt = 0;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in)); // Creating object of BufferedReader

        System.out.println("Enter the Number");                                     // Accepting Input From user
        
        iNo = Integer.parseInt(bobj.readLine());                                    // Storting input in the Variable

        for(iCnt = 1; iCnt <= iNo / 2; iCnt++)                                      // Business Logic
        {
            if(iNo % iCnt == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}