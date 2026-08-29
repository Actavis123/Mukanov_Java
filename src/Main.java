import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Task 1.1
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        // We move the scanner to the next line to skip
        // the newline character in the input stream
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

        // Task 1.3
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Multiples of 3:");

        for (int num : numbers) {
            if (num % 3 == 0) {
                System.out.print(num + ", ");
            }
        }
        System.out.println();
        scanner.close();

        /* Task 2
        Task 2:
        Given bracket sequence: [((())()(())]]
        The sequence is incorrect.
        The first ']' at the end should be replaced with ')'
        Correct sequence: [((())()(()))]
        */
    }
}
