import java.util.*;
class TC{
    private String ma;
    private static int stt=1;
    private String ten;
    private long luong;
    private long cong;
    private String chucvu;

    public TC(){
        ma = "NV" + String.format("%02d",stt++);
        ten = "";
        luong = 0;
        cong = 0;
        chucvu="";
    }
    public long luongt(){
        return luong * cong;
    }
    public long thuong(){
        if(cong>25){
            return Math.round(0.2*luongt());
        }
        else if(cong>22 && cong<=25){
            return Math.round(0.1*luongt());
        }
        else{
            return 0;
        }
    }
    public long phucap(){
        if(chucvu.equals("GD")){
            return 250000;
        }
        else if(chucvu.equals("PGD")){
            return 200000;
        }
        else if(chucvu.equals("TP")){
            return 180000;
        }
        else if(chucvu.equals("NV")){
            return 150000;
        }
        else{
            return 0;
        }
    }
    public long thunhap(){
        return luongt() + thuong() + phucap();
    }
    public void nhap(Scanner sc){
        ten = sc.nextLine().trim();
        luong = Long.parseLong(sc.nextLine().trim());
        cong = Long.parseLong(sc.nextLine().trim());
        chucvu = sc.nextLine().trim();
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + luongt() + " " + thuong() + " " + phucap()+ " " + thunhap();
    }
}
public class J04012{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            TC hs = new TC();
            hs.nhap(sc);
            ArrayList<TC> ds = new ArrayList<>();
            ds.add(hs);
            for(TC s : ds){
                System.out.println(s);
            }
        }
    }
}