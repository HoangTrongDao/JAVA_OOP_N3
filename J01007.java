import java.util.Scanner;
public class J01007 {
    public static boolean fibo(long x) {
        if (x == 0) {
            return true;
        }
        long a = 1;
        long b = 1;
        while (a <= x) {
            if (a == x) {
                return true;
            }
            // Tránh tràn long
            if (Long.MAX_VALUE - a < b) {
                break;
            }
            long c = a + b;
            a = b;
            b = c;
        }
        return false;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            long n = sc.nextLong();

            if (fibo(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}