import java.util.*;
class TP1 {
    private String ma;
    private String ten;
    private String lop;
    private float t, l, h;
    public String getMa() {
        return ma;
    }
    public void nhap(Scanner sc) {
        ma = sc.nextLine().trim();
        ten = sc.nextLine().trim();
        lop = sc.nextLine().trim();

        t = Float.parseFloat(sc.nextLine().trim());
        l = Float.parseFloat(sc.nextLine().trim());
        h = Float.parseFloat(sc.nextLine().trim());
       
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " "
                + String.format("%.1f %.1f %.1f", t, l, h);
    }
}
public class J05030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<TP1> ds = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            TP1 hs = new TP1();
            hs.nhap(sc);
            ds.add(hs);
        }

        ds.sort((a, b) -> a.getMa().compareTo(b.getMa()));

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + " " + ds.get(i));
        }

        sc.close();
    }
}
