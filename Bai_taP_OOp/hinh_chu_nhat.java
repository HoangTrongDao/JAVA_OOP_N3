import java.util.*;
class HCN{
    private double length;
    private double width;
    public HCN() {
    }
    public HCN(double length, double width){
        this.length=length;
        this.width=width;
    }

    public void getInformation(){
        Scanner sc = new Scanner(System.in);
        this.length = sc.nextDouble();
        this.width = sc.nextDouble();
    }
    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){
        return (length+width)*2;
    }
    public void display(){
        System.out.print(" Area: "+getArea());
        System.out.print(" Perimeter: "+getPerimeter());
    }

}
public class hinh_chu_nhat{
    public static void main(String[] args){
        HCN hc = new HCN();
        hc.getInformation();
        hc.display();
    }
}