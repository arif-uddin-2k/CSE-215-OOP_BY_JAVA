public class Employee {

    String name;
    AddressInfo addressInfo;
    InsuranceInfo insuranceInfo;

    public Employee(String name, AddressInfo addressInfo, InsuranceInfo insuranceInfo)
    {
        this.name = name;
        this.addressInfo = addressInfo;
        this.insuranceInfo = insuranceInfo;
    }

    public void display()
    {
        System.out.println("Name of Employee : " + name);
        System.out.println("Address of Employee: " + addressInfo.street + ", " + addressInfo.city + ", " + addressInfo.state + "-" + addressInfo.postalCode);
        System.out.println("Insurance information: " + insuranceInfo.policyName + ", " + insuranceInfo.policyId);
    }

    public static void main(String[] args) {

        AddressInfo addressInfo= new AddressInfo("Mazar Road", "Mirpur-1", "Dhaka", "1216");

        InsuranceInfo insuranceInfo = new InsuranceInfo("Life Insurance", 5017);

        Employee employeee =new Employee("Arif. Uddin", addressInfo, insuranceInfo);

        employeee.display();
    }


}
