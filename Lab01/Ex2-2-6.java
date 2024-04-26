import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int mode; 
        do {
            System.out.println("Enter your choice: ");
            System.out.println("1. Solve a linear equation;");
            System.out.println("2. Solve a system of 2 linear equations;");
            System.out.println("3. Solve a quadratic equation;");
            System.out.println("4. Exit the program.");
            System.out.println("Your choice [1, 2, 3, 4]: ");
            mode = input.nextInt();
            input.nextLine(); 
            switch (mode) {
                case 1:
                    System.out.println("Linear equation mode selected");
                    System.out.println("Enter the value of a: ");
                    double a1 = input.nextDouble();
                    System.out.println("Enter the value of b: ");
                    double b1 = input.nextDouble();
                    if (a1 == 0) {
                        if (b1 == 0) {
                            System.out.println("The equation has infinite solutions");
                        } else {
                            System.out.println("The equation has no solution");
                        }
                    } else {
                        double x = -b1 / a1;
                        System.out.println("The solution is: " + x);
                    }
                    break;
                case 2:
                    System.out.println("System of 2 linear equations mode selected");
                    System.out.println("Enter the value of a1: ");
                    double a2 = input.nextDouble();
                    System.out.println("Enter the value of b1: ");
                    double b2 = input.nextDouble();
                    System.out.println("Enter the value of c1: ");
                    double c1 = input.nextDouble();
                    System.out.println("Enter the value of a2: ");
                    double a3 = input.nextDouble();
                    System.out.println("Enter the value of b2: ");
                    double b3 = input.nextDouble();
                    System.out.println("Enter the value of c2: ");
                    double c2 = input.nextDouble();
                    double d = a2 * b3 - a3 * b2;
                    double dx = c1 * b3 - c2 * b2;
                    double dy = a2 * c2 - a3 * c1;
                    if (d == 0) {
                        if (dx + dy == 0) {
                            System.out.println("The system has infinite solutions");
                        } else {
                            System.out.println("The system has no solution");
                        }
                    } else {
                        double x = dx / d;
                        double y = dy / d;
                        System.out.println("The solution is: x = " + x + ", y = " + y);
                    }
                    break;
                case 3:
                    System.out.println("Quadratic equation mode selected");
                    System.out.println("Enter the value of a: ");
                    double a = input.nextDouble();
                    System.out.println("Enter the value of b: ");
                    double b = input.nextDouble();
                    System.out.println("Enter the value of c: ");
                    double c = input.nextDouble();
                    double delta = b * b - 4 * a * c;
                    if (delta < 0) {
                        System.out.println("The equation has no solution");
                    } else if (delta == 0) {
                        double x = -b / (2 * a);
                        System.out.println("The solution is: " + x);
                    } else {
                        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                        System.out.println("The solutions are: x1 = " + x1 + ", x2 = " + x2);
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Type again [1, 2, 3, 4]: ");
                    break;
            }
        } while (mode != 4);
        input.close(); 
    }

    @Override
    public String toString() {
        return "Main []";
    }
}
