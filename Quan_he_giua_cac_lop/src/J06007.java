
import java.util.*;

class Truong {
    private String monhoc;
    private String mamon;

    public Truong(String monhoc, String mamon) {
        this.monhoc = monhoc;
        this.mamon = mamon;
    }

    public String getMa() {
        return mamon;
    }

    public String getMon() {
        return monhoc;
    }

    public static Truong nhap(Scanner sc) {
        String[] p = sc.nextLine().trim().split("\\s+", 2);

        String mamon = p[0];
        String monhoc = p[1];

        return new Truong(monhoc, mamon);
    }
}

class GV {
    private String ten;
    private String ma;

    public GV(String ten, String ma) {
        this.ten = ten;
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public String getMa() {
        return ma;
    }

    public static GV nhap(Scanner sc) {
        String[] p = sc.nextLine().trim().split("\\s+", 2);

        String ma = p[0];
        String ten = p[1];

        return new GV(ten, ma);
    }
}

class HP {
    private Truong monHoc;
    private GV gv;
    private double gio;

    public HP(String maGV, String maMH,
              Map<String, Truong> bangMH,
              Map<String, GV> bangGV,
              double soGio) {

        this.monHoc = bangMH.get(maMH);
        this.gv = bangGV.get(maGV);
        this.gio = soGio;
    }

    public static HP nhap(Scanner sc,
                          Map<String, Truong> bangMH,
                          Map<String, GV> bangGV) {

        String[] p = sc.nextLine().trim().split("\\s+");

        String maGV = p[0];
        String maMH = p[1];
        double gio = Double.parseDouble(p[2]);

        return new HP(maGV, maMH, bangMH, bangGV, gio);
    }

    public String getMaGV() {
        return gv.getMa();
    }

    public String getTenGV() {
        return gv.getTen();
    }

    public String getTenMH() {
        return monHoc.getMon();
    }

    public double getSoGio() {
        return gio;
    }
}

public class J06007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhap danh sach mon hoc
        int n = Integer.parseInt(sc.nextLine());

        Map<String, Truong> bangMH = new HashMap<>();

        for (int i = 0; i < n; i++) {
            Truong mh = Truong.nhap(sc);
            bangMH.put(mh.getMa(), mh);
        }

        // Nhap danh sach giang vien
        int m = Integer.parseInt(sc.nextLine());

        Map<String, GV> bangGV = new LinkedHashMap<>();

        for (int i = 0; i < m; i++) {
            GV gv = GV.nhap(sc);
            bangGV.put(gv.getMa(), gv);
        }

        // Khoi tao tong gio chuan
        Map<String, Double> tongGio = new LinkedHashMap<>();

        for (String maGV : bangGV.keySet()) {
            tongGio.put(maGV, 0.0);
        }

        // Nhap danh sach lop hoc phan
        int k = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < k; i++) {
            HP hp = HP.nhap(sc, bangMH, bangGV);

            String maGV = hp.getMaGV();

            tongGio.put(
                maGV,
                tongGio.get(maGV) + hp.getSoGio()
            );
        }

        // In ket qua
        for (String maGV : bangGV.keySet()) {
            GV gv = bangGV.get(maGV);

            System.out.printf(
                "%s %.2f%n",
                gv.getTen(),
                tongGio.get(maGV)
            );
        }

        sc.close();
    }
}
