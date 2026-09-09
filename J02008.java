import java.util.*;
public class J02008{
    static long gcd(long a, long b){
        while(b!=0){
            long r = a%b;
            a=b;
            b=r;
        }
        return a;
    }
    static long lcm(long a, long b){
        return a/ gcd(a,b)*b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
             while (t-- > 0) {
            int n = sc.nextInt();
            long ans = 1;

            for (int i = 2; i <= n; i++) {
                ans = lcm(ans, i);
            }

            System.out.println(ans);
        }
        sc.close();
    }
}