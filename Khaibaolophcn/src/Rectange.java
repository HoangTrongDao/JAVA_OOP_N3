public class Rectange {
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

    // Getter width
    public double getWidth() {
        return width;
    }

    // Setter width
    public void setWidth(double width) {
        this.width = width;
    }

    // Getter height
    public double getHeight() {
        return height;
    }

    // Setter height
    public void setHeight(double height) {
        this.height = height;
    }

    // Getter color
    public String getColor() {
        return color;
    }

    // Setter color
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