package javabuoi4;
public class quanly{
    String ten;
    int tuoi;
    double gpa;
    public quanly(String ten, int tuoi, double gpa){
        this.ten = ten;
        this.tuoi = tuoi;
        this.gpa = gpa;             
    }
    public void display()
    {
        System.out.println("----hoc sinh----");
        System.out.println("Ten: "+ ten);
        System.out.println("Tuoi: "+ tuoi);
        System.out.print("Diem: "+gpa);
    }
           
}