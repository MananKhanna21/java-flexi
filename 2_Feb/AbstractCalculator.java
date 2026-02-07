abstract class Calculator {
    abstract void operation(double a, double b);
}

class Addition extends Calculator {
    void operation(double a, double b) {
        System.out.println("Sum = " + (a + b));
    }
}

class Subtraction extends Calculator {
    void operation(double a, double b) {
        System.out.println("Difference = " + (a - b));
    }
}

public class AbstractCalculator {
    public static void main(String[] args) {
        Calculator add = new Addition();
        Calculator sub = new Subtraction();

        add.operation(10, 5);
        sub.operation(10, 5);
    }
}
