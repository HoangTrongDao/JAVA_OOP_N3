import java.util.*;
public class J03017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine().trim();
            ArrayList<String> a = new ArrayList<>();
            while (true) {
                int pos = s.indexOf("100");
                if (pos == -1) {
                    break;
                }
                a.add("100");
                s = s.substring(0, pos) + s.substring(pos + 3);
            }
            int ans = 0;
            for (String x : a) {
                ans += x.length();
            }
            System.out.println(ans);
        }
    }
}