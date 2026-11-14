import java.util.*;

class GiangVien {
    private static int dem = 0;
    private String ma, ten, kk;
    private double hsl;
    private int gio;

    public GiangVien(Scanner in) {
        ten = in.nextLine().trim();
        hsl = Double.parseDouble(in.nextLine().trim());
        kk = in.nextLine().trim();
        gio = Integer.parseInt(in.nextLine().trim());
        dem++;
        ma = String.format("PM%03d", dem);
    }

    private double hsKK() {
        if (kk.equals("A")) return 1.5;
        if (kk.equals("B")) return 1.2;
        return 1;
    }

    public long luongLinh() {
        double l = hsl * hsKK() * 3000;
        double giam;
        if (gio >= 500) giam = 0;
        else if (gio <= 100) giam = 0.15;
        else if (gio <= 350) giam = 0.10;
        else giam = 0.05;
        return Math.round(l * (1 - giam));
    }

    // tên = từ cuối, họ = phần còn lại
    public String getTen() {
        String[] p = ten.split("\\s+");
        return p[p.length - 1];
    }