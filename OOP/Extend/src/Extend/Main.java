package Extend;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Programmer p = new Programmer("Michael", "Omsk", 25, 10);
        System.out.println(p.getTextInfo());

        Worker w = new Worker();
        w.setSalary(20000);
        System.out.println(w.getTextInfo());

        System.out.println(new Worker().getTextInfo());

        Person prog = new Programmer("Igor", "Moscow", 35, 15);
        System.out.println(prog.getTextInfo());
    }
}
