// Accept String from user and append the string in another existing string.

#include <stdio.h>

void strcatX(char *Src, char *Dest)                     // Function defination
{
    // Business Logic
    while(*Dest != '\0')                                // traverse to the end of string
    {
        Dest++;
    }

    while(*Src != '\0')                                 // Append characters
    {
        *Dest = *Src;
        Src++;
        Dest++;
    }
    
    *Dest = *Src;   // *Dest = '\0'
}

int main()                                              // Main method
{
    char Arr[50] = {'\0'};                              // Local Variables
    char Brr[50] = {'\0'};

    printf("Enter Source String :\n");                  // Accept Source string
    scanf("%[^'\n']s", Arr);

    printf("Enter Destination String :\n");             // Accept Destination(existing string)
    scanf(" %[^'\n']s", Brr);   // Add white space

    strcatX(Arr, Brr);                                  // Function call

    printf("Updated string is : %s\n", Brr);            // Display Output

    return 0;
}