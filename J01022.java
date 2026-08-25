import java.util.*;
public class J01022 {
    static long[] len = new long[93];
    static char solve(int n, long k) {
        if (n == 1) {
            return '0';
        }
        if (n == 2) {
            return '1';
        }
        // X[n] = X[n-2] + X[n-1]
        if (k <= len[n - 2]) {
            return solve(n - 2, k);
        } else {
            return solve(n - 1, k - len[n - 2]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Độ dài X[n]
        len[1] = 1;
        len[2] = 1;
        for (int i = 3; i <= 92; i++) {
            len[i] = len[i - 2] + len[i - 1];
        }
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(solve(n, k));
        }
    }
}