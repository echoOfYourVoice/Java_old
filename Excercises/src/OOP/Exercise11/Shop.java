package OOP.Exercise11;

public class Shop<data_1> {
    private data_1[] x;
    public Shop(data_1[] x) {
       this.x = x;
    }
    public void printObject() {
        for (data_1 d : x) System.out.print(d + " ");
    }
}
