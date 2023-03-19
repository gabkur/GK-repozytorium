import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj liczbę n: ");
        int n = sc.nextInt();

        Random rand = new Random();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = rand.nextInt(56) - 10;
            System.out.print(num + " ");

            if (num % 2 == 0) {
                sum += num;
            }
        }

        System.out.println("\nSuma liczb parzystych w ciągu: " + sum);
    }
}
