
//
// TODO Write code to get a number in the range of 1 to 10
// HINT: You need to use a do while loop.
// HINT: You will need to import the Scanner class and create a Scanner object to use to get input from the user
// Good example of Do Loop

import java.util.Scanner;

public class InputWithDo
{
    /*
     * Gets a number betwwen 1 and 10 (inclusive) from the user
     * @return user input between 1 and 10 (inclusive)
     */
    public int getValidInput()
    {
        //TODO Write code to get a number in the range of 1 to 10
        // System.out.print("Enter an integer >=1 and <=10: "); //use this for the prompt
        int value;
        Scanner in = new Scanner(System.in);
        do
        {
        	System.out.print("Enter an integer >=1 and <=10: ");
        	value = in.nextInt();
        }
        while (value < 1 || value > 10);
        
        return value;
    }
}

