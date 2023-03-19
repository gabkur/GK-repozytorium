import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj ilość liczb: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Podaj liczbę nr " + (i+1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Wybierz metodę sortowania:");
        System.out.println("1 - Sortowanie bąbelkowe");
        System.out.println("2 - Sortowanie przez wstawianie");

        int choice = scanner.nextInt();

        if (choice == 1) {
            bubbleSort(numbers);
        } else if (choice == 2) {
            insertionSort(numbers);
        } else {
            System.out.println("Nieprawidłowy wybór metody sortowania.");
            return;
        }

        System.out.println("Posortowane liczby:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
    }

    private static void bubbleSort(int[] numbers) {
        int n = numbers.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
    }

    private static void insertionSort(int[] numbers) {
        int n = numbers.length;
        for (int i = 1; i < n; ++i) {
            int key = numbers[i];
            int j = i - 1;

            while (j >= 0 && numbers[j] > key) {
                numbers[j+1] = numbers[j];
                j = j-1;
            }
            numbers[j+1] = key;
        }
    }
}
