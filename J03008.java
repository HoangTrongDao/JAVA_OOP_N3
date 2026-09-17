import java.util.*;
public class J03008{
    static boolean TN(String s){
        String daonguoc = new StringBuilder(s).reverse().toString();
        return s.equals(daonguoc);
    }
    static boolean nt(String s){
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '2' && c != '3' && c != '5' && c != '7') {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine().trim();
            if (TN(s) && nt(s)){
                System.out.print("YES\n");
            }
            else{
                System.out.print("NO\n");
            }
        }
        sc.close();
    }
}