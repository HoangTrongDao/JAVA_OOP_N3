import java.util.*;
class TT{
    private String ma;
    private String ten;
    private int sl;
    private long dongia;
    private long chietkhau;

    public TT(){
        ma = "";
        ten = "";
        sl = 0;
        dongia = 0;
        chietkhau = 0;
    }

    public long tong(){
        return dongia * sl - chietkhau;
    }
    public void nhap(Scanner sc){
        ma = sc.nextLine().trim();
        ten = sc.nextLine().trim();
        sl = Integer.parseInt(sc.nextLine().trim());
        dongia = Long.parseLong(sc.nextLine().trim());
        chietkhau = Long.parseLong(sc.nextLine().trim());
    }
    @Override
    public String toString()
    {
        return ma + " " + ten + " " + sl + " " + dongia + " " + chietkhau + " " +  tong();
    }
}
public class J05012{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<TT> ds = new ArrayList<>();
        for(int i=0;i<n;i++){
            TT mh = new TT();
            mh.nhap(sc);
            ds.add(mh);
        }
        ds.sort((a,b)->Long.compare(b.tong(),a.tong()));
        for(TT s:ds){
            System.out.println(s);
        }
        sc.close();
    }
}