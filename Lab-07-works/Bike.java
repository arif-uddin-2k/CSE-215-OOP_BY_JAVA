//Bike sub-class inherits(speed, run()) from Vehicle class
public class Bike extends Vehicle{

    //Method Override
    public void run()
    {
        System.out.println("The Bike is running at: " + this.speed);
    }
}