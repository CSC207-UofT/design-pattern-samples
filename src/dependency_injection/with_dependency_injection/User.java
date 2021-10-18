package dependency_injection.with_dependency_injection;

public class User {


    private final String name;
    private final String email;


    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }


    public String getName() {
        return this.name;
    }

    public String getInfo() {
        return this.name + " (" + this.email + ")";
    }

}
