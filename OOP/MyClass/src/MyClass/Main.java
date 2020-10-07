package MyClass;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person p = new Person("Michael", "Moscow", 30);
        System.out.println(p.name);
        System.out.println(p.city);
        System.out.println(p.age);
        Person[] p_arr = new Person[3];
        p_arr[0] = new Person("Igor", "Omsk", 35);
        p_arr[1] = new Person("Jack", "Krasnodar", 15);
        p_arr[2] = new Person("Max", "Kostroma", 18);
        for (int i = 0; i < p_arr.length; i++)
            System.out.println(p_arr[i].name + " " + p_arr[i].city + " " + p_arr[i].age);
        for (Person temp : p_arr) {
            temp.age = 15;
            System.out.println(temp.name + " " + temp.city + " " + temp.age);
        }
    }
}
