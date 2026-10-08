import java.util.Scanner;

abstract class Shape {
    private String color;
    private boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

class Trapezium extends Shape {
    private double base_a;
    private double base_b;
    private double height;
    private double side_c;
    private double side_d;

    public Trapezium(String color, boolean filled, double a, double b, double c, double d, double h) {
        super(color, filled);
        this.base_a = a;
        this.base_b = b;
        this.side_c = c;
        this.side_d = d;
        this.height = h;
    }

    public double getBase_a() {
        return base_a;
    }

    public double getBase_b() {
        return base_b;
    }

    public double getSide_c() {
        return side_c;
    }

    public double getSide_d() {
        return side_d;
    }

    public double getHeight() {
        return height;
    }

    public void setBase_a(double base_a) {
        this.base_a = base_a;
    }

    public void setBase_b(double base_b) {
        this.base_b = base_b;
    }

    public void setSide_c(double side_c) {
        this.side_c = side_c;
    }

    public void setSide_d(double side_d) {
        this.side_d = side_d;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * (base_a + base_b) * height;
    }

    @Override
    public double calculatePerimeter() {
        return base_a + base_b + side_c + side_d;
    }
}

public class Shapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String color = sc.nextLine();
        double base_a = sc.nextDouble();
        double base_b = sc.nextDouble();
        double side_c = sc.nextDouble();
        double side_d = sc.nextDouble();
        double height = sc.nextDouble();

        Shape trapezium = new Trapezium(color, true, base_a, base_b, side_c, side_d, height);

        System.out.println("\n Trapezium Output::");
        System.out.println("Color: " + trapezium.getColor());
        System.out.println("Area : " + trapezium.calculateArea());
        System.out.println("Perimeter : " + trapezium.calculatePerimeter());

        sc.close();
    }
}