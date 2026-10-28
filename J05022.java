import java.util.*;
class SV{
    private String ma;
    private String ten;
    private String lop;
    private String email;
    public String getLop(){
        return lop;
    }
    public void nhap(Scanner sc){
        ma = sc.nextLine().trim();
        ten = sc.nextLine().trim();
        lop = sc.nextLine().trim();
        email =sc.nextLine().trim();
    }
    @Override
    public String toString(){
        return ma + " "+ ten + " "+lop + " "+email;
    }
}
public class J05022{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();
        ArrayList<SV> ds = new ArrayList<>();
        for(int i=1;i<=n;i++){
            SV sv = new SV();
            sv.nhap(sc);
            ds.add(sv);
        }
        int q = sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String lop = sc.nextLine().trim();
            System.out.println("DANH SACH SINH VIEN LOP "+lop+":");
            for (SV hs : ds) {
                if (hs.getLop().equals(lop)) {
                    System.out.println(hs);
                }
            }
        }
        sc.close();
    }
}