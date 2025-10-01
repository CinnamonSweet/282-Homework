import java.util.Arrays;

public class Main {
    public static void attemptToChangePrimitive(int val) {
        System.out.println("Inside method, parameter 'val' starts as: " + val);
        val = 99; // Local change
        System.out.println("Inside method, parameter 'val' is now: " + val);
    }

    // Used for Exercise 5
    public static int sumCoordinates(Point... points) {
        // Implementation needed for Exercise 5
        int size = points.length;
        int sum = 0;
        //simple for-loop to just add until the end of the statement
        for (int i = 0; i < size; i++){
            sum += points[i].x;
        }
        return sum;
    }

    public static void main(String[] args) {
        // --- Implement all exercises here ---
        //Created a new point - Ex1
        Point startPoint = new Point(10,20);
        //Accessing the point - Ex1
        startPoint.printState();
        //Accessing the point to alter it - Ex 1
        startPoint.move(5,-3);
        startPoint.printState();
        //Creating an int variable and initializing it
        int originalValue = 50;
        //calling the attempt to change method
        attemptToChangePrimitive(originalValue);
        System.out.println(originalValue);
        /*The reason the originalValue int does not change is because when attempttochangeprimitive is used it is changint the value exclusively in its local context and not within the context of this method.
        would not change the value of the method unless it directly altered the interger originalValue rather than the new interger that just takes the data from OriginalValue*/
        Point refPoint = new Point(9,20);
        resetPoint(refPoint);
        //refPoint.printState();
        Point noArg = new Point();
        noArg.printState();
        System.out.println("Hello World!");
        //New points to test with, since the other ones are 9 and 0 and add them together would just be 9
        Point sumPoint = new Point(17,19);
        Point spoint2 = new Point(4,200);
        System.out.println(sumCoordinates(sumPoint, spoint2));
        //To prove that it works with an array of points
        Point[] pointArray = {sumPoint, spoint2, refPoint};
        System.out.println(sumCoordinates(pointArray));
        //Ex 7
        Device d1 = new Device();
        Microwave m1 = new Microwave(900,60);
        Device polyDevice = m1;
        /*It results in the printDescription of Microwave because when the program is executed it looks at the variables
        polyDevice is packing and sees the max cook time and needs to also state that variable when it prints its description*/
        polyDevice.printDescription();
        if (polyDevice instanceof Microwave) {
            ((Microwave)polyDevice).heatFood();
        }
    }

    public static void resetPoint(Point p) {
        p.move(0,0);
        p.printState();
        // p = new Point(0,0); works since it's changing the actual point location meanwhile p.move is just grabbing the address and isn't changing the actual variable, but neither will change it permanently
        p = new Point(0,0);
        p.printState();
    }

}
