import java.util.*;
public class J02014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            long sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }
            long left = 0;
            int ans = -1;
            for (int i = 0; i < n; i++) {
                long right = sum - left - a[i];
                if (left == right) {
                    ans = i + 1; 
                    break;
                }
                left += a[i];
            }
            System.out.println(ans);
        }
        sc.close();
    }
}