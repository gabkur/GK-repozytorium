import java.util.Scanner;

class SumaLiczbParzystych {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj liczbę elementów ciągu: ");
        int n = input.nextInt();

        int[] ciag = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Podaj " + (i+1) + ". element ciągu: ");
            ciag[i] = input.nextInt();
        }

        int suma = 0;
        for (int liczba : ciag) {
            if (liczba % 2 == 0) {
                suma += liczba;
            }
        }

        System.out.println("Suma liczb parzystych w ciągu wynosi: " + suma);
    }
}
