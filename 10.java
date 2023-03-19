import java.util.Scanner;

 class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj słowo: ");
        String word = input.nextLine();
        String reversedWord = new StringBuilder(word).reverse().toString();

        if (word.equals(reversedWord)) {
            System.out.println("To słowo jest palindromem!");
        } else {
            System.out.println("To słowo nie jest palindromem.");
        }
    }
}
