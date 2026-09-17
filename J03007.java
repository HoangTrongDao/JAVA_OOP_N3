import java.util.*;
public class J03007{
    static boolean TN(String s){
        String daonguoc = new StringBuilder(s).reverse().toString();
        return s.equals(daonguoc);
    }
    static boolean t(String s){
        long tong = 0;
        int n = s.length();
        for(int i =0;i<n;i++){
            int so = s.charAt(i)-'0';
            tong+=so;
        }
        return tong %10 ==0;
    }
    static boolean tam(String s){
        if (s.charAt(0)-'0'==8 && (s.charAt(s.length()-1)-'0'==8)){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine().trim();
            if (TN(s) && t(s) && tam(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}