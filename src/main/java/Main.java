import shape.Circle;
import shape.Rectangle;
import shape.Square;


public class Main {
    public static void main(String[] args) {
        double rd = Math.random() * 100 + 1;
        Circle circle = new Circle(5);
        System.out.printf("Truoc: %.2f\n", circle.getArea());
        circle.resize(rd);
        System.out.printf("Sau: %.2f\n", circle.getArea());

        Rectangle rectangle = new Rectangle(3, 10);
        System.out.printf("Truoc: %.2f\n", rectangle.getArea());
        rectangle.resize(rd);
        System.out.printf("Sau: %.2f\n", rectangle.getArea());

        Square square = new Square(5);
        System.out.printf("Truoc: %.2f\n", square.getArea());
        square.resize(rd);
        System.out.printf("Sau: %.2f\n", square.getArea());
        square.howToColor();

    }
}
