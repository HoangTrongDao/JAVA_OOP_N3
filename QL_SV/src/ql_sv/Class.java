package ql_sv;
import java.util.*;
public class Class {
    private String masinhvien;
    private String hoten;
    private String lop;
    private String ngaysinh;
    private float gpa;
    
    public Class(){
        this.masinhvien = "";
        this.hoten="";
        this.lop="";
        this.ngaysinh="";
        this.gpa=0.0f;
    }
    private String chuanhoa(String date){
        String[] b = date.split("/");
        if (b[0].length() < 2) b[0] = "0" + b[0];
        if (b[1].length() < 2) b[1] = "0" + b[1];
        return b[0] + "/" + b[1] + "/" + b[2];
    }
    public void nhap(Scanner sc){
        this.masinhvien="B20DCCN001";
        this.hoten=sc.nextLine();
        this.lop=sc.nextLine();
        this.ngaysinh=chuanhoa(sc.nextLine());
        this.gpa=sc.nextFloat();
    }
    public void in_kq(){
        System.out.printf("%s %s %s %s %.2f\n",masinhvien,hoten,lop,ngaysinh,gpa);
    }
}
