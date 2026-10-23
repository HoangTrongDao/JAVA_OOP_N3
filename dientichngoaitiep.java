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
    public double distance(Point secondPoint ) {
        return distance(this,secondPoint);
    }
    public static double distance(Point p1,Point p2){
        double dx=p1.x-p2.x,dy=p1.y-p2.y;
        return Math.sqrt(dx*dx+dy*dy);
    }


    // toString
    @Override
    public String toString() {
        return "(" + x + ". " + y + ")";
    }
}

public class dientichngoaitiep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            Point A = new Point(sc.nextDouble(),sc.nextDouble());
            Point B = new Point(sc.nextDouble(),sc.nextDouble());
            Point C = new Point(sc.nextDouble(),sc.nextDouble());
            double kq = (B.getX()-A.getX())*(C.getY()-A.getY())-(C.getX()-A.getX())*(B.getY()-A.getY());
            if (Math.abs(kq)<1e-9){
                System.out.println("INVALID");
                continue;
            }
            double a = B.distance(C),b=C.distance(A),c=A.distance(B);
            double S = 0.25*Math.sqrt((a+b+c)*(a+b-c)*(b+c-a)*(c+a-b));
            double r = a*b*c/(4*S);
            System.out.println(String.format(Locale.US,"%.3f",Math.PI*r*r));
        }
    }
}