public class Explicit {
    public static void main(String[] args) {
        double doubleVal = 100.99;
        int intVal = (int) doubleVal; // explicit conversion from double to int

        long longVal = 100000L;
        short shortVal = (short) longVal; // explicit conversion from long to short

        System.out.println("Double value: " + doubleVal);
        System.out.println("Converted to int: " + intVal);
        System.out.println("Long value: " + longVal);
        System.out.println("Converted to short: " + shortVal);
    }
}
