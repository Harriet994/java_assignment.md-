import java.util.Scanner;

public class DynamicGreetingGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter a positive integer n (between 1 and 10): ");
        int n = scanner.nextInt();
        scanner.close();

        if (n < 1 || n > 10) {
            System.out.println("Error: Number must be between 1 and 10!");
            return;
        }

        for (int i = 1; i <= n; i++) {
            String greeting = "Hello, " + name + "! Welcome to Java.";
            if (i % 2 == 0) {
                System.out.println(greeting.toLowerCase());
            } else {
                System.out.println(greeting.toUpperCase());
            }
        }
    }
}
