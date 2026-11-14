import java.util.*;
class TD{
    private static int id = 1;
    private String ma;
    private String ten;
    private float lt;
    private float th;
    public TD(){
        ma = "TS" + String.format("%02d",id++);
        ten = "";
        lt = 0;
        th = 0;
    }
    private float chuanhoa(float d){
        if(d>10){
            return d/10f;
        }
        return d;
    }
    public float diem(){
        float dlt = chuanhoa(this.lt);
        float dth = chuanhoa(this.th);
        return (dlt+ dth)/2;

    }
    public String xet(){
        float dtb = diem();
        if (dtb < 5) {
            return "TRUOT";
        } 
        else if (dtb < 8) {
            return "CAN NHAC";
        } 
        else if (dtb <= 9.5) { 
            return "DAT";
        } 
        else {
            return "XUAT SAC";
        }
    }
    public void nhap(Scanner sc){
        ten = sc.nextLine().trim();
        lt = Float.parseFloat(sc.nextLine().trim());
        th = Float.parseFloat(sc.nextLine().trim());
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + String.format("%.2f",diem()) + " " + xet();
    }
}
public class J05013{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<TD> ds = new ArrayList<>();
        for(int i=0;i<n;i++){
            TD  x = new TD();
            x.nhap(sc);
            ds.add(x);
        }
        ds.sort((a,b)->Float.compare(b.diem(),a.diem()));
        for(TD s:ds){
            System.out.println(s);
        }
        sc.close();
    }
}