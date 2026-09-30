import java.util.*;
public class bai5{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m=sc.nextInt();
        long tong=0;
        long minAbs=Long.MAX_VALUE;
        int soAm=0;
        for(int i=0;i<n;i++){
            long x=sc.nextLong();
            tong+=x;
            if(x<0){
                tong+=-2L*x;
                soAm++;
            }
            long abs=Math.abs(x);
            if(abs<minAbs){
                minAbs=abs;
            }
        }
        m=-soAm;
        if(m>0 && m%2==1){
            tong-=2L*minAbs;
        }
        
        System.out.println(tong);
    }
}