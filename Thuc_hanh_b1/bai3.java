import java.util.*;
public class bai3{
    static boolean nt(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    static int kc(int x){
        int d=0;
        while(true){
            if(x-d>=2 &&nt(x-d)){
                return d;
            }
            if (nt(x+d)){
                return d;
            }
            d++;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans=0;
        for(int i=0;i<n;i++){
            int x= sc.nextInt();
            int d = kc(x);
            ans=Math.max(ans,d);
        }
        System.out.println(ans);
    }
}