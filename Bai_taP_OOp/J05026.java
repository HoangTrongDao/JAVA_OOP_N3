import java.util.*;
class GV1{
    private String ma;
    private static int stt=1;
    private String bomon;
    private String gv;

    public GV1(){
        ma = "GV" + String.format("%02d",stt++);
        bomon = "";
        gv = "";
    }
    public String getGV(){
        return gv;
    }
    public String getNganh(){
        String[] tu = this.bomon.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String s:tu){
            if (!s.isEmpty()){
                sb.append(Character.toUpperCase(s.charAt(0)));
            }
        }
        return sb.toString();
    }
    public String getrutGon(){
        String[] tu = this.gv.trim().split("\\s+");
        return tu[tu.length-1];
    }
    public void nhap(Scanner sc){
        gv = sc.nextLine().trim();
        bomon = sc.nextLine().trim();
    }
    @Override
    public String toString(){
        return ma + " " + gv + " " + getNganh(); 
    }
}
public class J05026{
    public static String vietTatQuery(String s) {
        String[] tu = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String x : tu) {
            if (!x.isEmpty()) {
                sb.append(Character.toUpperCase(x.charAt(0)));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<GV1> ds = new ArrayList<>();
        for(int i=0;i<n;i++){
            GV1 tt = new GV1();
            tt.nhap(sc);
            ds.add(tt);
        }
        int q = Integer.parseInt(sc.nextLine().trim());
        while(q-->0){
            String kq = sc.nextLine().trim();
            String mon = vietTatQuery(kq);
            System.out.println("DANH SACH GIANG VIEN BO MON "+mon.toUpperCase()+":");
            for(GV1 s : ds){
                if(mon.equalsIgnoreCase(s.getNganh())){
                    System.out.println(s);
                }
            }
        }
        sc.close();
    }
}
