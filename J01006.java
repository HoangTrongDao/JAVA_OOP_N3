import java.util.Scanner;
public class J01006 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long a = 1;
            long     b = 1;
            int n = sc.nextInt();
            if(n==1||n==2){
                System.out.println("1");
            }
            else{
                for(int i=3;i<=n;i++){
                    long c = a+b;
                    a = b;
                    b = c;
                }
                System.out.println(b);
            }
        }
    }
}
