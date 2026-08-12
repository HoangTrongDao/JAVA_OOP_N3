import java.util.Scanner;
public class J01009{
    public static long gt(long n){
        long  tic = 1;
        long tong=0;
        for (long j=1;j<=n;j++){
            tic *= j;
            tong+=tic;
        }
        return tong;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long kq = gt(n);
        System.out.println(kq);
    }
}