package OOP.Exercise1;

public class Exercise1 {

    public static void main(String[] args) {
	// write your code here
    User1[] users = new User1[2];
    users[0] = new User1(1, "Novella", "nov");
    users[1] = new User1(2, "Nirvana", "nir");

    for (User1 u : users) System.out.println("id=" + u.getId() + "; логин=" + u.getLogin() + "; пароль=" + u.getPassword());

    User1 user1 = new User1();
    user1.setId(3);
    user1.setLogin("Sly");
    user1.setPassword("qwerty");
    }
}
