import java.util.*;
public class J03004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine().trim();
            String[] words = s.split("\\s+");
            StringBuilder ans = new StringBuilder();
            for (String word : words) {
                word = word.toLowerCase();
                word = Character.toUpperCase(word.charAt(0))
                        + word.substring(1);
                ans.append(word).append(" ");
            }
            System.out.println(ans.toString().trim());
        }
    }
}