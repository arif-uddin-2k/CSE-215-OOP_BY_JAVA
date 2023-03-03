//import Scanner class to take user input
import java.util.Scanner;

//create Main class for test
public class Main
{
    public static void main(String[] args) {

        //declare three local varible
        int a, b, c;

        //input value for three local variable
        try (Scanner in = new Scanner(System.in)) {
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
        }

        //create an object of Vehicle class
        Vehicle obj1 = new Vehicle();
        obj1.speed = a;
        obj1.run();

        //create an object of Bike class
        Bike obj2 = new Bike();
        obj2.speed = b;
        obj2.run();

        //create an object of Car class
        Car obj3 = new Car();
        obj3.speed = c;
        obj3.run();
    }
}

