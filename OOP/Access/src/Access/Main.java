package Access;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person p = new Person();
        System.out.println(p.name);
        System.out.println(p.city); // Работает, посколько один пакет Access
        //System.out.println(p.age); -- ошибка доступа
        System.out.println(p.getAge());
    }
}
