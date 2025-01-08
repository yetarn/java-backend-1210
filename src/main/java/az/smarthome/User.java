package az.smarthome;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;


    public User(String firstName, String lastName, String email, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public void register(){
        System.out.println("User " + firstName + lastName + "registered.");
    }

    public void login(){
        System.out.println(firstName + "logged in.");
    }

    public void logout(){
        System.out.println(firstName + "logged out.");
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

}
