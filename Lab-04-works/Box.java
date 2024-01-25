//creating a class "Box"
public class Box {

    //declare instance variables 
    int length;
    int weight;
    int height;

    //declare void method with 2 parameter
    void area(int length,int weight) {

        System.out.println("Area : " + length * weight);
    }

    //declare void method with 3 parameter
    void area(int length,int weight,int height) {
        
        System.out.println("Area : " + length * weight * height);
    }

    public static void main(String[] args) {

        //creating an "Box" object
        Box b1 = new Box();

        //calling method with 2 parameter
        b1.area(10,5);

        //calling method with 3 method
        b1.area(10,5,10);
        
    }
}

