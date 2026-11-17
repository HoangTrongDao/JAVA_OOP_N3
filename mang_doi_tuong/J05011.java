import java.util.*;
class TG{
    private String ma;
    private String ten;
    private String giovao;
    private String giora;

    public TG(){
        ma = "";
        ten = "";
        giovao= "";
        giora = "";
    }

    public int tinhphut(String s){
        String[] p = s.trim().split(":");
        int gio = Integer.parseInt(p[0].trim());
        int phut =  Integer.parseInt(p[1].trim());
        return gio*60 + phut;
    }
    public int tongphut(){
        return tinhphut(giora) - tinhphut(giovao);
    }
    public String kq(){
        int tong = tongphut();
        int gio = tong/60;
        int phut = tong %60;
        return gio + " gio " + phut + " phut";
    }
    public void nhap(Scanner sc){
        ma = sc.nextLine().trim();
        ten = sc.nextLine().trim();
        giovao = sc.nextLine().trim();
        giora = sc.nextLine().trim();
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + kq();
    }
}
public class J05011{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        ArrayList<TG>  ds = new ArrayList();
        int n = Integer.parseInt(sc.nextLine().trim());
        for(int i=0;i<n;i++){
            TG nv = new TG();
            nv.nhap(sc);
            ds.add(nv);
        }
        ds.sort((a, b) -> Integer.compare(b.tongphut(), a.tongphut()));
        for(TG nv : ds){
            System.out.println(nv);
        }
        sc.close();
    }
}