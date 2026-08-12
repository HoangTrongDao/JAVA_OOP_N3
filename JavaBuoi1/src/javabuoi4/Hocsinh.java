package javabuoi4;
public class Hocsinh{
    String ten;
    String tuoi;
    double diem;
    public Hocsinh(String ten, String tuoi, double diem)
    {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diem = diem;
    }
    public  void display()
    {
        System.out.println("----hoc sinh-----");
        System.out.println("Name: "+ ten);
        System.out.println("Tuoi: "+ tuoi);
        System.out.println("Diem: "+ diem);
    }
}