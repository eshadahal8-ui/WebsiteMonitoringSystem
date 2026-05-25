package model;

public class User {

    private int userID;
    private String username;
    private String email;
    private String password;

    public User(int userID, String username, String email, String password) {
        this.userID = userID;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public boolean login() {
        System.out.println(username + " logged in successfully.");
        return true;
    }

    public void register() {
        System.out.println(username + " registered successfully.");
    }

    public void logout() {
        System.out.println(username + " logged out.");
    }
}
