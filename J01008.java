import java.util.Scanner;
public class J01008{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        for(int test = 1; test <= t; test++){
            long n = sc.nextLong();
            System.out.print("Test " + test + ": ");
            for(long i=2;i*i<=n;i++){
                long cnt=0;
                while(n%i==0){
                    n = n/i;
                    cnt++;
                }
                if(cnt>0){
                    System.out.print(i+"("+cnt+") ");
                }
            }
            if(n>1){
                System.out.print(n+"(1)");
            }
            System.out.println();
        }
    }
}