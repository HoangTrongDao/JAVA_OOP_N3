import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

class KS{
    private static int stt = 1;
    private String ma;
    private String ten;
    private int sophong;
    private String ngaynhan;
    private String ngaytra;
    private int dv;

    public KS(){
        ma = "KH"+String.format("%02d",stt++);
        ten = "";
        sophong =0;
        ngaynhan = "";
        ngaytra = "";
        dv = 0;
    }
    public String chuanhoadate(String s){
        String[] p = s.trim().split("/");
        int d = Integer.parseInt(p[0].trim());
        int n = Integer.parseInt(p[1].trim());
        int y = Integer.parseInt(p[2].trim());
        return String.format("%02d/%02d/%04d",d,n,y);
    }
    public int dongia() {
        int tang = sophong / 100;
        if (tang == 1) return 25;
        if (tang == 2) return 34;
        if (tang == 3) return 50;
        return 80;
    }
    public long songayo() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d1 = LocalDate.parse(ngaynhan, fmt);
        LocalDate d2 = LocalDate.parse(ngaytra, fmt);
        return ChronoUnit.DAYS.between(d1, d2) + 1; 
    }
    public long tongtien(){
        return songayo() * dongia() + dv;
    }
    public void nhap(Scanner sc){
        ten = sc.nextLine().trim();
        sophong = Integer.parseInt(sc.nextLine().trim());
        ngaynhan = chuanhoadate(sc.nextLine().trim());
        ngaytra = chuanhoadate(sc.nextLine().trim());
        dv = Integer.parseInt(sc.nextLine().trim());
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + sophong + " " + songayo()+ " " + tongtien();
    }
}
public class J05016{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        ArrayList<KS>  ds = new ArrayList();
        int n = Integer.parseInt(sc.nextLine().trim());
        for(int i=0;i<n;i++){
            KS nv = new KS();
            nv.nhap(sc);
            ds.add(nv);
        }
        ds.sort((a,b)-> Long.compare(b.tongtien(),a.tongtien()));
        for(KS nv : ds){
            System.out.println(nv);
        }
        sc.close();
    }
}