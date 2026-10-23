import java.util.*;

class Lop_nv {
    private String mnv, ht, gt, date, dc, mst, datetime;

    public Lop_nv(String ht, String gt, String date, String dc, String mst, String datetime) {
        this.mnv = "00001";
        this.ht = ht;
        this.gt = gt;
        this.date = chuanhoa(date);
        this.dc = dc;
        this.mst = mst;
        this.datetime = chuanhoa(datetime);
    }

    private String chuanhoa(String ngay) {
       
        StringBuilder sb = new StringBuilder(ngay.trim());
        if (sb.charAt(1) == '/') {
            sb.insert(0, '0');
        }
        if (sb.charAt(4) == '/') {
            sb.insert(3, '0');
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return mnv + " " + ht + " " + gt + " " + date + " " + dc + " " + mst + " " + datetime;
    }
}

public class J04007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String ht = sc.nextLine();
        String gt = sc.nextLine();
        String date = sc.nextLine();
        String dc = sc.nextLine();
        String mst = sc.nextLine();
        String datetime = sc.nextLine();
        
        Lop_nv nvv = new Lop_nv(ht, gt, date, dc, mst, datetime);
        System.out.println(nvv);
        sc.close();
    }
}
