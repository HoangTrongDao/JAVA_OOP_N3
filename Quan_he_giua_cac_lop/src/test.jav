import java.util.*;

// ══════════════════════════════════════
// LỚP 1: Độc lập — không tra bảng nào
// ══════════════════════════════════════
class MonHoc {
    private String ma;
    private String ten;

    public MonHoc(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }
    public String getMa()  { return ma; }
    public String getTen() { return ten; }

    public static MonHoc nhap(Scanner sc) {
        String ma  = sc.nextLine().trim();
        String ten = sc.nextLine().trim();
        return new MonHoc(ma, ten);
    }
}

// ══════════════════════════════════════
// LỚP 2: Độc lập — không tra bảng nào
// ══════════════════════════════════════
class GiangVien {
    private String ma;
    private String ten;

    public GiangVien(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }
    public String getMa()  { return ma; }
    public String getTen() { return ten; }

    public static GiangVien nhap(Scanner sc) {
        String ma  = sc.nextLine().trim();
        String ten = sc.nextLine().trim();
        return new GiangVien(ma, ten);
    }
}

// ══════════════════════════════════════════════════════
// LỚP 3: Phụ thuộc — tra CẢ HAI bảng MonHoc + GiangVien
// ══════════════════════════════════════════════════════
class PhanCong {
    private MonHoc    monHoc;      // ★ Association 1
    private GiangVien giangVien;   // ★ Association 2
    private int       soGioChuẩn;

    public PhanCong(String maMH, String maGV,
                    Map<String, MonHoc>    bangMH,
                    Map<String, GiangVien> bangGV,
                    int soGio) {
        this.monHoc     = bangMH.get(maMH);   // tra bảng 1
        this.giangVien  = bangGV.get(maGV);   // tra bảng 2
        this.soGioChuẩn = soGio;
    }

    public static PhanCong nhap(Scanner sc,
                                Map<String, MonHoc>    bangMH,
                                Map<String, GiangVien> bangGV) {
        String[] p  = sc.nextLine().trim().split("\\s+");
        String maMH = p[0];
        String maGV = p[1];
        int    soGio = Integer.parseInt(p[2]);
        return new PhanCong(maMH, maGV, bangMH, bangGV, soGio);
    }

    // Getter để tính tổng giờ theo giảng viên
    public String       getMaGV()       { return giangVien.getMa(); }
    public String       getTenGV()      { return giangVien.getTen(); }
    public String       getTenMH()      { return monHoc.getTen(); }
    public int          getSoGio()      { return soGioChuẩn; }
}

// ══════════════════════════════════════
// MAIN
// ══════════════════════════════════════
public class BaiGV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- Đọc môn học ---
        int n = Integer.parseInt(sc.nextLine().trim());
        Map<String, MonHoc> bangMH = new HashMap<>();
        for (int i = 0; i < n; i++) {
            MonHoc mh = MonHoc.nhap(sc);
            bangMH.put(mh.getMa(), mh);
        }

        // --- Đọc giảng viên ---
        int m = Integer.parseInt(sc.nextLine().trim());
        Map<String, GiangVien> bangGV = new HashMap<>();
        for (int i = 0; i < m; i++) {
            GiangVien gv = GiangVien.nhap(sc);
            bangGV.put(gv.getMa(), gv);
        }

        // --- Đọc phân công ---
        int q = Integer.parseInt(sc.nextLine().trim());
        List<PhanCong> dsPhanCong = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            dsPhanCong.add(PhanCong.nhap(sc, bangMH, bangGV));
        }

        // --- Tính tổng giờ theo từng giảng viên ---
        // key = maGV, value = tổng giờ
        Map<String, Integer> tongGio = new LinkedHashMap<>();
        Map<String, String>  tenGV   = new LinkedHashMap<>();

        for (PhanCong pc : dsPhanCong) {
            String ma = pc.getMaGV();
            tongGio.merge(ma, pc.getSoGio(), Integer::sum);
            tenGV.put(ma, pc.getTenGV());
        }

        // --- In kết quả ---
        StringBuilder sb = new StringBuilder();
        for (String ma : tongGio.keySet()) {
            sb.append(ma).append(' ')
              .append(tenGV.get(ma)).append(' ')
              .append(tongGio.get(ma)).append('\n');
        }
        System.out.print(sb);
    }
}