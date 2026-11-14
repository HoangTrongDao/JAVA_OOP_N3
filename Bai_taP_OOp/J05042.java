import java.util.*;
class TT{
    private String ten;
    private int sobai;
    private int tsub;

    public TT(){
        ten = "";
        sobai=0;
        tsub=0;
    }
    public String getTen(){
        return ten;
    }
    public int getBai(){
        return sobai;
    }
    public int getT(){
        return tsub;
    }
    // Phương thức chuẩn hóa tên
    private String chuanHoaTen(String s) {
        String[] words = s.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            if (!w.isEmpty()) {
                sb.append(Character.toUpperCase(w.charAt(0)))
                  .append(w.substring(1))
                  .append(" ");
            }
        }
        return sb.toString().trim();
    }
    public void nhap(Scanner sc){
        ten = chuanHoaTen(sc.nextLine().trim());
        sobai = sc.nextInt();
        tsub = Integer.parseInt(sc.nextLine().trim());
    }
    @Override
    public String toString(){
        return ten + " " + sobai + " " + tsub; 
        
    }
}
public class J05042{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<TT> ds = new ArrayList<>();
        for(int i=0;i<n;i++){
            TT sv = new TT();
            sv.nhap(sc);
            ds.add(sv);
        }
        ds.sort((a,b)->{
            if(a.getBai()!=b.getBai()){
                return Integer.compare(b.getBai(),a.getBai());
            }
            if(a.getT()!=b.getT()){
                return Integer.compare(a.getT(),b.getT());
            }
            return a.getTen().compareTo(b.getTen());
        });
        for(TT sv : ds){
            System.out.println(sv);
        }
        sc.close();
    }
}
