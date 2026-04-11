import java.math.BigDecimal;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return BigDecimal.valueOf(this.radius)
        .multiply(BigDecimal.valueOf(this.radius)).multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(new Circle(3.5).area());

        Circle c1 = new Circle(3.5);
        c1.setRadius(7.5);
        System.out.println(c1.area());

    }
}