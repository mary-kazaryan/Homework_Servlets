package by.tms.servlet.registration;

import java.util.ArrayList;
import java.util.List;

public class InMemoryStorage {

    static List<User> arrayOfUsers = new ArrayList<>();

    public static User createUser(String name, String username, String password) {
        if (name == null) {
            System.out.println("Please write a valid name");
        } else if (username == null) {
            System.out.println("Please write a valid username");
        } else if (password == null) {
            System.out.println("Please set a password");
        } else return new User(name, username, password);
        return null;
    }

    public static boolean userExists (User user) {
    return arrayOfUsers.contains(user);
    }

    public static void addUser (User user){
        arrayOfUsers.add(user);
    }
}
