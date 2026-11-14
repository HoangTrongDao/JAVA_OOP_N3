import java.util.*;
class TH2{
    private String ten;
    private String donvi;
    private long dongia;
    private long sl;
    private String ma;
    private static int stt = 1;

    public TH2(){
        ma = "MH" + String.format("%02d",stt++);
        ten = "";
        donvi = "";
        dongia = 0;
        sl = 0;
    }
    public long vanchuyen(){
        return Math.round((dongia*sl) * 0.05);
    }
    public long thanhtien(){
        return Math.round(dongia * sl + vanchuyen());
    }
    public long gia(){
        double giaLe = (thanhtien() + 0.02 *thanhtien())/sl;
        return (long) Math.ceil(giaLe/100.0)*100;
    }
    public void nhap(Scanner sc){
        ten = sc.nextLine().trim();
        donvi = sc.nextLine().trim();
        dongia = Long.parseLong(sc.nextLine().trim());
        sl = Long.parseLong(sc.nextLine().trim());
    }
    @Override
    public String toString(){
        return ma+ " " + ten + " " + donvi + " " + vanchuyen() + " " +  thanhtien() + " " + gia();
    }
}
public class J05037{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<TH2> ds = new ArrayList<>();
        for(int i=0;i<n;i++){
            TH2 mh = new TH2();
            mh.nhap(sc);
            ds.add(mh);
        }
        ds.sort((a,b)->Long.compare(b.gia(),a.gia()));
        for(TH2 s : ds){
            System.out.println(s);
        }
        sc.close();
    }
}
