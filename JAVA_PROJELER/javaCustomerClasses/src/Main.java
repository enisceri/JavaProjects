public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer();
        Employee employee = new Employee();

        System.out.println("CUSTOMER FEATURES");
        System.out.println("--------------------");
        System.out.println("ID         :" + customer.getId());
        System.out.println("First Name :" + customer.getFirstName());
        System.out.println("Last  Name :" + customer.getLastName());
        System.out.println("Age        :" + customer.getAge());
        System.out.println("Email      :" + customer.getEmail());
        System.out.println("--------------------");

        System.out.println("EMPLOYEE FEATURES");
        System.out.println("--------------------");
        System.out.println("ID         :" + employee.getId());
        System.out.println("First Name :" + employee.getFirstName());
        System.out.println("Last  Name :" + employee.getLastName());
        System.out.println("Age        :" + employee.getAge());
        System.out.println("Salary     :" + employee.getSalary());
        System.out.println("--------------------");


    }
}
