import java.util.*;

class Point {
    private double x;
    private double y;
    // Constructor mặc định
    public Point() {
        x = 0;
        y = 0;
    }
    // Constructor có tham số
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    // Getter
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    // Tính khoảng cách giữa 2 điểm
    public double distance(Point p) {
        return Math.sqrt(
            (x - p.x) * (x - p.x)
            + (y - p.y) * (y - p.y)
        );
    }

    // toString
    @Override
    public String toString() {
        return "(" + x + ". " + y + ")";
    }
}

public class J04001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();

            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();

            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);

            System.out.printf("%.4f\n", p1.distance(p2));
        }
    }
}