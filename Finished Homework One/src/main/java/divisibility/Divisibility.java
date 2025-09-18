package divisibility;
//Added in a Scanner so that it can read input
import java.util.Scanner;
//This program reads in two numbers from the user, dividend and divisor, and prints out whether dividend is evenly divisible by divisor.
//
// For example, one run of the program may look like this:
//
//Enter the dividend: 10
//Enter the divisor: 5
//10 is divisible by 5!
//
//Because 5 goes into 10 twice. 10 is evenly divisible by 5.

//Your program should be able to produce the following output:
//
//Enter the dividend: 10
//Enter the divisor: 0
//10 is not divisible by 0


public class Divisibility {

    public static void main(String[] args) {
        //Input system, tells the user to do an action and saves the number
        Scanner dividend = new Scanner(System.in);
        System.out.println("Please, enter dividend.");
        int divide = dividend.nextInt();
        System.out.println("Please, enter divisibility.");
        int divider = dividend.nextInt();
        dividend.close();

        //Added a try catch exception handler because dividing by 0 gave an arithmetic exception error
        try{
            if (divide%divider == 0)
            {
                System.out.println(divide + " is divisible by " + divider);
            }
            // Added this even though it wasn't part of instructions so that it can work for any kind of number
            else
            {
                System.out.println(divide + " is not divisible by " + divider);
            }
        }
        // For when the code gives an arithmetic exception
        catch(Exception e){
            System.out.println(divide + " is not divisible by " + divider);
        }

    }
}
