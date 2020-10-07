package GUIEvent;

import java.util.ArrayList;

public class User {
    private String name;
    private String email;
    private boolean news;
    private static ArrayList<User> users = new ArrayList();

    public User(String name, String email, boolean news) throws UserException {
        if (name.length() == 0) throw  new UserException(UserException.NO_NAME);
        if (email.length() == 0) throw  new UserException(UserException.NO_EMAIL);
        if (User.findUser(email) == true) throw new UserException(UserException.ALREADY_EXIST);
        this.name = name;
        this.email = email;
        this.news = news;
    }

    public static void add(User user) {
        users.add(user);
    }

    public static void printAllUsers() {
        users.forEach((t) -> System.out.println(t));
    }

    public static boolean findUser(String email) {
        for (int i = 0; i < users.size(); i++) {
         if (users.get(i).email.equals(email)) return true;
        }
        return false;
    }

    public String toString() {
        return "Пользователь name=" + name + "; email=" + email + "; news=" + news;
    }
}
