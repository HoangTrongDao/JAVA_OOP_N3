import java.util.*;
public class bai2{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int du = 0;
        int dem = 0;
        
        for(int i=1;i<=N;i++){
            int x = i;
            int soCs=0;
            while(x>0){
                soCs++;
                x/=10;
            }
            int p = 1;
            for(int j = 0;j<soCs;j++){
                p = (p*10)%K;
            }
            du = (du * p + i)%K;
            if(du==0){
                dem++;
            }
        }
        System.out.println(dem) ;
    }
}