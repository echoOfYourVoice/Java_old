package OOP.Exercise6;

import OOP.Exercise1.User;

public class UserSocial extends User implements Cloneable {
    private String name;
    private int age;

    public UserSocial(int id, int age, String name, String login, String password) {
        super(id, login, password);
        this.age = age;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void printUser() {
        System.out.println("userSocial с именем " + name + ", возрастом " + age + ", логином " + getLogin() + ", паролем " + getPassword());
    }

    @Override
    public String toString() {
        return "userSocial с именем " + name + ", возрастом " + age + ", логином " + getLogin() + ", паролем " + getPassword();
    }

    public UserSocial clone() {
        return new UserSocial(getId(),age, name, getLogin(), getPassword());
    }
}
