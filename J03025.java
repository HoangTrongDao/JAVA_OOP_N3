import java.util.*;
public class J03025{
    static boolean check(String s){
        int l = 0;
        int r =s.length()-1;
        int dif = 0;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                dif++;
            }
            l++;
            r--;
        }
        if (dif==1){
            return true;
        }
        if(dif == 0 && s.length()%2==1){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        sc.nextLine();
        while (s-->0){
            String xau = sc.nextLine();
            if (check(xau)){
                System.out.println("YES\n");
            }
            else{
                System.out.println("NO\n");
            }
        }
    }

}