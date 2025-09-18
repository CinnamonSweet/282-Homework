package isInteger;
//User Input
import java.util.Scanner;

//    Given a string, determine if it is an integer. For example the
//    string “123” is an integer, but the string “hello” is not.
//
//    It is an integer if all of the characters in the string are digits.
//
//    Return true if it is an integer, or false if it is not.
//

public class IsInteger {
    public static void main(String[] args)
    {
        //Object so non-static can run in a static
        IsInteger i = new IsInteger();
        //User input
        Scanner input = new Scanner(System.in);
        //Added this so that user does not get confused on input
        System.out.print("Please enter whatever you like.");
        var userinput = input.nextLine();
        input.close();
        //Makes the result of isInteger viewable
        System.out.print(i.isInterger(userinput));
    }

    //non-static method for isInteger so it can return whether or not it is an integer
    public boolean isInterger(String a)
    {
        a = a.replace(" ", "");
        for (int i = a.length()-1; i >= 0; i--){
            int c = (int)(a.charAt(i));
            //So it continues on to prevent something like words with numbers like 'Danganronpa 2x2' to be counted as an integer
            if (a.charAt(i) == c && i != 0){
                i--;
            }
            else if (a.charAt(i) == c && i == 0)
            {
                return true;
            }

            else {
                return false;
            }
        }
        return false;
    }
}
