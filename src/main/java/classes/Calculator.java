package classes;

public class Calculator {

    public Float perform(Float a, Float b, String operation) {

        switch (operation) {
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                if(b != 0) {
                    return a/b;
                }
                else {
                    System.out.println("Denominator Can't be ZERO");
                    break;
                }
            default:
                System.out.println("Invalid Operation or Data");
        }
        return 0F;
    }

}