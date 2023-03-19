import java.util.Scanner;

class SredniaPunktow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj liczbę studentów: ");
        int n = input.nextInt();

        int suma = 0;
        int i = 0;

        while (i < n) {
            System.out.print("Podaj punkty studenta " + (i+1) + ": ");
            int punkty = input.nextInt();
            suma += punkty;
            i++;
        }

        double srednia = (double) suma / n;
        System.out.println("Średnia liczba punktów w grupie wynosi: " + srednia);
    }
}
