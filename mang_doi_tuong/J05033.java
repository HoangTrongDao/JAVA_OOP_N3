import java.util.*;
class Tg{
    private int gio;
    private int phut;
    private int giay;

    public Tg(){
        gio = 0;
        phut = 0;
        giay = 0;
    }

    public int tinhgiay(){
        return gio *3600 + phut*60 + giay;
    }

    public void nhap(Scanner sc){
        gio = sc.nextInt();
        phut = sc.nextInt();
        giay = sc.nextInt();
    }
    @Override
    public String toString(){
        return gio + " " + phut + " " + giay;
    }
}
public class J05033{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        ArrayList<Tg>  ds = new ArrayList();
        int n = Integer.parseInt(sc.nextLine().trim());
        for(int i=0;i<n;i++){
            Tg nv = new Tg();
            nv.nhap(sc);
            ds.add(nv);
        }
        ds.sort((a, b) -> Integer.compare(a.tinhgiay(), b.tinhgiay()));
        for(Tg nv : ds){
            System.out.println(nv);
        }
        sc.close();
    }
}