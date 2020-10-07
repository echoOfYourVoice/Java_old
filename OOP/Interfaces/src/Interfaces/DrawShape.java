package Interfaces;

public interface DrawShape {
    public void draw();

    default void hello() { //Реализация по умолчанию - default, не обязателен в классах
       System.out.println("Hello World!");
    }
}
