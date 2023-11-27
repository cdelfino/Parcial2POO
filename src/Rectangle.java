public class Rectangle extends Shape {
    // específicos de Rectangle
    private double width;
    private double length;

    // constructores
    public Rectangle() {
        super();  // constructor de la clase  Shape
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) {
        super();  // constructor de la clase Shape
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // metodos especificos de Rectangle (width y length)
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // metodos abstractos implementados, getArea y getPerimeter
    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    // metodo toString
    @Override
    public String toString() {
        return "Rectangle [Shape[color=" + getColor() + ", filled=" + isFilled() +
                "], width=" + width + ", length=" + length + "]";
    }
}

