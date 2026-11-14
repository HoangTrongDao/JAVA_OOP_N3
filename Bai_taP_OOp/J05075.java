import java.util.*;
class DD{
    private String ma;
    private String ten;
    private String lop;
    private int dcc;
    public DD(){
        ma = "";
        ten = "";
        lop = "";
        dcc = 10;
    }
    public String getMa(){
        return ma;

    }
    public String getLop(){
        return lop;
    }
    public void diem(String s){
        int tong = 10;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == 'v' ){
                tong-=2;
            }
            if(c == 'm'){
                    tong-=1;
                }
        }
        if(tong<=0){
            tong=0;
        }
        this.dcc=tong;   
    }
    public void nhap(Scanner sc){
        ma = sc.nextLine().trim();
        ten = sc.nextLine().trim();
        lop = sc.nextLine().trim();
    }
    @Override 
    public String toString(){
        String res = ma + " " + ten + " " + lop + " " + dcc;
        if(dcc==0){
            res+= " KDDK";
        }
        return res;
    }
}
public class  J05075{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<DD> ds = new ArrayList<>();
        for(int i=0;i<n;i++){
            DD sv = new DD();
            sv.nhap(sc);
            ds.add(sv);
        }
        for(int i=0;i<n;i++){
            String masv = sc.next();
            String dd = sc.next();
            for(DD sv :ds){
                if(sv.getMa().equals(masv)){
                    sv.diem(dd);
                    break;
                }
             }
        }
        String mm = sc.next().trim();
        for(DD sv : ds){
            if(sv.getLop().equals(mm)){
                System.out.println(sv);
            }
        }
        sc.close();
    }
}