import java.util.*;
class KH{
    private static int stt=1;
    private String ma;
    private String ten;
    private String gt;
    private String date;
    private String dc;
    
    public String chuanhoaten(String s){
        String[] a = s.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String x : a){
            if(!x.isEmpty()){
                sb.append(Character.toUpperCase(x.charAt(0)))
                    .append(x.substring(1))
                    .append(" ");
            }
        }
        return sb.toString().trim();
    }

    public String chuanhoadate(String s) {
        String[] p = s.trim().split("/");
        int d = Integer.parseInt(p[0].trim());
        int m = Integer.parseInt(p[1].trim());
        int y = Integer.parseInt(p[2].trim());
        return String.format("%02d/%02d/%04d", d, m, y);
    }
    public String getNgayChuanDeSort() {
        String[] p = date.split("/");
        return p[2] + "/" + p[1] + "/" + p[0];
    }

    public String getD(){
        return date;
    }
    public KH(){
        ma = "KH" + String.format("%03d",stt++);
        ten = "";
        gt = "";
        date = "";
        dc = "";
    }
    public void nhap(Scanner sc){
        ten =chuanhoaten(sc.nextLine().trim());
        gt = sc.nextLine().trim();
        date = chuanhoadate(sc.nextLine().trim());
        dc = sc.nextLine().trim();
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + gt + " " +dc + " "+date;
    }
}
public class J05082{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<KH> ds = new ArrayList<>();
        for(int i=0;i<n;i++){
            KH a = new KH();
            a.nhap(sc);
            ds.add(a);
        }
        ds.sort((a,b)-> a.getNgayChuanDeSort().compareTo(b.getNgayChuanDeSort()));
        for(KH a : ds){
            System.out.println(a);
        }
        sc.close();
    }
}