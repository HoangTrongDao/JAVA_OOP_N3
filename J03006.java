import java.util.*;
public class J03006{
    public static boolean chan(String s){
        int n = s.length();
        for (int i = 0 ;i<n;i++){
            int so = s.charAt(i)-'0';
            if(so % 2!=0){
                return false;
            }
        }
        return true;
    }
    static boolean laThuanNghich(String s) {
        String daoNguoc = new StringBuilder(s).reverse().toString();
        return s.equals(daoNguoc);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();x
        while(t-->0){
            String s = sc.nextLine().trim();
            if (chan(s) && laThuanNghich(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}