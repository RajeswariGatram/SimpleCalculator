import classes.Calculator;

import java.util.Scanner;


public class MainApplication {

    public static void main(String args[]) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        boolean condition = true;

        while (condition) {

            System.out.print("Enter Value a : ");
            String a = scanner.nextLine();

            System.out.print("Enter Value b : ");
            String b = scanner.nextLine();

            System.out.print("Enter Operation : ");
            String operation = scanner.nextLine();

            try {
                Float result = calculator.perform(Float.parseFloat(a), Float.parseFloat(b), operation);
                System.out.println(a + " " + operation + " " + b + " is " + result);
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid Data");
            }

            System.out.print("Enter s to stop : ");
            String value = scanner.nextLine();
            if (value.equals("s")) {
                condition = false;
            }
        }
    }

}