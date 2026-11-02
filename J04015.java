import java.util.*;
class GV{
    private String ma;
    private String ten;
    private long luong;
    public GV(){
        ma="";
        ten="";
        luong=0;
    }
    public long getCV(){
        String chucVu= ma.substring(0,2);
        if (chucVu.equals("HT")) {
            return 2000000;
        } else if (chucVu.equals("HP")) {
            return 900000;
        } else {
            return 500000;
        }
    }

    public int getBac(){
        return Integer.parseInt(ma.substring(2,4));
    }
    public long thunhap(){
        return luong*getBac()+getCV();
    }
    public void nhap(Scanner sc){
        ma = sc.nextLine().trim();
        ten = sc.nextLine().trim();
        luong = Long.parseLong(sc.nextLine().trim());
        
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + getBac() + " " + getCV() +" "+thunhap();
    }
}
public class J04015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GV gv = new GV();
        gv.nhap(sc);
        System.out.println(gv);
        sc.close();
    }
}
