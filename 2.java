import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, result, option;

        while (true) {
            System.out.println("Wybierz operację:");
            System.out.println("1. Dodawanie");
            System.out.println("2. Odejmowanie");
            System.out.println("3. Mnożenie");
            System.out.println("4. Dzielenie");
            System.out.println("5. Potęgowanie");
            System.out.println("6. Wyjście");
            System.out.print("Wybierz opcję: ");
            option = scanner.nextInt();

            if (option == 6) {
                break;
            }

            System.out.print("Podaj pierwszą liczbę: ");
            num1 = scanner.nextInt();
            System.out.print("Podaj drugą liczbę: ");
            num2 = scanner.nextInt();

            switch (option) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Wynik: " + result);
                    break;

                case 2:
                    result = num1 - num2;
                    System.out.println("Wynik: " + result);
                    break;

                case 3:
                    result = num1 * num2;
                    System.out.println("Wynik: " + result);
                    break;

                case 4:
                    if (num2 == 0) {
                        System.out.println("Nie można dzielić przez zero!");
                    } else {
                        result = num1 / num2;
                        System.out.println("Wynik: " + result);
                    }
                    break;

                case 5:
                    result = (int) Math.pow(num1, num2);
                    System.out.println("Wynik: " + result);
                    break;

                default:
                    System.out.println("Niepoprawna opcja!");
                    break;
            }
        }
    }
}
