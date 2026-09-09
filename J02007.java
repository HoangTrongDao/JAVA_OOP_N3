import java.util.*;

public class J02007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int test = 1; test <= t; test++) {

            int n = sc.nextInt();

            int[] a = new int[n];
            int[] cnt = new int[100005];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                cnt[a[i]]++;
            }

            System.out.println("Test " + test + ":");
            for (int i = 0; i < n; i++) {

                boolean first = true;
                for (int j = 0; j < i; j++) {
                    if (a[j] == a[i]) {
                        first = false;
                        break;
                    }
                }

                if (first) {
                    System.out.println(
                        a[i] + " xuat hien " + cnt[a[i]] + " lan"
                    );
                }
            }
        }

        sc.close();
    }
}