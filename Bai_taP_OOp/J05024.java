import java.util.*;
class SV{
    private String maSV;
    private String ten;
    private String lop;
    private String email;
    
    public SV(){
        maSV  = "";
        ten = "";
        lop = "";
        email = "";
    }
    public String getNganhHoc() {
        if (maSV.contains("DCKT")) {
            return "KE TOAN";
        }
        
        if (maSV.contains("DCCN")) {
            if (!lop.startsWith("E")) {
                return "CONG NGHE THONG TIN";
            }
        }
        
        if (maSV.contains("DCAT")) {
            if (!lop.startsWith("E")) {
                return "AN TOAN THONG TIN";
            }
        }
        
        if (maSV.contains("DCVT")) {
            return "VIEN THONG";
        }
        
        if (maSV.contains("DCDT")) {
            return "DIEN TU";
        }
        return "Không xác định hoặc Hệ chất lượng cao (Lớp E)"; 
    }
    public void nhap(Scanner sc){
        maSV = sc.nextLine().trim();
        ten = sc.nextLine().trim();
        lop = sc.nextLine().trim();
        email = sc.nextLine().trim();
    }   
    @Override
    public String toString(){
        return maSV + " " + ten + " " + lop + " " + email;
    }
}
public class J05024{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<SV> ds = new ArrayList<>();
        for(int i=0;i<n;i++){
            SV sv = new SV();
            sv.nhap(sc);
            ds.add(sv);
        }
        int q = Integer.parseInt(sc.nextLine().trim());
        while(q-->0){
            String nganh = sc.nextLine().trim();
            System.out.println("DANH SACH SINH VIEN NGANH " + nganh.toUpperCase() +":");
            for (SV sv : ds){
                if (nganh.equalsIgnoreCase(sv.getNganhHoc())){
                    System.out.println(sv);
                }
            }
        }
        sc.close();
    }
}