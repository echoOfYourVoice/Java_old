package JavaPhilosophy.initializedClass;

public class Main {
    public static void main (String args[]) {
        MyClass myClass = new MyClass("123");
    }
}

 class MyClass {
    String str;
    int i;
  MyClass(String str) {
      this.str = str;
      i = 15;
  }
}
