import java.util.*;
import java.io.*;
class Point{
    private double x;
    private double y;

    public Point(){
        this.x=0;
        this.y=0;
    }
    public Point(double p){
        this.x=p;
        this.y=p;
    }
    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double distance(Point p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }

    public static double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow(p1.getX()-p2.getX(),2)+Math.pow(p1.getY()-p2.getY(),2));

    }
    @Override
    public String toString(){
        return "("+x+","+y+")";
    }
}
class Tamgiac{
    private Point p1;
    private Point p2;
    private Point p3;
    public Tamgiac(Point p1, Point p2, Point p3){
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
    }
    public boolean Kt(){
        double a=p1.distance(p2);
        double b=p2.distance(p3);
        double c=p3.distance(p1);
        return (a+b>c && a+c>b && b+c>a);
    }
    public void In_p(){
        if(!Kt()){
            System.out.println("INVALID");
        }
        else{
            double a = p1.distance(p2);
            double b = p2.distance(p3);
            double c = p3.distance(p1);
            double perimeter = a+b+c;
            System.out.println(String.format("%.3f",perimeter));
        }
    }
}
public class J04008{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point p1=new Point(sc.nextDouble(),sc.nextDouble());
            Point p2=new Point(sc.nextDouble(),sc.nextDouble());
            Point p3=new Point(sc.nextDouble(),sc.nextDouble());
            Tamgiac tg=new Tamgiac(p1,p2,p3);
            tg.In_p();
        }
        sc.close();
    }
}