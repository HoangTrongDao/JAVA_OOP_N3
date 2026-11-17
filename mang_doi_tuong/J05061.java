import java.util.*;
class PH{
    private String ma;
    private static int stt = 1;
    private String ten;
    private String date;
    private double lt;
    private double th;
    private int tuoi;
    public PH(){
        ma = "PH" + String.format("%02d",stt++);
        ten = "";
        date = "";
        lt = 0;
        th = 0;

    }
    public double dtb(){
        return Math.round((lt+th)/2.0);
    }
    public double thuong(){
        if(lt>=8 && th>=8){
            return 1.0;
        }
        else if(lt>=7.5 && th>=7.5){
            return 0.5;
        }
        return 0;
    }
    public int tong() {
        int res = (int) Math.round((lt + th) / 2.0 + thuong());
        return Math.min(res, 10);
    }
    public String getM(){
        return ma;
    }
    public String xl() {
        int d = tong();
        if (d < 5) {
            return "Truot";
        } else if (d <= 6) {
            return "Trung binh";
        } else if (d == 7) {
            return "Kha";
        } else if (d == 8) {
            return "Gioi";
        } else {
            return "Xuat sac";
        }
    }
    public int tuoi(){
        int nam = Integer.parseInt(date.substring(6));
        return 2021-nam;
    }
    public void nhap(Scanner sc){
        ten = sc.nextLine().trim();
        date = sc.nextLine().trim();
        lt = Double.parseDouble(sc.nextLine().trim());
        th = Double.parseDouble(sc.nextLine().trim());
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + tuoi() + " " + tong() + " " +xl();
    }
}

public class J05061{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<PH> ds = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine().trim());
        for(int i=0;i<n;i++){
            PH hs = new PH();
            hs.nhap(sc);
            ds.add(hs);
        }
        ds.sort((a,b)->{
            if(a.tong()!=b.tong()){
                return Double.compare(b.tong(),a.tong());
            }
            return a.getM().compareTo(b.getM());
        });
        for(PH a : ds){
            System.out.println(a);
        }
        sc.close();
    }
}