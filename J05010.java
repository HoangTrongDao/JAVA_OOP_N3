import java.util.*;
class MH{
    private static int id=1;
    private int ma;
    private String ten;
    private String nhom;
    private float giamua;
    private float giaban;

    public MH(){
        ma=id++;
        ten="";
        nhom="";
        giamua=0;
        giaban=0;
    }
    public void nhap(Scanner sc){
        ten = sc.nextLine().trim();
        nhom = sc.nextLine().trim();
        giaban = Float.parseFloat(sc.nextLine().trim());
        giamua = Float.parseFloat(sc.nextLine().trim());
    }
    public float loinhuan(){
        return giamua-giaban;
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + nhom + " " + String.format("%.2f",loinhuan());
    }
}
public class J05010{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
            ArrayList<MH> ds = new ArrayList<>();
            for(int i=0;i<n;i++){
                MH x = new MH();
                x.nhap(sc);
                ds.add(x);
            }
            ds.sort((a,b)-> Float.compare(b.loinhuan(),a.loinhuan()));  
            for(MH x : ds){
                System.out.println(x);
            }
        sc.close();
    } 
}