package StaticData;

public class Main {

    public static void main(String[] args) {
	// write your code here
        new Person();
        System.out.println("Создано объектов " + Person.count);
        new Person();
        System.out.println("Создано объектов " + Person.count);
        new Person();
        System.out.println("Создано объектов " + Person.getCount());
        Person p = new Person();
        System.out.println("Создано объектов " + Person.getCount());
    }
}
