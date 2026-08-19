import java.util.Scanner;
public class songuyenduongam{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int gt=1;
        for(int i=1;i<=t;i++){
            gt*=i;
        }
        System.out.println("giai thưa cua "+t+"là: "+gt);
    }
}