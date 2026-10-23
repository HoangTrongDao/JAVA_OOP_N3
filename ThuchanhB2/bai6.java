import java.util.*;
class C_ty{
    private String ma;
    private String ten;
    private String gioitinh;
    private String date;
    private String dc;
    private String mst;
    private String hd;

   public C_ty(){
    this.ma="00001";
   }
   private String chuanhoadate(String dateStr){
        String[] tokens=dateStr.trim().split("[-/.]");
        int day = Integer.parseInt(tokens[0]);
        int month=Integer.parseInt(tokens[1]);
        int year=Integer.parseInt(tokens[2]);
        return String.format("%02d/%02d/%04d",day,month,year);
   }
   public void nhap(Scanner sc){
        this.ten=sc.nextLine();
        this.gioitinh=sc.nextLine();
        this.date=chuanhoadate(sc.nextLine());
        this.dc=sc.nextLine();
        this.mst=sc.nextLine();
        this.hd=chuanhoadate(sc.nextLine());
   }
   @Override
   public String toString(){
        return this.ma+" "+
        this.ten+" "+
        this.gioitinh+" "+
        this.date+" "+
        this.dc+" "+
        this.mst+" "+
        this.hd;
   }

}
public class bai6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        C_ty nv = new C_ty();
        nv.nhap(sc);
        System.out.println(nv);
        sc.close();
    }
}