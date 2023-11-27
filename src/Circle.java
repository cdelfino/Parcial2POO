public class Circle extends Shape {
    //atributo de Circle
    private double radius;

    // constructores
    public Circle() {
        super();  // constructor de la clase base Shape
        this.radius = 1.0;
    }

    public Circle(double radius) {
        super();  // constructor de la clase Shape
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // metodo específico de Circle
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // mtodo abstracto para sacar el area
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // mtodo abstracto para sacar el perimetro
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // metodo toString
    @Override
    public String toString() {
        return "Circle [Shape[color=" + getColor() + ", filled=" + isFilled() + "], radius=" + radius + "]";
    }

}
