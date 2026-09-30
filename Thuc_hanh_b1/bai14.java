import java.util.*;
public class bai14{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String n = sc.next();
            int du = 0;
            for (int i=0;i<n.length();i++){
                du=(du*10+(n.charAt(i)-'0'))%11;
            }
            if(du==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}