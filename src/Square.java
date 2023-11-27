public class Square extends Rectangle {
    // constructores
    public Square() {
        super();  // constructor de la clase  Rectangle
    }

    public Square(double side) {
        super(side, side);  // constructor de la clase Rectangle pero con mismo ancho y largo para que sea un cuadrado
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);  // constructor de la clase base Rectangle
    }

    // metodos específicos de Square
    public double getSide() {
        return getWidth();  // Un cuadrado tiene el mismo ancho y largo, entonces obtenemos el ancho
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    // Representar Square
    public String squareToString() {
        return "Square [Shape[color=" + getColor() + ", filled=" + isFilled() +
                "], side=" + getWidth() + "]";
    }

    //
    @Override
    public String toString() {
        return "Square" + super.toString();
    }
}
