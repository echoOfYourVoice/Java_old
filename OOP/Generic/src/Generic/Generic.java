package Generic;

public class Generic { //Обобщенный класс. c неизвестными заранее типами данных

    public static void main(String[] args) {
	// write your code here
        Test<Integer, String> t = new Test<Integer, String>(10, "Hello");
        t.print();
        t.setData_1(15);
        t.setData_2("World!");
        System.out.println(t.getData_1());
        System.out.println(t.getData_2());

        Test t1 = new Test(true, false);
        t1.print();
        t1.setData_1(5);
        t1.print();
    }
}
