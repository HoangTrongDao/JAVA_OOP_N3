import java.util.*;
class CT{
    private static int stt =1;
    private String ten;
    private long luong;
    private long ngay;
    private String chucvu;
    private String ma;

    public CT(){
        ma = "NV" + String.format("%02d",stt++);
        ten = "";
        luong = 0;
        ngay = 0;
        chucvu = "";
    }

    public long luongthang(){
        return luong * ngay;
    }
    public long thuong() {
        if (ngay >= 25) {
            return luongthang() * 20 / 100; 
        } else if (ngay >= 22) {
            return luongthang() * 10 / 100;
        } else {
            return 0;
        }
    }
    public long phucap() {
        if ("PGD".equalsIgnoreCase(chucvu)) {
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
    public long tong(){
        return luongthang() + phucap() + thuong();
    }
    public void nhap(Scanner sc){
        ten = sc.nextLine().trim();
        luong = Long.parseLong(sc.nextLine().trim());
        ngay = Long.parseLong(sc.nextLine().trim());
        chucvu = sc.nextLine().trim();

    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + luongthang() + " " + thuong()  + " " + phucap()  + " " + tong();
    }
}
public class J05038{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<CT> ds = new ArrayList<>();
        for(int i=0;i<n;i++){
            CT ct = new CT();
            ct.nhap(sc);
            ds.add(ct);
        }
        long kq =0;
        for(CT s : ds){
            System.out.println(s);
            kq +=s.tong();
        }
        System.out.println("Tong chi phi tien luong: "+kq);
        sc.close();
    }
}