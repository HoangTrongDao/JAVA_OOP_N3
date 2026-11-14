import java.util.*;
class TC{
    private String ma;
    private static int stt =1;
    private String ten;
    private long luong;
    private long ngay;
    private String chucvu;

    public TC(){
        ma = "NV" + String.format("%02d",stt++);
        ten = "";
        luong =0;
        ngay =0;
        chucvu="";
    }
    public long luongthang(){
        return ngay * luong;
    }
    public long thuong(){
        if(ngay>=25){
            return luongthang() *20/100;
        }
        else if (ngay>=22){
            return luongthang() *10/100;
        }
        else{
            return 0;
        }
    }
    public long phucap() {
        if ("PGD".equalsIgnoreCase(chucvu) || "PGĐ".equalsIgnoreCase(chucvu)) {
            return 200000;
        } else if ("GD".equalsIgnoreCase(chucvu)) {
            return 250000;
        } else if ("TP".equalsIgnoreCase(chucvu)) {
            return 180000;
        } else if ("NV".equalsIgnoreCase(chucvu)) {
            return 150000;
        } else {
            return 0;
        }
    }

    public long tong() {
        return luongthang() + thuong() + phucap();
    }
    public void nhap(Scanner sc) {
        ten = sc.nextLine().trim();
        luong = Long.parseLong(sc.nextLine().trim());
        ngay = Long.parseLong(sc.nextLine().trim());
        chucvu = sc.nextLine().trim();
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + luongthang() + " " + thuong() + " " + phucap() + " " + tong();
    }
}
public class J05040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<TC> ds = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            TC ct = new TC();
            ct.nhap(sc);
            ds.add(ct);
        }
        ds.sort((a,b)-> Long.compare(b.tong(),a.tong()));
        for (TC s : ds) {
            System.out.println(s);
           
        }
        
        sc.close();
    }
}