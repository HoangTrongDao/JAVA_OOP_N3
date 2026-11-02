import java.util.*;
class SV{
    private String ma;
    private String ten;
    private String lop;
    private String email;
    public SV(){
        ma="";
        ten="";
        lop="";
        email="";
    }
    public String getLop(){
        return lop;
    }
    public int getKhoaHoc() {
        return 2000 + Integer.parseInt(lop.substring(1, 3));
    }
    public void nhap(Scanner sc){
        ma= sc.nextLine().trim();
        ten=sc.nextLine().trim();
        lop=sc.nextLine().trim();
        email=sc.nextLine().trim();
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + email;
    }
}
public class J05023{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<SV> ds = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=n;i++){

            SV sv = new SV();
            sv.nhap(sc);
            ds.add(sv);
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            int nam = Integer.parseInt(sc.nextLine());      
            System.out.println("DANH SACH SINH VIEN KHOA " + nam + ":");
            for(SV sv:ds){
                if(sv.getKhoaHoc()==nam){
                    System.out.println(sv);
                }
            }
        }
        sc.close();
    }
}