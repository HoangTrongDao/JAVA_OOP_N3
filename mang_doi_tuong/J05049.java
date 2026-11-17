import java.util.*;
class XH{
    private String ma;
    private int sl;
    public XH(){
        ma = "";
        sl =0;
    }
    public String getMa(){
        return ma;
    }
    public int xuathang(){
        char x = Character.toUpperCase(ma.charAt(0));
        double res = 0;
        if (x=='A'){
            res = 0.6 * sl;
        }
        else if (x=='B'){
            res = 0.7 * sl;
        }
        return (int) Math.round(res);
    }
    public int dongia(){
        char x = Character.toUpperCase(ma.charAt(ma.length()-1));
        if (x=='Y'){
            return 110000;
        }
        else if (x=='N'){
            return 135000;
        }
        else {
            return 0;
        }
    }
    public long tien(){
        return  xuathang() * dongia();
    }
    public int thue(){
        char x = Character.toUpperCase(ma.charAt(0));
        char y = Character.toUpperCase(ma.charAt(ma.length()-1));
        double cnt = 0;
        if (x=='A' &&  y == 'Y'){
            cnt = 0.08 * tien();
        }
        else if(x == 'A' && y =='N'){
            cnt = 0.11 * tien();
        }
        else if(x=='B' && y =='Y'){
            cnt = 0.17 * tien();
        }
        else if(x=='B' && y =='N'){
            cnt = 0.22*tien();
        }
        return (int)Math.round(cnt); 
    }
    public void nhap(Scanner sc){
        ma = sc.nextLine().trim();
        sl = Integer.parseInt(sc.nextLine().trim());
    }
    @Override
    public String toString(){
        return ma + " " + sl + " " + xuathang() + " " + dongia() + " " + tien() + " " +thue();
    }
}
public class J05049{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        ArrayList<XH>  ds = new ArrayList();
        int n = Integer.parseInt(sc.nextLine().trim());
        for(int i=0;i<n;i++){
            XH nv = new XH();
            nv.nhap(sc);
            ds.add(nv);
        }
        String o = sc.nextLine().trim();
        ds.sort((a,b)-> Integer.compare(b.thue(),a.thue()));
        for(XH nv : ds){
                if(nv.getMa().startsWith(o)){
                System.out.println(nv);
                }
        }
        sc.close();
    }
}
