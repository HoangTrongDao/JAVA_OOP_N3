import java.util.*;
class NV{
    private String ten;
    private String chucvu;
    private long luong;
    private long ngaycong;
    private String ma;
    private static int stt = 1;

    public NV(){
        ma = "NV" + String.format("%02d",stt++);
        ten = "";
        chucvu = "";
        luong = 0;
        ngaycong =0;
        
    }

    public long luongchinh(){
        return luong * ngaycong;
    }
    public long phucap() {
    if (chucvu.equals("GD")) {
        return 500;
    } else if (chucvu.equals("PGD")) {
        return 400;
    } else if (chucvu.equals("TP")) {
        return 300;
    } else if (chucvu.equals("KT")) {
        return 250;
    } else {
        return 100;
    }
}   
    public long tamung(){
        double tam = (phucap() + luongchinh()) * 2.0 / 3.0;
        if (tam < 25000) {
            return Math.round(tam / 1000.0) * 1000;
        }
        return 25000;
    }
    public long tong(){
        return luongchinh()+phucap();
    }
    public long conlai(){
        return tong()-tamung();
    }
    public String getChuc(){
        return chucvu;
    }
    public void nhap(Scanner sc){
        ten = sc.nextLine().trim();
        chucvu = sc.nextLine().trim();
        luong = Long.parseLong(sc.nextLine().trim());
        ngaycong = Long.parseLong(sc.nextLine().trim());
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + phucap() +" "+ luongchinh() +" "+ tamung() + " " +conlai();
    }
}
public class J05044{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        ArrayList<NV>  ds = new ArrayList();
        int n = Integer.parseInt(sc.nextLine().trim());
        for(int i=0;i<n;i++){
            NV nv = new NV();
            nv.nhap(sc);
            ds.add(nv);
        }
        String nghiem = sc.nextLine().trim();
        for(NV nv : ds){
            if(nv.getChuc().equals(nghiem)){
                System.out.println(nv);
            }
        }
        sc.close();
    }
}