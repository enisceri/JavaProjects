public class Person {
    public Person()
    {
        this.setFirstName("FirstName");
        this.setLastName("LastName");
        this.setAge(30);
        this.setId(1);
    }
    private int id;
    private String firstName;
    private String lastName;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id < 1)
        {
            this.id = 1;
        }
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(this.age < 18)
        {
            this.age = 18;
        }
        this.age = age;
    }
}
