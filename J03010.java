import java.util.*;
public class J03010{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        Map<String, Integer> map = new HashMap<>();
        while(t-->0){
            String s = sc.nextLine();
            s = s.toLowerCase().trim();
            String[] a = s.split("\\s+");
            String email = a[a.length-1];
            for(int i =0;i<a.length-1;i++){
                email += a[i].charAt(0);
            }
            // Xử lý trùng
            if (!map.containsKey(email)) {
                map.put(email, 1);
                System.out.println(email + "@ptit.edu.vn");
            } else {
                int cnt = map.get(email) + 1;
                map.put(email, cnt);
                System.out.println(email + cnt + "@ptit.edu.vn");
            }
        }
    }
}