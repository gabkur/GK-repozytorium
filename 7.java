import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        int positiveCount = 0, negativeCount = 0;
        int positiveSum = 0, negativeSum = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= n; i++) {
            System.out.print("Podaj " + i + " liczbę: ");
            int number = scanner.nextInt();

            if (number > 0) {
                positiveCount++;
                positiveSum += number;
            } else if (number < 0) {
                negativeCount++;
                negativeSum += number;
            }
        }

        System.out.println("Ilość liczb dodatnich: " + positiveCount);
        System.out.println("Suma liczb dodatnich: " + positiveSum);
        System.out.println("Ilość liczb ujemnych: " + negativeCount);
        System.out.println("Suma liczb ujemnych: " + negativeSum);
    }
}
