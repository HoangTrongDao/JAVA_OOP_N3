import java.util.*;
public class J02025 {
    static int n;
    static int[] a;
    static ArrayList<Integer> b;
    static boolean nguyenTo(int x) {
        if (x < 2) {
            return false;
        }

        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }

    static void Try(int pos, int sum) {
        for (int i = pos; i < n; i++) {

            b.add(a[i]);

            int tong = sum + a[i];

            if (nguyenTo(tong)) {
                for (int x : b) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }

            Try(i + 1, tong);

            b.remove(b.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            n = sc.nextInt();

            a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);

            b = new ArrayList<>();

            Try(0, 0);
        }
    }
}