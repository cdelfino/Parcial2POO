public class Main {
    public static void main(String[] args) {
        // Crear instancias de las clases
        Circle circle = new Circle(5.5, "red", false);
        Rectangle rectangle = new Rectangle(1.0, 2.0, "red", false);
        Square square = new Square(6.6);

        // Imprimir atributos de cada Shape
        System.out.println("Circle:");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println(circle);

        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println(rectangle);

        System.out.println("\nSquare:");
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
        System.out.println(square.squareToString());
    }
}
