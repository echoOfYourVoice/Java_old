package JavaPhilosophy.messageFromConstructor;

public class Main {
    public static void main(String[] args) {
    new MyClass();
    System.out.println("-------------------------------------------------");
    new MyClass("123");
    System.out.println("-------------------------------------------------");

        Dog dog = new Dog();
        dog.bark();
        dog.bark(1);
        dog.bark("1");
        System.out.println("-------------------------------------------------");
    new withoutContr();
    }
}

class MyClass {
   MyClass() {
       System.out.println("Создан новый экземпляр класса «MyClass»");
   }
   MyClass(String str) {
       System.out.println("Создан новый экземпляр класса «MyClass»");
       System.out.println("Параметр класса " + str);
   }
}

class Dog {
  void bark() {
    System.out.println("Собака поскуливает");
    }
    void bark(int x) {
      System.out.println("Собака лает");
    }
    void bark(String str) {
      System.out.println("Собака завывает");
    }
    // Тест на различие порядка аргументов
    void bark(String str, char c) {
      System.out.println("Собака беснует");
    }
    void bark(char c, String str) {
      System.out.println("Собака храпит");
    }
}

class withoutContr {

}
