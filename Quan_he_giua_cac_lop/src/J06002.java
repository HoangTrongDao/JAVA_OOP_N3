import java.util.*;
class HD1{
    private String ma;
    private String tensp;
    private long d1;
    private long d2;
    public HD1(String ma, String tensp, long d1, long d2){
        this.ma = ma;
        this.tensp = tensp;
        this.d1 = d1;
        this.d2 = d2;
    }
    public String getMa(){
        return ma;
    }
    public String getTen(){
        return tensp;
    }
    public long getGia(char loai){
        return loai == '1' ? d1:d2;
    }
    public static HD1 nhap(Scanner sc ){
        String ma = sc.nextLine().trim();
        String tensp = sc.nextLine().trim();
        long d1 = Long.parseLong(sc.nextLine().trim());
        long d2 = Long.parseLong(sc.nextLine().trim());
        return new HD1(ma,tensp,d1,d2);
    }
}
class HD2{
    public static int stt=1;
    private String mahoadon;
    private int sl;
    private char loai;
    private HD1 ds; 
    private long giam;
    private long tra;

    public HD2(String maGoc, int sl, Map<String, HD1> bangSp, int stt){
        String maloai = maGoc.substring(0,2);
        this.sl = sl;
        this.loai = maGoc.charAt(2);
        this.ds = bangSp.get(maloai);
        this.mahoadon = maGoc+ String.format("-%03d",stt);

        long gia    = ds.getGia(this.loai);
        long tien   = gia * sl;
        this.giam = tong(tien);
        this.tra = tien - this.giam;
    }
    public static HD2 nhap(Scanner sc, Map<String, HD1> bangSp,int stt){
        String[] p = sc.nextLine().trim().split("\\s+");
        String maGoc = p[0];
        int sl = Integer.parseInt(p[1]);
        return new HD2(maGoc,sl,bangSp,stt);
    }
    private long tong(long tong){
        if (sl>=150)    return tong *50/100;
        if (sl>=100)    return tong*30/100;
        if (sl>=50)     return tong*15/100;
        return 0L;
    }
    public long getPhaiTra() { return tra; }
    public void in_kq(StringBuilder sb){
        sb.append(mahoadon).append(' ')
            .append(ds.getTen()).append(' ')
            .append(giam).append(' ')
            .append(tra).append('\n');
    }
}
public class J06002{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.nextLine().trim());
        Map<String, HD1> bangSp = new HashMap<>();
        for (int i = 0; i < t; i++) {
            HD1 hd = HD1.nhap(sc);                        
            bangSp.put(hd.getMa(), hd);
        }
        int q = Integer.parseInt(sc.nextLine().trim());
        ArrayList<HD2> ds = new ArrayList<>();        
        for (int stt = 1; stt <= q; stt++) {
            ds.add(HD2.nhap(sc, bangSp, stt));          
        }
         ds.sort((a, b) -> Long.compare(b.getPhaiTra(), a.getPhaiTra()));
        StringBuilder sb = new StringBuilder();
        for (HD2 hd2 : ds) hd2.in_kq(sb);
        System.out.print(sb);
    }
}
