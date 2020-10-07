package OOP.Exercise1;

public class User1 {
    private int id;
    private String login;
    private String password;

    public User1(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public User1() {
        this.id = 0;
        this.login = "guest";
        this.password = "";
    }

    public void setLogin(String login) {
        this.login = login;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public void setLogin() {
        this.login = "guest";
    }
    public void setPassword() {
        this.password = "";
    }
    public void setId() {
        this.id = 0;
    }

    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
    public int getId() {
        return id;
    }
}
