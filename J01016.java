import java.util.Scanner;
public class J01016 {
    public static long c4(long n){
        long cnt =0;
        while(n!=0){
            long so = n%10;
            if(so==4){
                cnt++;
            }
            n/=10;
        }
        return cnt;
    }
    public static long c7(long n){
        long cnt =0;
        while(n!=0){
            long so = n%10;
            if(so==7){
                cnt++;
            }
            n/=10;
        }
        return cnt;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long bon = c4(n);
        long bay = c7(n);
        if(bon+bay == 4 || bon + bay == 7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
