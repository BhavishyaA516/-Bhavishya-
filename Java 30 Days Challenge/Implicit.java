public class Implicit {
    public static void main(String[] args) {
        int intVal = 100;
        long longVal = intVal; // implicit conversion from int to long

        float floatVal = 10.5F;
        double doubleVal = floatVal; // implicit conversion from float to double

        System.out.println("Integer value: " + intVal);
        System.out.println("Long value: " + longVal);
        System.out.println("Float value: " + floatVal);
        System.out.println("Double value: " + doubleVal);
    }
}