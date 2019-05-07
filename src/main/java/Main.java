import shape.Circle;
import shape.Rectangle;
import shape.Square;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.printf("Truoc: %.2f\n", circle.getArea());
        circle.resize(30.0);
        System.out.printf("Sau: %.2f\n", circle.getArea());

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.printf("Truoc: %.2f\n", rectangle.getArea());
        rectangle.resize(33.3);
        System.out.printf("Sau: %.2f\n", rectangle.getArea());

        Square square = new Square();
        System.out.printf("Truoc: %.2f\n", square.getArea());
        rectangle.resize(33.3);
        System.out.printf("Sau: %.2f\n", square.getArea());
    }
}
