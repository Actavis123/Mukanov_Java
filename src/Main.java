import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Task 1.1
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        if (number > 7) {
            System.out.println("Hello");
        }

        // Task 1.2
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();

        if (name.equals("John")) {
            System.out.println("Hello, John");
        } else {
            System.out.println("There is no such name");
        }

        scanner.close();
    }
}
