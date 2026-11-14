import java.util.*;
class TGV{
    private String ten;
    private static int id =1;
    private String ma;
    private String mxt;
    private float tin;
    private float cm;
    public TGV(){
        ten = "";
        ma = "GV" + String.format("%02d",id++);
        mxt="";
        tin =0;
        cm = 0;
    }
    public String getMon(){
        char x = this.mxt.charAt(0);
        if (x == 'A')   return "TOAN";
        if (x == 'B')   return "LY";
        return "HOA";
    }
    public float getDiem(){
        char x = this.mxt.charAt(1);
        if (x == '1') return 2.0f;
        if (x == '2') return 1.5f;
        if (x == '3') return 1.0f;
        return 0.0f;
    }
    public float diem(){
        return tin*2 + cm + this.getDiem();
    }
    public String xet(){
        float kq = diem();
        if(kq>=18.0f){
            return "TRUNG TUYEN";
        }
        else{
            return "LOAI";
        }
    }
    public void nhap(Scanner sc){
        ten = sc.nextLine().trim();
        mxt = sc.nextLine().trim();
        tin = Float.parseFloat(sc.nextLine().trim());
        cm = Float.parseFloat(sc.nextLine().trim());
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " +getMon()+" "+ String.format("%.1f",diem()) + " " + xet() ;
    }
}
public class J05014{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<TGV> ds = new ArrayList<>();
        for (int i=0;i<n;i++){
            TGV s = new TGV();
            s.nhap(sc);
            ds.add(s);
        }
        ds.sort((a,b)->Float.compare(b.diem(),a.diem()));
        for(TGV s:ds){
            System.out.println(s);
        }
        sc.close();
    }
}