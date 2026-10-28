import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
class Nv{
    private String ma;
    private String ten;
    private String gt;
    private String date;
    private String dc;
    private String mst;
    private String hd;
    public Nv(){
        ma = "";
        ten = "";
        gt = "";
        date = "";
        dc = "";
        mst = "";
        hd = "";
    }
    public static String Sinh(int id) {
        return String.format("%05d", id);
    }
    public void Chuanhoa() {
        String[] d = date.split("/");

        if (d[0].length() == 1) d[0] = "0" + d[0];
        if (d[1].length() == 1) d[1] = "0" + d[1];

        date = d[0] + "/" + d[1] + "/" + d[2];

        String[] a = ten.trim().toLowerCase().split("\\s+");
        StringBuilder s = new StringBuilder();

        for (String x : a) {
            s.append(Character.toUpperCase(x.charAt(0)));
            s.append(x.substring(1)).append(" ");
        }

        ten = s.toString().trim();
    }
    public String getDate(){
        return date;
    }
     public void Nhap(int id,Scanner sc) {
        ma = Sinh(id);
        ten = sc.nextLine();
        gt = sc.nextLine();
        date = sc.nextLine();
        dc = sc.nextLine();
        mst = sc.nextLine();
        hd = sc.nextLine();
        Chuanhoa();
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + gt + " " + date + " " + dc + " " + mst + " " + hd;
    }

}
public class J05007{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<Nv> ds = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            Nv nv = new Nv();
            nv.Nhap(i, sc);
            ds.add(nv);
        }
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        ds.sort((a, b) -> LocalDate.parse(a.getDate(), f)
                .compareTo(LocalDate.parse(b.getDate(), f)));
        for (Nv nv1:ds){
            System.out.println(nv1);
        }
        sc.close();
    }
}
