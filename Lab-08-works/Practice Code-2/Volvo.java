

public class Volvo extends Car{

    double price;
    String productionYear;
    String registrationNumber;
    Engine eng;
    DashBoard db;

    public Volvo(String model, String company, double price, String productionYear, String registrationNumber, Engine eng, DashBoard db){

        super(model, company);
        this.price = price;
        this.productionYear = productionYear;
        this.registrationNumber = registrationNumber;
        this.eng = eng;
        this.db = db;
    }
    
    public void changeFuel(){

        System.out.println("Changing Fuel");
    }
    public void checkBattery(){

        System.out.println("Checking battery");
    }

    public static void main(String[] args) {

        Engine eng = new Engine(165.5);

        DashBoard db = new DashBoard(5.5);

        Volvo v = new Volvo("R15 v4","Yamaha" ,450000, "2022", "DHA34567", eng, db);

        v.drive();
        v.stop();
        v.changeFuel();
        v.checkBattery();
        System.out.println(v.company+" "+ v.model);
    }
}
