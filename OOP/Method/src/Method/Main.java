package Method;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person p = new Person("Igor", "Omsk", 20);
        p.setName("Oleg");
        p.setCity("Krasnodar");
        p.setAge(25);
        System.out.println(p.getTextInfo());
        System.out.println(p.getName());
        System.out.println(p.getCity());
        System.out.println(p.getAge());

        Person pNew = new Person("Alex", "Moscow", 25);
        p.whoIsOlder(pNew);
        pNew.setAge(30);
        p.whoIsOlder(pNew);
        pNew.setAge(15);
        p.whoIsOlder(pNew);

        Person person = new Person();
        System.out.println(person.getTextInfo());

        pNew.setName();
        pNew.setCity();
        pNew.setAge();
        System.out.println(pNew.getTextInfo());
    }
}