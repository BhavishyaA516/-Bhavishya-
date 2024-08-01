import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side of a square: ");
        double side = scanner.nextDouble();

        System.out.println("Area of a Square:"+side*side);

        scanner.close();
    }
}
