package SubClass;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Firm f = new Firm("My Firm", "Igor", 30);
        System.out.println(f.director.name);
        System.out.println("Директор является пенсионером = " + f.director.isPensioner());
        f.director.age = 65;
        System.out.println("Директор является пенсионером = " + f.director.isPensioner());
    }
}
