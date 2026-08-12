package javabuoi4;
public class Circle{
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double area1()
    {
        return Math.PI * radius *radius;
    }
}