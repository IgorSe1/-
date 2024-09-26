import java.util.Scanner;

public class DataTypesInfo {

    public static void main(String[] args) {
      
        System.out.println("Primitive data types in Java:");
        
        System.out.println("byte: size = " + Byte.SIZE + " bits, min value = " + Byte.MIN_VALUE + ", max value = " + Byte.MAX_VALUE);
        System.out.println("short: size = " + Short.SIZE + " bits, min value = " + Short.MIN_VALUE + ", max value = " + Short.MAX_VALUE);
        System.out.println("int: size = " + Integer.SIZE + " bits, min value = " + Integer.MIN_VALUE + ", max value = " + Integer.MAX_VALUE);
        System.out.println("long: size = " + Long.SIZE + " bits, min value = " + Long.MIN_VALUE + ", max value = " + Long.MAX_VALUE);
        System.out.println("float: size = " + Float.SIZE + " bits, min value = " + Float.MIN_VALUE + ", max value = " + Float.MAX_VALUE);
        System.out.println("double: size = " + Double.SIZE + " bits, min value = " + Double.MIN_VALUE + ", max value = " + Double.MAX_VALUE);
        System.out.println("char: size = " + Character.SIZE + " bits, min value = " + (int) Character.MIN_VALUE + ", max value = " + (int) Character.MAX_VALUE);
        System.out.println("boolean: size = 1 bit, values = " + Boolean.TRUE + " or " + Boolean.FALSE);
        
        Scanner scanner = new Scanner(System.in);

        try {
    
            System.out.print("\nEnter an integer (int): ");
            String inputInt = scanner.nextLine();
            int intValue = Integer.parseInt(inputInt);
            System.out.println("You entered int: " + intValue);

            System.out.print("\nEnter a real number (double): ");
            String inputDouble = scanner.nextLine();
            double doubleValue = Double.parseDouble(inputDouble);
            System.out.println("You entered double: " + doubleValue);

            System.out.print("\nEnter a boolean value (true/false): ");
            String inputBoolean = scanner.nextLine();
            boolean booleanValue = Boolean.parseBoolean(inputBoolean);
            System.out.println("You entered boolean: " + booleanValue);

            System.out.print("\nEnter a single character (char): ");
            String inputChar = scanner.nextLine();
            
            if (inputChar.length() == 1) {
                char charValue = inputChar.charAt(0);
                System.out.println("You entered char: " + charValue);
            } else {
                System.out.println("Error: please enter only one character.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Input error: invalid number format.");
        }

        scanner.close(); 
    }
}