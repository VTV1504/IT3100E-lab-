import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Initialize Scanner object
        double a, b;
        System.out.println("Enter the first number: ");
        a = input.nextDouble();
        System.out.println("Enter the second number: ");
        b = input.nextDouble();
        input.close();
        double sum = a + b;
        double dif = a - b;
        double pro = a * b;
        if (b != 0) {
            double quo = a / b;
            System.out.println("The quotient of the two numbers is: " + quo);
        } else {
            System.out.println("Cannot divide by zero!");
        }
        System.out.println("The sum of the two numbers is: " + sum);
        System.out.println("The difference of the two numbers is: " + dif);
        System.out.println("The product of the two numbers is: " + pro);
    }
}
