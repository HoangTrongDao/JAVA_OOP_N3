import java.util.Scanner;
public class J01018 {
    public static boolean check(String s){
        for (int i=1;i<s.length();i++){
            long a=s.charAt(i-1)-'0';
            long b=s.charAt(i)-'0';
            if(Math.abs(a-b)==2){
                return true;
            }
        }
        return false;
    }
    public static long sum(String s){
        int tong = 0;

        for (int i = 0; i < s.length(); i++) {
            tong += s.charAt(i) - '0';
        }

        return tong;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-->0){
            String n = sc.next();
            if(check(n) && sum(n)%10==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
