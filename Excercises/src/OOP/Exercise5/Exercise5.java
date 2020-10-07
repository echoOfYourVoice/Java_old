package OOP.Exercise5;

public class Exercise5 {

    public static void main(String[] args) {
	// write your code here
        MyMath math = new MyMath();
        System.out.println("count: " + MyMath.getCount());
        System.out.println(MyMath.add(1, 6));
        System.out.println("count: " + MyMath.getCount());
        System.out.println(MyMath.sub(10, 5));
        System.out.println("count: " + MyMath.getCount());
        System.out.println(MyMath.mult(3, 9));
        System.out.println("count: " + MyMath.getCount());
        System.out.println(MyMath.div(64, 8));
        System.out.println("count: " + MyMath.getCount());

    }
}
