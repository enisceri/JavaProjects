public class Customer extends Person{
    public Customer()
    {
        this.email = "example@gmail.com";
    }
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
