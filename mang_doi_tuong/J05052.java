import java.util.*;
class DH{
    private String ten;
    private String ma;
    private long dongia;
    private long sl;

    public String getStt() {
        return ma.substring(1, 4);
    }
    public String getMa(){
        return ma;
    }
    public long giamgia(){
        char x = ma.charAt(ma.length()-1);
        if (x == '1') {
            return Math.round((long) dongia * sl * 50 / 100.0);
        } else {
            return Math.round((long) dongia * sl * 30 / 100.0);
        }
    }
    public long thanhtien() {
        return dongia * sl - giamgia();
    }

    public void nhap(Scanner sc){
        ten = sc.nextLine().trim();
        ma = sc.nextLine().trim();
        dongia = Long.parseLong(sc.nextLine().trim());
        sl = Long.parseLong(sc.nextLine().trim());
    }
    @Override
    public String toString() {
        return ten + " " + ma + " " + getStt() + " " + giamgia() + " " + thanhtien();
    }
}
public class J05052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DH> ds = new ArrayList<>();
        
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            DH dh = new DH();
            dh.nhap(sc);
            ds.add(dh);
        }
        ds.sort((a,b)-> a.getStt().compareTo(b.getStt()));
        for (DH dh : ds) {
            System.out.println(dh);
        }
        sc.close();
    }
}