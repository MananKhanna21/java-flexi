import java.util.Scanner;

class Calculator {
    double a, b;

    Calculator(double x, double y) {
        a = x;
        b = y;
    }

    void operation(int ch) {
        if (ch == 1)
            System.out.println(a + b);
        else if (ch == 2)
            System.out.println(a - b);
        else if (ch == 3)
            System.out.println(a * b);
        else if (ch == 4) {
            if (b != 0)
                System.out.println(a / b);
            else
                System.out.println("Division by zero not allowed");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        int ch = sc.nextInt();

        Calculator c = new Calculator(a, b);
        c.operation(ch);
    }
}
