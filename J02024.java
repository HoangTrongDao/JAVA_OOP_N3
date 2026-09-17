import java.util.*;

public class J02024 {

    static int n;
    static int[] a;
    static ArrayList<Integer> b;
    static ArrayList<ArrayList<Integer>> ans;

    static void Try(int pos, int sum) {
        for (int i = pos; i < n; i++) {

            b.add(a[i]);

            int tong = sum + a[i];

            if (tong % 2 != 0) {
                ans.add(new ArrayList<>(b));
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

            // Sắp xếp giảm dần
            Arrays.sort(a);

            for (int i = 0; i < n / 2; i++) {
                int tmp = a[i];
                a[i] = a[n - 1 - i];
                a[n - 1 - i] = tmp;
            }

            b = new ArrayList<>();
            ans = new ArrayList<>();

            Try(0, 0);

            // Sắp xếp các dãy con theo thứ tự từ điển tăng dần
            Collections.sort(ans, new Comparator<ArrayList<Integer>>() {
                public int compare(ArrayList<Integer> x, ArrayList<Integer> y) {

                    int len = Math.min(x.size(), y.size());

                    for (int i = 0; i < len; i++) {
                        if (!x.get(i).equals(y.get(i))) {
                            return Integer.compare(x.get(i), y.get(i));
                        }
                    }

                    return Integer.compare(x.size(), y.size());
                }
            });

            // In kết quả
            for (ArrayList<Integer> x : ans) {
                for (int i = 0; i < x.size(); i++) {
                    System.out.print(x.get(i) + " ");
                }
                System.out.println();
            }
        }
    }
}