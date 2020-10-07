package JavaPhilosophy.finalize;

public class Main {
    public static void main( String[] args) {
    MyClass myClass = new MyClass();
    myClass.finalize();

    Tank tank1 = new Tank(false);
    tank1.finalize();

    Tank tank2 = new Tank(true);
    tank2.finalize();
    }
}

class MyClass {
    public void finalize() {
    System.out.println("Очищаем объект");
    }
}

class Tank {
    boolean empty;
    Tank(boolean empty) {
        this.empty = empty;
    }
    public void finalize() {
        if (empty) {
          System.out.println("Бак пуст, очищаем объект");
        }
    }
}
