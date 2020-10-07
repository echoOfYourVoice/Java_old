package Interfaces;

public class Circle extends Shape {
    public int r;

    public Circle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }
    public void draw() {
        String s = "Рисуем окружность с центром (" + x + ", " + y + ") ";
        s += "и радиусом " + r;
        System.out.println(s);
    }
}
