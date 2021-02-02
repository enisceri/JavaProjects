public class Customer {
    private int id;
    private String firstName;
    private String lastName;

    public Customer() {

    }

    public Customer(int id, String firstName, String lastName) {

        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
    }

    public void customerInfos()
    {
        System.out.println("-------------------------");
        System.out.println("ID         :" + getId());
        System.out.println("First Name :" + getFirstName());
        System.out.println("Last Name  :" + getLastName());


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
