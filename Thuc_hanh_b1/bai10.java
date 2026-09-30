import java.util.*;
public class bai10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
                String s = sc.nextLine().trim();
                String[] a= s.split("\\s+");
                for(int i=a.length-1;i>=0;i--){
                    System.out.print(a[i]);                
                if(i>0){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}