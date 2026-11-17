import java.util.*;
class HS{
    private String ten;
    private String ma;
    private static int stt=1;
    private double toan;
    private double tiengviet;
    private double anh;
    private double ly;
    private double hoa;
    private double sinh;
    private double su;
    private double dia;
    private double gdcd;
    private double cn;

    public HS(){
        ma = "HS"+String.format("%02d",stt++);
        ten = "";
        toan = 0;
        tiengviet = 0;
        anh = 0;
        ly = 0;
        hoa = 0;
        sinh = 0;
        su = 0 ;
        dia = 0;
        gdcd = 0;
        cn = 0;
    }
    public String getM(){
        return ma;
    }
    public double tong(){
        return Math.round(((toan*2 + tiengviet*2 + anh + ly + hoa + su + sinh + dia + gdcd + cn)/12)*10.0)/10.0;
    }
    public String xl(){
        if (tong()<5){
            return "YEU";
        }
        else if(tong()<=6.9){
            return "TB";
        }
        else if(tong()<=7.9){
            return "KHA";
        }
        else if (tong()<=8.9){
            return "GIOI";
        }
        else {
            return "XUAT SAC";
        }
    }
    public void nhap(Scanner sc){
        ten = sc.nextLine().trim();
        toan = Double.parseDouble(sc.next());
        tiengviet = Double.parseDouble(sc.next());
        anh = Double.parseDouble(sc.next());
        ly = Double.parseDouble(sc.next());
        hoa = Double.parseDouble(sc.next());
        sinh = Double.parseDouble(sc.next());
        su = Double.parseDouble(sc.next());
        dia = Double.parseDouble(sc.next());
        gdcd = Double.parseDouble(sc.next());
        cn = Double.parseDouble(sc.nextLine().trim());
    }

    @Override
    public String toString(){
        return ma + " " + ten + " " + String.format("%.1f",tong()) + " " + xl();
    }

}
public class J05018{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<HS> ds = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine().trim());
        for(int i=0;i<n;i++){
            HS hs = new HS();
            hs.nhap(sc);
            ds.add(hs);
        }
        ds.sort((a,b)->{
            if(a.tong()!=b.tong()){
                return Double.compare(b.tong(),a.tong());
            }
            return a.getM().compareTo(b.getM());
        });
        for(HS a : ds){
            System.out.println(a);
        }
        sc.close();
    }
}