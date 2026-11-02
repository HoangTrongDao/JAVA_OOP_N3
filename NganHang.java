
import java.util.*;

class NH {
    private String ten;
    private int id;
    private long balance;
    private String cccd;

    public NH() {
        ten = "";
        id = 0;
        balance = 0;
        cccd = "";
    }

    // Getter
    public String getTen() {
        return ten;
    }

    public int getId() {
        return id;
    }

    public long getBalance() {
        return balance;
    }

    public String getCccd() {
        return cccd;
    }

    // Setter
    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    // Nhập thông tin tài khoản
    public void nhap(Scanner sc) {
        System.out.print("Nhap ten chu tai khoan: ");
        ten = sc.nextLine();

        System.out.print("Nhap ma tai khoan: ");
        id = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap CCCD: ");
        cccd = sc.nextLine();
    }

    // Nạp tiền
    public void napTien(long tien) {
        if (tien > 0) {
            balance += tien;
            System.out.println("Nap tien thanh cong!");
        } else {
            System.out.println("So tien nap phai lon hon 0!");
        }
    }

    // Rút tiền
    public void rutTien(long tien) {
        if (tien <= 0) {
            System.out.println("So tien rut phai lon hon 0!");
        } else if (tien > balance) {
            System.out.println("So du khong du!");
        } else {
            balance -= tien;
            System.out.println("Rut tien thanh cong!");
        }
    }

    // In thông tin
    @Override
    public String toString() {
        return "Ten chu tai khoan: " + ten
                + "\nMa tai khoan: " + id
                + "\nCCCD: " + cccd
                + "\nSo du: " + balance;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        NH tk = new NH();
        tk.nhap(sc);

        tk.napTien(1000000);
        tk.rutTien(200000);

        System.out.println("\n" + tk);

        sc.close();
    }
}
