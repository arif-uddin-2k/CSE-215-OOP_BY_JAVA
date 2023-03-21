public class Car {

    public String model;
    public String company;

    public Car(String model, String company){
        this.model = model;
        this.company = company;
    }
    public void drive(){

        System.out.println("Driving");
    }
    public void stop(){

        System.out.println("Stopping");
    }
}
