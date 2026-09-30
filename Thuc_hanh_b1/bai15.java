import java.util.*;
public class bai15{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String n = sc.next();
            char a= n.charAt(0);
            char b= n.charAt(1);
            char c= n.charAt(n.length()-2);
            char d= n.charAt(n.length()-1);
            if(a==d && b==c){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}