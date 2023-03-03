//Car sub-class inherits(speed, run()) from Vehicle class
public class Car extends Vehicle{

    //Method Override 
    public void run()
    {
        System.out.println("The Car is running at: " + this.speed);
    }
}