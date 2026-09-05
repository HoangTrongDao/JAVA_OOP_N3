import java.util.Scanner;

class Rectange {
    private double width;
    private double height;
    private String color;

    // Constructor mặc định
    public Rectange() {
        width = 1;
        height = 1;
    }

    // Constructor có tham số
    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    // Getter và Setter
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Tính diện tích
    public double findArea() {
        return width * height;
    }

    // Tính chu vi
    public double findPerimeter() {
        return 2 * (width + height);
    }
}

public class J04002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int width = sc.nextInt();
        int height = sc.nextInt();
        String color = sc.next();

        // Kiểm tra dữ liệu
        if (width <= 0 || height <= 0) {
            System.out.println("INVALID");
            return;
        }

        // Chuẩn hóa màu
        color = color.substring(0, 1).toUpperCase()
                + color.substring(1).toLowerCase();

        // Tạo đối tượng hình chữ nhật
        Rectange r = new Rectange(width, height, color);

        // In kết quả
        System.out.printf("%.0f %.0f %s",
                r.findPerimeter(),
                r.findArea(),
                r.getColor());
    }
}