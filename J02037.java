import java.util.*;
public class J02037{
    static  boolean UuTheChan(String[] arr){
        int n = arr.length;
        int cnt = 0;
        int odd = 0;
        int even = 0;
        for (String s : arr) {
            if (!s.isEmpty()) { 
                int x = Integer.parseInt(s);
                if (x % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        return (n%2==0)    &&  (even>odd);
    }
    static boolean UuTheLe(String[] arr){
        int n = arr.length;
        int odd = 0;
        int even = 0;
        for (String s : arr) {
            if (!s.isEmpty()) { 
                int x = Integer.parseInt(s);
                if (x % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        return (n%2!=0) && (even<odd);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-->0){
            String s = sc.nextLine().trim();
            String[] word = s.split("\\s+");
            if (UuTheChan(word)||UuTheLe(word)) {
                    System.out.println("YES");
                } 
            else {  
                    System.out.println("NO");
            }
        }
        sc.close();
    }
}