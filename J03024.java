import java.util.*;
public class J03024{
    static String check(String s){
        int n = s.length();
        int c = 0;
        int l = 0;
        if (s.charAt(0) == '0') {
            return "INVALID";
        }
        for (int i =0;i<n;i++){
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                return "INVALID";
            }
            if((s.charAt(i)-'0')%2==0){
                c++;
            }
            else{
                l++;
            }
        }
        if (c==l) {
            return "INVALID";
        }
        if (s.length()%2==0 && c>l){
            return "YES";
        }
        if (s.length()%2!=0 && c<l){
            return "YES";
        }
        return "NO";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String n = sc.nextLine();
            System.out.println(check(n));
           
        }
    }
}