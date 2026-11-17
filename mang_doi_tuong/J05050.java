import java.util.*;
class TD{
    private static int stt=1;
    private String id;
    private String ma;
    private int cu;
    private int moi;
    public TD(){
        id = "KH"+String.format("%02d",stt++);
        ma = "";
        cu = 0;
        moi = 0;
    }
    public int heso() {
        if (ma.equals("KD")) {
            return 3;
        } else if (ma.equals("NN")) {
            return 5;
        } else if (ma.equals("TT")) {
            return 4;
        } else if (ma.equals("CN")) {
            return 2;
        } else {
            return 0;
        }
    }
    public long thanhtien() {
        return (moi - cu) * heso() * 550L;
    }

    public long phutroi() {
        int res = moi - cu;
        if (res < 50) {
            return 0;
        } else if (res <= 100) {
            return Math.round(thanhtien() * 35 / 100.0);
        } else {
            return thanhtien();
        }
    }
    public long tong(){
        return phutroi()+thanhtien();
    }
    public void nhap(Scanner sc){
        ma = sc.nextLine().trim();
        cu = Integer.parseInt(sc.nextLine().trim());
        moi = Integer.parseInt(sc.nextLine().trim());
    }
    @Override
    public String toString(){
        return id + " " + heso() + " " +thanhtien() + " "+ phutroi()+ " "+ tong();
    }
}
public class J05050{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        ArrayList<TD>  ds = new ArrayList();
        int n = Integer.parseInt(sc.nextLine().trim());
        for(int i=0;i<n;i++){
            TD nv = new TD();
            nv.nhap(sc);
            ds.add(nv);
        }
        ds.sort((a,b)->Long.compare(b.tong(),a.tong()));
        for(TD nv : ds){

                System.out.println(nv);
        }
        sc.close();
    }
}