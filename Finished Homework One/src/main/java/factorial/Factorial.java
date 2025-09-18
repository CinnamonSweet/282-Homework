package factorial;
//Needed for getting user input
import java.util.Scanner;

/*
Write a program that prints a factorial to the screen.

The factorial of a number is found by multiplying itself by all positive integers less than it (excluding 0). For example, 4 factorial, written as 4!, can be computed as follows:

4! == 4 * 3 * 2 * 1 == 24
After taking user input for the factorial they want to find, print out the factorial to the console.
Remember to use a for loop! Java does not have a built in factorial operator.
Example Output:
What number would you like to compute the factorial for? 4
24
*/

public class Factorial {

    public static void main(String[] args)
    {
        //This system is here to make it so that the program can use user input
        Scanner factorial = new Scanner(System.in);
        //Added this because I didn't realize I even started running the file
        System.out.println("What number would you like to compute the factorial for?");
        int factorno =  factorial.nextInt();
        //n's here to be the actual factorial result
        int n = 1;
        //This is how the factorial actually works, and so that even if you put 0 it would still work
        do {
            n = n*(factorno);
            factorno--;
        }
        while(factorno > 0);
        //Prints out the factorial
        System.out.println(n);
    }
}
