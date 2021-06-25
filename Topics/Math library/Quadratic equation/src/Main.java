import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double D = Math.sqrt(b * b - 4 * a * c);
        double x1 = (-b + D) / (2 * a);
        double x2 = (-b - D) / (2 * a);
        if (x1 < x2) {
            System.out.println(x1 + " " + x2);
        } else {
            System.out.println(x2 + " " + x1);
        }
    }
}