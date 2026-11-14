import java.util.*;
class GV{
    private String ma;
    private static int stt=1;
    private String ten;
    private String gv;

    public GV(){
        ma = "GV" + String.format("%02d",stt++);
        ten = "";
        gv = "";
    }
    public String getGV(){
        return gv;
    }
    public String getNganh() {
        String[] tu = this.ten.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        
        for (String s : tu) {
            if (!s.isEmpty()) {
                sb.append(Character.toUpperCase(s.charAt(0)));
            }
        }
        return sb.toString(); 
    }
    public String getTenRutGọn() {
        String[] tu = this.gv.trim().split("\\s+");
        return tu[tu.length - 1]; // Lấy từ cuối cùng
    }
    public void nhap(Scanner sc){
        gv = sc.nextLine().trim();
        ten = sc.nextLine().trim();
    }
    public String getMa(){
        return ma;
    }
    @Override 
    public String toString(){
        return ma + " " + gv + " " + getNganh();
    }
}

public class J05025{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<GV> ds = new ArrayList<>();
        for(int i=0;i<n;i++){
            GV gv = new GV();
            gv.nhap(sc);
            ds.add(gv);
        }
        ds.sort((a, b) -> {
            int soSanhTen = a.getTenRutGọn().compareTo(b.getTenRutGọn());
            if (soSanhTen != 0) {
                return soSanhTen; 
            }
            return a.getMa().compareTo(b.getMa()); 
        });
        for (GV gv : ds){
            System.out.println(gv);
        }
        sc.close();
    }
}