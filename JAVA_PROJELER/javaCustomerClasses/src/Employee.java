public class Employee extends  Person{
    public Employee()
    {
        this.salary = 2500;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    private double salary;
}
