import java.util.Scanner;
class Matrix{
    private int rows;
    private int cols;
    private int[][] data;

    public Matrix(int rows, int cols){
        this.rows=rows;
        this.cols=cols;
        this.data= new int[rows][cols];
    }
    public void nextMatrix(Scanner sc){
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                data[i][j]=sc.nextInt();
            }
        }
    }
    public Matrix mul(Matrix b){
        Matrix res = new Matrix(this.rows,b.cols);
        for (int i =0 ;i<this.rows;i++){
            for(int j = 0;j<b.cols;j++){
                res.data[i][j]=0;
                for(int k =0;k<this.cols;k++){
                    res.data[i][j]+=this.data[i][k]*b.data[k][j];
                }
            }
        }
        return res;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<rows;i++){
            for(int j=0;j<cols;j++){
                sb.append(data[i][j]);
                if(j<cols-1){
                    sb.append(" ");
                }
            }
            if (i<rows-1){
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(),m=sc.nextInt(),p=sc.nextInt();
        Matrix a = new Matrix(n,m);
        a.nextMatrix(sc);
        Matrix b = new Matrix(m,p);
        b.nextMatrix(sc);
        System.out.println(a.mul(b));
    }
}