import java.util.*;
class HD{
    private String ma;
    private String ten;
    private long d1;
    private long d2;
    public HD(String ma, String ten, long d1, long d2) {
        this.ma = ma; this.ten = ten; this.d1 = d1; this.d2 = d2;
    }
    public String getMa() {
        return ma;
    }
    public String getTen() {
        return ten;
    }
    public long getGia(char loai){
        return loai =='1' ? d1:d2;
    }
    public static HD nhap(Scanner sc){
         String ma = sc.nextLine().trim();
         String ten = sc.nextLine().trim();
         long d1 = Long.parseLong(sc.nextLine().trim());
         long d2 = Long.parseLong(sc.nextLine().trim());
         return new HD(ma, ten, d1, d2);
    }
}
class HD2{
    private String mahoadon;
    private int soluong;
    private char loai;
    private HD hd;
    public HD2(String maGoc, int soluong, Map<String, HD> bangSp, int stt){
        String maloai    = maGoc .substring(0,2);
        this.loai = maGoc.charAt(2);
        this.soluong = soluong;
        this.hd = bangSp.get(maloai);
        this.mahoadon  = maGoc + String.format("-%03d",stt);
    }
    public static HD2 nhap(Scanner sc, Map<String, HD> bangSp, int stt) {
        String[] parts = sc.nextLine().trim().split("\\s+");
        String maGoc   = parts[0];
        int    soluong = Integer.parseInt(parts[1]); 
        return new HD2(maGoc, soluong, bangSp, stt);
    }
     private long tinhGiamGia(long thanhTien) {
        if (soluong >= 150) return thanhTien * 50 / 100;
        if (soluong >= 100) return thanhTien * 30 / 100;
        if (soluong >= 50)  return thanhTien * 15 / 100;
        return 0L;
    }   
    public void inKetQua(StringBuilder sb) {
        long donGia    = hd.getGia(loai);               
        long thanhTien = donGia * soluong;
        long giamGia   = tinhGiamGia(thanhTien);
        long phaiTra   = thanhTien - giamGia;

        sb.append(mahoadon).append(' ')
          .append(hd.getTen()).append(' ')  
          .append(giamGia).append(' ')
          .append(phaiTra).append('\n');
    }
 
}
public class J06001{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.nextLine().trim());
        Map<String, HD> bangSp = new HashMap<>();
        for (int i = 0; i < t; i++) {
            HD hd = HD.nhap(sc);                        
            bangSp.put(hd.getMa(), hd);
        }
        int q = Integer.parseInt(sc.nextLine().trim());
        ArrayList<HD2> ds = new ArrayList<>();        
        for (int stt = 1; stt <= q; stt++) {
            ds.add(HD2.nhap(sc, bangSp, stt));          
        }
        StringBuilder sb = new StringBuilder();
        for (HD2 hd2 : ds) hd2.inKetQua(sb);
        System.out.print(sb);
    }
}