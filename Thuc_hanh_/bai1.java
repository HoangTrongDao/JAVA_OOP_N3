import java.util.*;
public class bai1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            int n = s.length();
            int tic=1;
            int tong=0;
            for (int i = 0 ;i<n;i++){
                if(s.charAt(i)-'0'==0){
                    continue;
                }
                if(s.charAt(i)%2!=0){
                    tic*=s.charAt(i)-'0';
                }
                else{
                    tong+=s.charAt(i)-'0';
                }
            }
            float kq = tic/tong;
            if(tong==0){
                System.out.println("INVALID");
            }
            
        } 
    }
}