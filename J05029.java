import java.util.*;
class TT2{
    private String ma;
    private String cty;
    private int sl;
    public TT2(){
        ma= "";
        cty = "";
        sl = 0;
    }
    public int getSl(){
        return sl;
    }
    public String getMa() {
        return ma;
    }
    public void nhap(Scanner sc){
        ma = sc.nextLine().trim();
        cty = sc.nextLine().trim();
        sl = Integer.parseInt(sc.nextLine().trim());

    }
    @Override
    public String toString(){
        return ma + " "+ cty + " "+ sl;
    }

}
public class J05029{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<TT2> ds = new ArrayList<>();
        for (int i=1;i<=n;i++){
            TT2 ct = new TT2();
            ct.nhap(sc);
            ds.add(ct);
        }
        ds.sort((x, y) -> {
            if (x.getSl() != y.getSl()) {
                return Integer.compare(y.getSl(), x.getSl());
            }
            return x.getMa().compareTo(y.getMa());
        });
        int q = sc.nextInt();
        while(q-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a +" DEN " + b +  " SINH VIEN:");
            for(TT2 ct:ds){
                if(ct.getSl()>=a && ct.getSl()<=b){
                    System.out.println(ct);
                }
            }
        }
        sc.close();
    }
}