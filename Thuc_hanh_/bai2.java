import java.util.*;
public class bai2{
    static boolean check(String n){
        if (n.length()%2==0){
            return true;
        }
        return false;
    }
    static boolean check1(String n){
        char x = n.charAt(1);
        for(int i=1;i<n.length();i+=2){
            if (n.charAt(i)!=x){
                return false;
            }
        }
        return true;
    }
    static boolean check2(String n){
        if (n.length()<3){
                return false;
        }
        return n.charAt(0)!=n.charAt(2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String n = sc.nextLine();
            if(check(n) && check1(n) && check2(n)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}