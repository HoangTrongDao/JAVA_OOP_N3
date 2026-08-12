import java.util.Scanner;
public class Kiemtrachanle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x%2==0){
            System.out.println("Là số chẵn");
        }
        else{
            System.out.println("Là số lẻ");
        }
    }
}