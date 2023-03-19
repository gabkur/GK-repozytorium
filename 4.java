import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Wprowadź liczbę całkowitą: ");
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Koniec programu.");
                break;
            }

            System.out.println("Wprowadzona liczba to: " + number);
        }

        scanner.close();
    }
}
