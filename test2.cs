using System;

class Program
{
    static void Main(string[] args)
    {
        // Hardcoded secret password
        string secretPassword = "mySecretPassword1304";

        Console.WriteLine("Enter the password:");
        string userInput = Console.ReadLine();

        if (userInput == secretPassword)
        {
            Console.WriteLine("Access granted!");
            // Place your code here for actions after successful authentication
        }
        else
        {
            Console.WriteLine("Access denied!");
            // Place your code here for actions after failed authentication
        }
    }
}
