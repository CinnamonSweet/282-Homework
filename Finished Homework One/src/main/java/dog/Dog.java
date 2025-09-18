package dog;
//Here we have a class that represents a dog. Currently, the only instance variable (or field) is called breed. You can make a new Dog object by passing the breed to the constructor.
//
//Add an instance variable that is a String called name, which represents the dog’s name. Add the instance variable and also include it as the second parameter to the constructor.
//
//You should update the toString and the format should be: “[name] is a [breed]”
//For example:
//
//Bluey is a Australian Cattle Dog
//Test out your Dog class and the new toString method in DogTester.java


public class Dog {
    private String breed;
    //Added the string to keep the dog's name
    String name;

    //Need to add a String to the constructor in order to make it not break at giving Bluey a name
    public Dog(String theBreed, String dogname)
    {
        breed = theBreed;
        name = dogname;
    }

    //Changed the toString to the one specified
    public String toString()
    {
        return (name + " is a " + breed);
    }
}
