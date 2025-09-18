package threeStrings;
//Write a program that asks the user for three strings.
//
//Then, print out whether the first string
//concatenated to the second string is equal to the
//third string. Here are a few sample program runs:
//
//Sample Program 1:
//
//First string? pepper
//Second string? mint
//Third string? peppermint
//pepper + mint is equal to peppermint!
//Sample Program 2:
//
//First string? go
//Second string? fish
//Third string? donuts
//go + fish is not equal to donuts!

//User Input
import java.util.Scanner;

public class ThreeStrings {

    public static void main(String[] args) {
        Scanner sentence = new  Scanner(System.in);
        System.out.println("Please enter a word.");
        String s1 =  sentence.nextLine();
        System.out.println("Please enter a word.");
        String s2 = sentence.nextLine();
        System.out.println("Please enter a word.");
        String s3 = sentence.nextLine();
        sentence.close();
        //Used .equals() to see if s1+s2 equalled s3 because using == did not work
        if ((s1 + s2).equals(s3)){
            System.out.println(s1 + "+" + s2 + " is " + s3 + "!");
        }
        else{
            System.out.println(s1 + " + " + s2 + " is not " + s3);
        }
    }
}
