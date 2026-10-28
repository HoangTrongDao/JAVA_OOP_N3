
import java.util.*;

class TK {
    private int ma;
    private String ten;
    private String date;
    private float t, l, h;

    public TK() {
        ma = 0;
        ten = "";
        date = "";
        t = l = h = 0;
    }

    public int getMa() {
        return ma;
    }

    public float tong() {
        return t + l + h;
    }

    public void nhap(int id, Scanner sc) {
        ma = id;
        ten = sc.nextLine();
        date = sc.nextLine();
        t = Float.parseFloat(sc.nextLine().trim());
        l = Float.parseFloat(sc.nextLine().trim());
        h = Float.parseFloat(sc.nextLine().trim());
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + date + " "
                + String.format(Locale.US, "%.1f", tong());
    }
}

public class J05009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        ArrayList<TK> ds = new ArrayList<>();
        float max = -1;

        for (int i = 1; i <= n; i++) {
            TK sv = new TK();
            sv.nhap(i, sc);
            ds.add(sv);

            if (sv.tong() > max) {
                max = sv.tong();
            }
        }

        ds.sort((a, b) -> Integer.compare(a.getMa(), b.getMa()));

        for (TK sv : ds) {
            if (Float.compare(sv.tong(), max) == 0) {
                System.out.println(sv);
            }
        }

        sc.close();
    }
}
