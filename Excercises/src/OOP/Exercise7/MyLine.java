package OOP.Exercise7;

public class MyLine {

    public MyPoint pointStart;
    public MyPoint pointEnd;

    public MyLine(int pointStartX, int pointStartY, int pointEndX, int pointEndY) {
        MyPoint pointStart = new MyPoint(pointStartX, pointStartY);
        MyPoint pointEnd = new MyPoint(pointEndX, pointEndY);
        this.pointStart = pointStart;
        this.pointEnd = pointEnd;
    }

    public class MyPoint {
       public int x;
       public int y;
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    }
}
