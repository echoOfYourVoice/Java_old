package Anonymous;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Shape p = new Shape(10, 20) { //Анонимный класс, применяется, только когда объект нужен 1 раз
        @Override
        public void draw() {
            System.out.println("Рисуем точку с координатами (" + x + ", " + y + ")");
        }
    };
    p.draw();
    DrawShape ds = new DrawShape() {
        @Override
        public void draw() {
        System.out.println("Рисование фигуры");
        }
    };
    ds.draw();
    }
}
