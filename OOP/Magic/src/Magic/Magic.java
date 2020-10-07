package Magic;

public class Magic {

    public static void main(String[] args) {
	// write your code here
        Point p = new Point(10, 20);
        System.out.println(p);
        String s = "Наш объект: " + p;
        System.out.println(s);

        Point pNew = p; //Ссылка на тот же самый объект в ячейке памяти
        System.out.println(pNew);
        p.x = 30;
        System.out.println(pNew);

        pNew = p.clone(); // Создание еще одного объекта в новой ячейке памяти
        p.x = 50;
        System.out.println(pNew);
        pNew.y = 40;
        System.out.println(p);
    }
}
