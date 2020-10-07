package OOP.Exercise6;

import OOP.Exercise1.User;

import java.util.Random;

public class Exercise6 {

    public static void main(String[] args) {
	// write your code here
    UserSocial userSocial = new UserSocial(1, 25, "Roma", "Novella43x2", "123456789");
    WebMaster ant = new WebMaster(2, "WebMaster", "WeMaster1", "www.google.com");
    System.out.println(ant.getId());
    System.out.println(ant.getLogin());
    System.out.println(ant.getPassword());
    System.out.println(ant.getAddress());
    ant.setId(3);
    System.out.println(ant.getId());
    ant.setLogin("Master");
    System.out.println(ant.getLogin());
    ant.setPassword("qwerty");
    System.out.println(ant.getPassword());
    ant.setAddress("www.yandex.ru");
    System.out.println(ant.getAddress());
    userSocial.printUser();

    // UserSocial
        System.out.println(userSocial.getId());
        System.out.println(userSocial.getAge());
        System.out.println(userSocial.getName());
        System.out.println(userSocial.getLogin());
        System.out.println(userSocial.getPassword());
        userSocial.setId();
        System.out.println(userSocial.getId());
        userSocial.setAge(40);
        System.out.println(userSocial.getAge());
        userSocial.setName("Billy");
        System.out.println(userSocial.getName());
        userSocial.setLogin();
        System.out.println(userSocial.getLogin());
        userSocial.setPassword();
        System.out.println(userSocial.getPassword());
        ant.printUser();
        System.out.println(ant);
        System.out.println(userSocial);
        WebMaster webMaster = ant.clone();
        webMaster.setAddress("www.amazon.com");
        System.out.println(webMaster);
        System.out.println(ant);
    }
}
