//creating a class "Static_method"
public class Static_method {

    //declare static void method with no parameter
    static void method1() {

        System.out.println("This is static method");
    }

    //declare non-static void method with no parameter
    void method2() {

        System.out.println("This is non-static method");
    }

    public static void main(String[] args) {

        //creating an "Static_method" object
        Static_method s1 = new Static_method();

        //calling static method with no parameter
        method1();
        //calling non-static method with no parameter
        s1.method2();
    }
}