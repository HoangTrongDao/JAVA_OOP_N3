import java.util.*;
class VDV{
    private static int stt=1;
    private String id;
    private String ten;
    private String date;
    private String xuatphat;
    private String dendich;
    private int hang;

    public VDV(){
        id = "VDV" + String.format("%02d",stt++);
        ten = "";
        date = "";
        xuatphat = "";
        dendich = "";
    }
    
    public String chuanhoa(String s){
        String[] p = s.trim().split("/");
        int n = Integer.parseInt(p[0].trim());
        int t = Integer.parseInt(p[1].trim());
        int y = Integer.parseInt(p[2].trim());
        return String.format("%02d/%02d/%04d",n,t,y);
    }

    public int chuanhoatg(String s){
        String[] p = s.trim().split(":");
        int g = Integer.parseInt(p[0].trim());
        int ph = Integer.parseInt(p[1].trim());
        int gi = Integer.parseInt(p[2].trim());
        return g*3600 + ph*60 + gi;
    }
    public String formatTg(int tongGiay) {
        int g = tongGiay / 3600;
        int ph = (tongGiay % 3600) / 60;
        int gi = tongGiay % 60;
        return String.format("%02d:%02d:%02d", g, ph, gi);
    }

    public void setHang(int hang) {
        this.hang = hang;
    }
    public int getHang() {
        return hang;
    }

    public int tuoi() {
        String[] p = this.date.trim().split("/");
        int nam = Integer.parseInt(p[2].trim());
        int t = 2021 - nam;
        if (t < 18) {
            return 0;
        } else if (t < 25) {
            return 1;
        } else if (t < 32) {
            return 2;
        } else {
            return 3;
        }
    }

    public int thanhtich() {
        return chuanhoatg(dendich) - chuanhoatg(xuatphat);
    }
    public int ttxh(){
        return thanhtich() - tuoi();
    }

    public void nhap(Scanner sc){
        ten = sc.nextLine().trim();
        date = chuanhoa(sc.nextLine().trim());
        xuatphat = sc.nextLine().trim();
        dendich = sc.nextLine().trim();
    }

    @Override
    public String toString(){
        return id + " " + ten + " " + formatTg(thanhtich()) + " " + formatTg(tuoi()) + " " + formatTg(ttxh()) + " " + hang;
    }
}
public class J05055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<VDV> ds = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            VDV hs = new VDV();
            hs.nhap(sc);
            ds.add(hs);
        }

        ArrayList<VDV> sorted = new ArrayList<>(ds);
        sorted.sort((a, b) -> Integer.compare(a.ttxh(), b.ttxh()));
        for (int i = 0; i < sorted.size(); i++) {
            if (i == 0) {
                sorted.get(i).setHang(1);
            } else if (sorted.get(i).ttxh() == sorted.get(i - 1).ttxh()) {
                sorted.get(i).setHang(sorted.get(i - 1).getHang());
            } else {
                sorted.get(i).setHang(i + 1);
            }
        }
        for (VDV hs : ds) {
            System.out.println(hs);
        }
    }
}