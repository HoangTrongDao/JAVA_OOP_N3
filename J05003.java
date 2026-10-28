
import java.util.*;

class Sv1 {
    private String ma;
    private String hoten;
    private String lop;
    private String date;
    private double gpa;

    public Sv1() {
        ma = "";
        hoten = "";
        lop = "";
        date = "";
        gpa = 0;
    }

    public static String Sinh(int id) {
        return "B20DCCN" + String.format("%03d", id);
    }

    public void Chuanhoa() {
        String[] d = date.split("/");

        if (d[0].length() == 1) d[0] = "0" + d[0];
        if (d[1].length() == 1) d[1] = "0" + d[1];

        date = d[0] + "/" + d[1] + "/" + d[2];

        String[] a = hoten.trim().toLowerCase().split("\\s+");
        StringBuilder s = new StringBuilder();

        for (String x : a) {
            s.append(Character.toUpperCase(x.charAt(0)));
            s.append(x.substring(1)).append(" ");
        }

        hoten = s.toString().trim();
    }

    public void Nhap(int id, Scanner sc) {
        ma = Sinh(id);
        hoten = sc.nextLine();
        lop = sc.nextLine();
        date = sc.nextLine();
        gpa = Double.parseDouble(sc.nextLine().trim());

        Chuanhoa();
    }

    @Override
    public String toString() {
        return ma + " " + hoten + " " + lop + " " + date
                + " " + String.format("%.2f", gpa);
    }
}

public class J05003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());

        for (int i = 1; i <= n; i++) {
            Sv1 sv = new Sv1();
            sv.Nhap(i, sc);
            System.out.println(sv);
        }

        sc.close();
    }
}
