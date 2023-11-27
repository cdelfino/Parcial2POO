public class Main {
    public static void main(String[] args) {
        // Crear instancias de las clases
        Circle circle = new Circle(5.5, "red", false);
        Shape s1 = circle;

        Shape s2 = crearShapeConSetters();
        System.out.println(s2);  

        Rectangle rectangle = new Rectangle(1.0, 2.0, "red", false);
        Shape s3 = rectangle;  
        Square square = new Square(6.6);
        Shape s4 = square;

        // Imprimir atributos de cada Shape
        System.out.println("Circle:");
        System.out.println("Area: " + s1.getArea());
        System.out.println("Perimeter: " + s1.getPerimeter());
        System.out.println(s1);

        System.out.println("\nShape:");
        System.out.println("Color: " + s2.getColor());
        System.out.println("Filled: " + s2.isFilled());
        System.out.println(s2);

        System.out.println("\nRectangle:");
        System.out.println("Area: " + s3.getArea());
        System.out.println("Perimeter: " + s3.getPerimeter());
        System.out.println(s3);

        System.out.println("\nSquare:");
        System.out.println("Area: " + s4.getArea());
        System.out.println("Perimeter: " + s4.getPerimeter());
        System.out.println(s4);
    }

    // Método para crear instancias de Shape usando setters
    private static Shape crearShapeConSetters() {
        Circle crearConSetters = new Circle();
        crearConSetters.setColor("blue");
        crearConSetters.setFilled(true);
        return crearConSetters;
    }
}
