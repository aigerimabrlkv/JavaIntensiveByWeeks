package calculator;

public class Main {
    public static void main(String[] args){
        double multiplied = Calculator.multiply(3.14, 2, 5, 6.5, 7, 8);
        double added = Calculator.add(3.14, 2, 5, 6.5, 7, 8);
        System.out.println("Multiplication result is " + multiplied);
        System.out.println("Addition result is " + added);

    }
}
