import java.util.*;
class TT1{
    private String ma;
    private String ten;
    private String lop;
    private String email;
    private String dn;
    private int stt;
    public TT1(){

    }
    public String getMa(){
        return ma;
    }
    public String getTen(){
        return ten;
    }
    public String getDn() {
        return dn;
    }
    public void nhap(Scanner sc,int stt){
        this.stt=stt;
        ma=sc.nextLine().trim();
        ten=sc.nextLine().trim();
        lop=sc.nextLine().trim();
        email=sc.nextLine().trim();
        dn=sc.nextLine().trim();
    }
    @Override
    public String toString(){
        return stt+ " "+ ma + " " + ten + " " + lop +" "+email +" "+dn;
    }
}
public class J05034{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();
        ArrayList<TT1> ds = new ArrayList<>();
        for(int i=1;i<=n;i++){
            TT1 hs = new TT1();
            hs.nhap(sc,i);
            ds.add(hs);
        }
        ds.sort((a,b)->a.getMa().compareTo(b.getMa()));
        int q = sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String dnn= sc.nextLine().trim();
            for(    int i=0;i<ds.size();i++){
                TT1 hs = ds.get(i);
                if (hs.getDn().equals(dnn)) {
                    System.out.println(hs);
                }
            }
        }
        sc.close();
    }
}