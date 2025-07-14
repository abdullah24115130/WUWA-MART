package wuwamart.users;

public class User {

    protected int id;
    protected String fullName;
    protected String userName;
    protected String password;
    protected String email;

    public User(int id, String fullName, String userName, String password, String email) {
        this.id = id;
        this.fullName = fullName;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String gerPassword() {
        return password;
    }

    public void dispaly() {
        System.out.println("Id       : " + id);
        System.out.println("Name     : " + fullName);
        System.out.println("UserName : " + userName);
        System.out.println("Email    : " + email);

    }
}
