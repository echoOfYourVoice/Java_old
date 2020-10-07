package OOP.Exercise6;

import OOP.Exercise1.User;

public class WebMaster extends User {
private String address;

public WebMaster(int id, String login, String password, String address) {
    super(id, login, password);
    this.address = address;
}

public void setAddress(String address) {
    this.address = address;
}

public String getAddress() {
    return address;
}

    @Override
    public void printUser() {
      System.out.println("Это новый пользователь WebMaster с логином " + getLogin() + ", паролем " + getPassword() + " и адресом " + address);
    }

    public String toString() {
    return "Это новый пользователь WebMaster с логином " + getLogin() + ", паролем " + getPassword() + " и адресом " + address;
    }
    public WebMaster clone() {
        return new WebMaster(getId(), getLogin(), getPassword(), address);
    }
}
