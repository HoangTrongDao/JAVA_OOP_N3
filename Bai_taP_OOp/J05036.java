import java.util.*;
class TH{
    private String ten;
    private String donvi;
    private int sl;
    private long dongia;
    private String ma;
    private static int stt=1;
    public TH(){
        ma = "MH"+String.format("%02d",stt++);
        ten = "";
        donvi ="";
        sl =0;
        dongia=0;
    }
    public long vanchuyen(){
        long phi = Math.round((dongia*sl)*0.05);
        return phi;
    }
    public long thanhtien(){
        long tong = Math.round(dongia * sl + vanchuyen());
        return tong;
    }
    public long gia(){
        long gia_ban = Math.round(thanhtien() + 0.02 * thanhtien());
        return gia_ban;
    }
    public void nhap(Scanner sc){
        ten = sc.nextLine().trim();
        donvi = sc.nextLine().trim();
        dongia = Long.parseLong(sc.nextLine().trim());
        sl = Integer.parseInt(sc.nextLine().trim());
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + donvi + " " + vanchuyen() + " " + thanhtien() + " " + gia();
    }

}
public class J05036{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<TH> ds = new ArrayList<>();
        for(int i=0;i<n;i++){
            TH mh = new TH();
            mh.nhap(sc);
            ds.add(mh);
        }
        for(TH s :ds){
            System.out.println(s);
        }
        sc.close();
    }
}