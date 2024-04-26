import java.util.Scanner;

public class TriangleDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n=");

        int n = scanner.nextInt();

        scanner.close();

        Triangle(n);
    }

    private static void Triangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
