//creating a class "Student"
public class Student {

    //declare instance variables 
    String name;
    int age;
    double cgpa;

    //declare void method with no parameter
    void displayInfo() {

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("CGPA : " + cgpa);  
    }
    public static void main(String[] args){

        //creating an "Student" object
        Student obj = new Student();
        obj.name = "Arif";
        obj.age = 22;
        obj.cgpa = 3.42;

        //calling method with no parameter
        obj.displayInfo();
    }
}
        
