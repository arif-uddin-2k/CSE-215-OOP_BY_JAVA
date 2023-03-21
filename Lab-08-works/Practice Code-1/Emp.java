
public class Emp {
 
    int id;
    String name;
    Address address;

    public Emp(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display(){

        System.out.println(id + " " + name);
        System.out.println(address.city + ", " + address.state + ", " + address.country);
    }
    public static void main(String[] args) {

        Address add1 = new Address("Mirpur-1", "Dhaka", "Bangladesh");
        Address add2 = new Address("Dhanmondi-27", "Dhaka", "Bangladesh");

        Emp emp1 = new Emp(111, "Arif", add1);
        Emp emp2 = new Emp(112, "Nahin", add2);

        emp1.display();
        emp2.display();
    }
}
