import java.util.Scanner;
public class J01024{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            boolean isCheck=true;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)-'0' != 1 && s.charAt(i)-'0'!=0 && s.charAt(i)-'0'!=2){
                    isCheck = false; 
                    break; 
                }
            }
            if (isCheck) {
                System.out.println("YES");
            } 
            else {
                System.out.println("NO");
            }
        }
    }     
}
