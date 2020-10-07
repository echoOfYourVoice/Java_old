package Objects.ObjectString;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char[] cArr = {'a', 'b', 'c', 'd'};
        String s1 = new String(cArr);
        System.out.println(s1);
        String s2 = "My new string";
        String s3 = "My new string";
        System.out.println(s2.charAt(1)); // Возвращает элемент с этим индексом
        System.out.println(s2.equals(s3)); // подобно
        System.out.println(s2.startsWith("3My")); // НачинаетсяС
        System.out.println(s2.endsWith("ring"));// Заканчивается на
        System.out.println(s2.indexOf("ne")); //С какого элемента строка начинается, если нет, возвращает -1
        System.out.println(s2.lastIndexOf("n"));
        System.out.println(s2.length());
        System.out.println(s2.replace('y', 't')); //Замена
        System.out.println(s2.substring(5)); //Создаёт новую строку
        System.out.println(s2.substring(5, 8)); //Создаёт новую строку
        System.out.println(s2.toLowerCase()); //нижний регистр
        System.out.println(s2.toUpperCase()); //верхний регистр
        String userData = "              ddddddd@ddddddd.ru                       ";
        System.out.println(userData);
        System.out.println(userData.trim()); //Удаляет все пробельные символы
    }
}
