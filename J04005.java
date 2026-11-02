import java.util.*;
class TS{
    private String ten;
    private String date;
    private float t,l,h;
    public TS(){
        ten="";
        date="";
        t=0;l=0;h=0;
    }
    public float tong(){
        return t + l + h;
    }
    public void chuanhoa(){
        String[] d = date.split("/");
        if (d[0].length() == 1) d[0] = "0" + d[0];
        if (d[1].length() == 1) d[1] = "0" + d[1];
        date = d[0] + "/" + d[1] + "/" + d[2];
    }
    public void nhap(Scanner sc){
        ten = sc.nextLine().trim();
        date = sc.nextLine().trim();
        t = Float.parseFloat(sc.nextLine().trim());
        l = Float.parseFloat(sc.nextLine().trim());
        h = Float.parseFloat(sc.nextLine().trim());
        chuanhoa();
    }
    @Override
    public String toString(){
        return ten + " " + date +" "+String.format("%.1f",tong());
    }
}
public class J04005{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        TS ts = new TS();
        while(sc.hasNextLine()){
            ts.nhap(sc);
            System.out.println(ts);
        }   
        sc.close();
    }
}