import java.util.Scanner;

class QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj wartość a: ");
        double a = input.nextDouble();

        System.out.print("Podaj wartość b: ");
        double b = input.nextDouble();

        System.out.print("Podaj wartość c: ");
        double c = input.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Pierwiastki to: " + x1 + " i " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Pierwiastek to: " + x);
        } else {
            System.out.println("Trójmian nie ma pierwiastków rzeczywistych");
        }

        input.close();
    }
}
