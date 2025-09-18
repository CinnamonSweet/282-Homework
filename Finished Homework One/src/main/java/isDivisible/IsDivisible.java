package isDivisible;
//Added this because why not make it interactable
import java.util.Scanner;

//Write a method that returns whether a is divisible by b.
//
//Your method signature should be
//
//public boolean isDivisible(int a, int b)


public class IsDivisible {

    public static void main(String[] args)
    {
        //Had to make an object otherwise I get an error for trying to run a non-static method in a static method
        IsDivisible d = new IsDivisible();
        //User input
        Scanner divisible = new Scanner(System.in);
        System.out.println("Please enter the first number.");
        int n1 = divisible.nextInt();
        System.out.println("Please enter the second number.");
        int n2 = divisible.nextInt();
        //Says whether or not the n1/n2 is divisible
        try{
            System.out.println(d.isDivisible(n1, n2));
        }
        //This is just in case the user wants to do something like 2/0
        catch(Exception e){
            System.out.println("Oopsies, you caused a little bit of an error, specifically this one: " + e);
            System.out.println("Try again later.");
        }
    }
    //Added divisibility check method
    public boolean isDivisible (int a, int b)
    {
        if (a%b == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
