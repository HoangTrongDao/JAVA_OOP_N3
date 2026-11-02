import java.util.*;

class MH1 {
    private String ma;
    private String ten;
    private String dv;
    private long a; 
    private long b; 

    public MH1() {
        ma = "";
        ten = "";
        dv = "";
        a = 0;
        b = 0;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getDv() {
        return dv;
    }
    public long Tong() {
        long c = b - a;
        return c;
    }

    public void nhap(Scanner sc, int id) {
        ma = String.format("MH%03d", id);
        ten = sc.nextLine().trim();
        dv = sc.nextLine().trim();

        a = Long.parseLong(sc.nextLine().trim());
        b = Long.parseLong(sc.nextLine().trim());
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + dv + " " + a + " " + b + " " + Tong();
    }
}

public class J05081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<MH1> ds = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            MH1 x = new MH1();
            x.nhap(sc, i);
            ds.add(x);
        }
        
        ds.sort((a, b) -> {
            if (a.Tong() != b.Tong()) {
                return Long.compare(b.Tong(), a.Tong());
            }
            return a.getMa().compareTo(b.getMa());
        });
        
        for (MH1 x : ds) {
            System.out.println(x);
        }
        
        sc.close();
    }
}
