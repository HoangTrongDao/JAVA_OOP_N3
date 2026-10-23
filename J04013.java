import java.util.*;
class Tuyen_sinh{
    private String ma;
    private String ten;
    private double t,l,h;
    public Tuyen_sinh(){
    }
    public double tong(){
        return t*2+l+h;
    }
    public double uuTien() { 
        String kv = ma.substring(0, 3); 
        if (kv.equals("KV1")) { 
            return 0.5; 
        } 
        else if (kv.equals("KV2")) {
             return 1.0; 
        } 
        else if (kv.equals("KV3")) 
        { 
            return 2.5;   
        } 
        else { 
            return 1.5; 
            } 
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        this.ma = sc.nextLine();
        this.ten = sc.nextLine();
        this.t = sc.nextDouble();
        this.l = sc.nextDouble();
        this.h = sc.nextDouble();
    }
    public String dinhDang(double x) {
        if (x == (int)x) {
            return String.valueOf((int)x);
        }
        return String.format("%.1f", x);
    }
    public void in_kq() {
        double tongDiem = tong();
        double diemUuTien = uuTien();
        System.out.println(ma + " " + ten + " "
                + dinhDang(diemUuTien) + " "
                + dinhDang(tongDiem) + " "
                + (tongDiem + diemUuTien >= 24 ? "TRUNG TUYEN" : "TRUOT"));
    }
}
public class J04013{
    public static void main(String[] args){
        Tuyen_sinh hs = new Tuyen_sinh();
        hs.nhap();
        hs.in_kq();
    }
}