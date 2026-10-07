import java.util.*;
class Phan_so{
    private long tu;
    private long mau;
    //
    private long ucln(long a, long b){
        a = Math.abs(a);
        b = Math.abs(b);
        while (b!=0){
            long tam=b;
            b=a%b;
            a=tam;
        }
        return a;
    }
    private void rutGon(){
        if (mau==0) return;
        long uc = ucln(tu,mau);
        tu/=uc;
        mau/=uc;
        if(mau<0){
            tu=-tu;
            mau=-mau;
        }
    }
    public Phan_so(long tu, long mau){
        this.tu=tu;
        
        if(mau==0){
            this.mau=1;
        }
        else{
            this.mau=mau;
        }
        this.rutGon();
    }
    public void Kq(){
        System.out.println(tu+ "/" +mau);
    }
}
public class J04003{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        Phan_so ps = new Phan_so(n,m);
        ps.Kq();
        sc.close();
    }
}