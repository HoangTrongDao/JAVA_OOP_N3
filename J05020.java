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
    public String getMa(){
        return ma;
    }
    public void nhap(Scanner sc){
        ma = sc.nextLine().trim();
        ten = sc.nextLine().trim();
        lop = sc.nextLine().trim();
        email = sc.nextLine().trim();
    }
    @Override
    public String toString(){
        return ma + " " + ten +" "+ lop +" "+email;
    }
}
public class J05020{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SV> ds = new ArrayList<>();
        for (int i=1;i<=n;i++){
            SV hs = new SV();
            hs.nhap(sc);
            ds.add(hs);
        }
        ds.sort((a,b)->{
            if(!a.getLop().equals(b.getLop())){
                return a.getLop().compareTo(b.getLop());
            }
            return a.getMa().compareTo(b.getMa());
        });
        for(SV sv : ds){
            System.out.println(sv);
        }
        sc.close();
    }
}
