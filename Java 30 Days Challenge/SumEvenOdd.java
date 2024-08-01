import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumEven = 0;
        int sumOdd = 0;

        System.out.println("Enter a set of integers separated by commas:");
        String integers = scanner.nextLine();
        
        String[] numbers = integers.split(",");

        for (String numStr : numbers) {
            int number = Integer.parseInt(numStr.trim());         
                if (number % 2 == 0) {
                    sumEven += number;
                } else {
                    sumOdd += number;
                }
        }
        System.out.println("Sum of even integers: " + sumEven);
        System.out.println("Sum of odd integers: " + sumOdd);

        scanner.close();
    }
}
