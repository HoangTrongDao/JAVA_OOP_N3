import java.util.*;
class TT1{
    private String cty;
    private String ma;
    private int sl;
    public TT1(){
        cty="";
        ma="";
        sl=0;
    }
    
    public String getMa() {
        return ma;
    }

    public int getSl() {
        return sl;
    }
    public void nhap(Scanner sc){
        ma = sc.nextLine().trim();
        cty = sc.nextLine().trim();
        sl = Integer.parseInt(sc.nextLine().trim());

    }
    @Override
    public String toString(){
        return ma + " " + cty + " " + sl;
    }
}
public class J05028{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<TT1> ds = new ArrayList<>();
        for (int i=1;i<=n;i++){
            TT1 nv = new TT1();
            nv.nhap(sc);
            ds.add(nv);
        }
        ds.sort((a, b) -> {
            if (a.getSl() != b.getSl()) {
                return Integer.compare(b.getSl(), a.getSl());
            }
            return a.getMa().compareTo(b.getMa());
        });
        for(TT1 ct1:ds){
            System.out.println(ct1);
        }
        sc.close();
    }
}