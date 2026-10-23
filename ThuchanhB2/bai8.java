import java.util.*;
class Nv implements Comparable<Nv>{
    private static int NUM_nv = 0;
    private String ma;
    private String ten;
    private String gt;
    private String date;
    private String dc;
    private String mst;
    private String hd;

    public Nv(){
        NUM_nv++;
        this.ma=String.format("%05d",NUM_nv);
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
        this.gt=sc.nextLine();
        this.date=chuanhoadate(sc.nextLine());
        this.dc=sc.nextLine();
        this.mst=sc.nextLine();
        this.hd=chuanhoadate(sc.nextLine());
   }
   public String getdate(){
    String[] tokens = this.date.split("/");
    return tokens[2]+tokens[1]+tokens[0];
   }
   @Override
   public int compareTo(Nv o){
    return this.getdate().compareTo(o.getdate());
   }
   @Override
   public String toString(){
        return this.ma+" "+
        this.ten+" "+
        this.gt+" "+
        this.date+" "+
        this.dc+" "+
        this.mst+" "+
        this.hd;
   }
}
public class bai8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Nv> ds=new ArrayList<>();
        for(int i=0;i<n;i++){
            Nv nv1 = new Nv();
            nv1.nhap(sc);
            ds.add(nv1);
        }
        Collections.sort(ds);
        for(Nv nv1:ds){
            System.out.println(nv1);
        }
        sc.close();
    }
}