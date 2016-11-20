package Ex2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle r = new Rectangle();

        System.out.print("Please enter widht of new Rectangle: ");
        r.widht = scanner.nextDouble();

        System.out.print("Please enter heidht of new table: ");
        r.heidht = scanner.nextDouble();

        System.out.println("Area = " + r.getArea());
    }
}


