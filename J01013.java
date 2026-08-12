import java.util.Scanner;
public class J01013{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        int kq=0;
        while(t-->0){
            int n = sc.nextInt();
            for(int i=2;i*i<=n;i++){
                while(n%i==0){
                    n=n/i;
                    kq+=i;
                }
            }
            if(n>1){
                kq+=n;
            }
        }
        System.out.println(kq);
    }
}