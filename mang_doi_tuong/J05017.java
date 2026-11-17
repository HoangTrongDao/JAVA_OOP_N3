import java.util.*;
class HD{
    private String ten;
    private int cu;
    private int moi;
    private String ma;
    private static int stt=1;
    public HD(){
        ma = "KH"+String.format("%02d",stt++);
        ten = "";
        cu = 0;
        moi = 0;
    }
    public int kq(){
        return moi - cu;
    }
    public long tongtien() {
    int res = kq();
    double tong = 0;
    if (res <= 50) {
        tong = res * 100 * 1.02;
    } else if (res <= 100) {
        tong = (50 * 100 + (res - 50) * 150) * 1.03;
    } else {
        tong = (50 * 100 + 50 * 150 + (res - 100) * 200) * 1.05;
    }
    return Math.round(tong);
}

    public void nhap(Scanner sc){
        ten = sc.nextLine().trim();
        cu = Integer.parseInt(sc.nextLine().trim());
        moi = Integer.parseInt(sc.nextLine().trim());
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + tongtien();
    }
}
public class J05017{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        ArrayList<HD>  ds = new ArrayList();
        int n = Integer.parseInt(sc.nextLine().trim());
        for(int i=0;i<n;i++){
            HD nv = new HD();
            nv.nhap(sc);
            ds.add(nv);
        }
        ds.sort((a,b)-> Long.compare(b.tongtien(),a.tongtien()));
        for(HD nv : ds){
            System.out.println(nv);
        }
        sc.close();
    }
}