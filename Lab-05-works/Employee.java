//Create Employee class
public class Employee{ 

    int Id; 
    String Name; 

    //Create a class constructor for the Employee class
    public Employee(int id, String name){

        this.Id = id;
        this.Name = name;
    }
    
    //Display Employee information 
     void info(){ 

        System.out.println("Name : "+Name); 
        System.out.println("Id : "+Id); 
     } 

    public static void main(String[] args){ 

        //Create an object of class Employee
        Employee emp = new Employee(5017, "Arif Uddin");

        //Calling method to display Employee information 
        emp.info(); 
    }
}