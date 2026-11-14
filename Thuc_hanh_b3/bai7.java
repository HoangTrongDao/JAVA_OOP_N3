
import java.util.*;

class SV {
    private static int id = 1;

    private String ma;
    private String ten;
    private String date;
    private String lop;
    private float gpa;

    public SV() {
        ma = "B20DCCN" + String.format("%03d", id++);
        ten = "";
        date = "";
        lop = "";
        gpa = 0;
    }

    // Chuan hoa ngay sinh: dd/MM/yyyy
   public static String chuanDate(String date) {
    if (date == null || date.trim().isEmpty()) {
        return "";
    }

    String[] p = date.trim().split("/");

    if (p.length != 3) {
        return date;
    }

    int ngay = Integer.parseInt(p[0].trim());
    int thang = Integer.parseInt(p[1].trim());
    int nam = Integer.parseInt(p[2].trim());

    return String.format("%02d/%02d/%04d", ngay, thang, nam);
}

    // Chuan hoa ho ten
    public static String chuanTen(String ten) {
        if (ten == null || ten.trim().isEmpty()) {
            return "";
        }

        String[] words = ten.trim().toLowerCase().split("\\s+");

        StringBuilder kq = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                char x = Character.toUpperCase(word.charAt(0));
                String tu = word.substring(1);

                kq.append(x).append(tu).append(" ");
            }
        }

        return kq.toString().trim();
    }

    public Float getGPA() {
        return gpa;
    }

    // Nhap thong tin sinh vien
    public void nhap(Scanner sc) {
        ten = chuanTen(sc.nextLine().trim());
        date = chuanDate(sc.nextLine().trim());
        lop = sc.nextLine().trim();
        gpa = Float.parseFloat(sc.nextLine().trim());
    }

    @Override
public String toString() {
    return ma + " "
            + chuanTen(ten) + " "
            + lop + " "
            + chuanDate(date) + " "
            + String.format("%.2f", gpa);
}
}

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());

        ArrayList<SV> ds = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            SV sv = new SV();
            sv.nhap(sc);
            ds.add(sv);
        }

        // Sap xep GPA giam dan
        ds.sort((a, b) -> Float.compare(b.getGPA(), a.getGPA()));

        // In danh sach
        for (SV s : ds) {
            System.out.println(s);
        }

        sc.close();
    }
}
