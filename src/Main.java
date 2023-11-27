public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Circle
        Circle myCircle = new Circle(5.0, "blue", true);

        // Imprimir información sobre el círculo
        System.out.println("Información del círculo:");
        System.out.println("Área: " + myCircle.getArea());
        System.out.println("Perímetro: " + myCircle.getPerimeter());
        System.out.println("Representación de cadena: " + myCircle.toString());
    }
}
