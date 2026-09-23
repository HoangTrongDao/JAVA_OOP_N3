import java.util.*;

public class J03009 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {

            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            Set<String> set2 = new HashSet<>();
            int j = 0;

            while (j < s2.length()) {

                while (j < s2.length() && s2.charAt(j) == ' ') {
                    j++;
                }

                int start = j;

                while (j < s2.length() && s2.charAt(j) != ' ') {
                    j++;
                }

                if (start < j) {
                    String word = s2.substring(start, j);
                    set2.add(word);
                }
            }
            Set<String> result = new TreeSet<>();
            int i = 0;
            while (i < s1.length()) {

                while (i < s1.length() && s1.charAt(i) == ' ') {
                    i++;
                }

                int start = i;

                while (i < s1.length() && s1.charAt(i) != ' ') {
                    i++;
                }

                if (start < i) {
                    String word = s1.substring(start, i);

                    if (!set2.contains(word)) {
                        result.add(word);
                    }
                }
            }

            for (String word : result) {
                System.out.print(word + " ");
            }

            System.out.println();
        }
    }
}