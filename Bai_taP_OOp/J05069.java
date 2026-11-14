import java.util.*;
class BD{
    private String ma;
    private String ten;
    private long gia;


    public BD(){
        ma = "";
        ten = "";
        gia = 0;

    }
    public void nhap(Scanner sc){
        ma = sc.nextLine().trim();
        ten = sc.nextLine().trim();
        gia = Long.parseLong(sc.nextLine().trim());
    }
    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public long getGia() {
        return gia;
    }
}
public class J05069
{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<BD> ds = new ArrayList<>();
        for(int i=0;i<n;i++){
            BD a = new BD();
            a.nhap(sc);
            ds.add(a);
        }
        int q = Integer.parseInt(sc.nextLine().trim());
        while(q-->0){
            String[] p = sc.nextLine().trim().split("\\s+");
            String m1 = p[0];
            long ss = Long.parseLong(p[1]);
            String maclb = m1.substring(1,3);
            for(BD a:ds){
                if(a.getMa().equals(maclb)){
                    long doanhthu = a.getGia()*ss;
                    System.out.println(m1+" "+a.getTen()+" "+doanhthu);
                }
            }
        }
    }
}