package JavaPhilosophy.constructorInConstructor;

public class Main {
    public static void main(String[] args) {
    MyClass myClass = new MyClass(13, "123");
    System.out.println("----------------------------------");
    System.out.println(myClass.i);
    }
}

class MyClass {
    int i;
    MyClass(int i) {
        this.i = i;
    }
    MyClass(int i, String s) {
    this(i);
    System.out.println(s);
    }
}
