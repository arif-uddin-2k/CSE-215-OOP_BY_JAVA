//create Room class
public class Room {

    //declare class attributes 
    int room_no;
    String room_type;
    float room_area;
    boolean ac_machine;
    
    //create class constructor
    Room(int no, String type, float area, boolean ac){

        this.room_no = no;
        this.room_type = type;
        this.room_area = area;
        this.ac_machine = ac;
    }
    Room(){

        System.out.println("Hello, an object of Room class is created\n");
    }
    //create a method to dispaly data
    public void displayData(){

        System.out.println("Room_No : " + room_no);
        System.out.println("Room_Type : " + room_type);
        System.out.println("Room_Area : " + room_area);
        System.out.println("Ac_Machine : " + ac_machine);
    }

    public static void main(String[] args){

        //create an object of Room class with class constructor
        new Room();
        Room r1 = new Room( 215, "Luxury", 440.50f, true);

        //calling method to display data
        r1.displayData();
    }
}