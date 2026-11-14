import java.util.*;
class DD1{
    private String ma;
    private String ten;
    private String lop;
    private int dcc;
    public DD1(){
        ma = "";
        ten = "";
        lop = "";
        dcc=10;
    }
    public void nhap(Scanner sc){
        ma = sc.nextLine().trim();
        ten = sc.nextLine().trim();
        lop = sc.nextLine().trim();
    }
    public String getMa(){
        return ma;
    }
    public void diem(String s){
        int diem = 10;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='v'){
                diem -=2;
            }
            else if(c=='m'){
                diem -=1;
            }
        }
        if (diem<0){
            diem =0;
        }
        this.dcc=diem;
    }
    @Override
    public String toString(){
        String res =  ma + " " + ten +" "+lop +" "+dcc;
        if (dcc==0){
            res+=" KDDK";
        }
        return res;
    }
}
class Monhoc{
    private String x;
    private String m;
    private String v;

}
public class J05074{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<DD1> ds = new ArrayList<>();
        for(int i=0;i<n;i++){
            DD1 sv = new DD1();
            sv.nhap(sc);
            ds.add(sv);
        }
        for(int i=0;i<n;i++){
            String masv=sc.next();
            String cc = sc.next();
            for(DD1 sv :ds){
                if(sv.getMa().equals(masv)){
                    sv.diem(cc);
                    break;
                }
             }
        }
        for (DD1 sv : ds) {
            System.out.println(sv);
        }
    }
}