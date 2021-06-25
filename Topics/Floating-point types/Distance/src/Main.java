import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double length = scanner.nextDouble();
        double hours = scanner.nextDouble();
        System.out.println(length / hours);
    }
}