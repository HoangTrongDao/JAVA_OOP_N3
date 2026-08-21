import java.util.Scanner;
public class J02106{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Đọc số lượng hàng N
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int ans = 0; // Biến đếm số hàng thỏa mãn điều kiện  
            // Duyệt qua từng hàng
            for (int i = 0; i < n; i++) {
                int c1 = sc.nextInt();
                int c2 = sc.nextInt();
                int c3 = sc.nextInt();
                if (c1 + c2 + c3 >= 2) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
