import javax.lang.model.element.Name;

//create Persoon class
public class Person{

    //declare class attributes 
    private String Name;
    private int ID;

    //create class constructor
    Person(String Name, int ID){

        this.Name = Name;
        this.ID = ID;
    }

    //create getter methods to display attributes 
    public void getName(){

        System.out.println("Name : " + Name);
    }

    public void getID(){

        System.out.println("ID : " + ID);
    }

    //create setter methods to update attributes 
    public void setName(String Name) {

        this.Name = Name;
    }

    public void setID(int ID) {

        this.ID = ID;
    }

    public static void main(String[] arg){

        //create an object of Person class with class constructor
        Person p1 = new Person("Arif", 5017);

        //display data with getter methods
        p1.getName();
        p1.getID();

        //update data with setter method
        p1.setName("Arif Uddin");

        //display data with getter methods
        p1.getName();
        p1.getID();
    }
}