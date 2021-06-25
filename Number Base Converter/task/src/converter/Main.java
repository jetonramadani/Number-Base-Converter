package converter;

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static void from() {
        System.out.print("Enter number in decimal system: ");
        long numDecimal = sc.nextLong();
        System.out.print("Enter target base: ");
        int radix = sc.nextInt();
        System.out.printf("Conversion result: %s%n",
                Long.toString(numDecimal, radix));
    }
    private static void to() {
        System.out.print("Enter source number: ");
        String num = sc.next();
        System.out.print("Enter source base: ");
        int radix = sc.nextInt();
        System.out.printf("Conversion to decimal result: %s%n",
                Long.parseLong(num, radix));
    }
    public static void main(String[] args) {
        boolean flag = true;
        // write your code here
        while(flag) {
            System.out.print("Do you want to convert /from decimal or /to decimal? (To quit type /exit) ");
            switch (sc.nextLine()) {
                case "/from":
                    from();
                    break;
                case "/to":
                    to();
                    break;
                case "/exit":
                    flag = false;
                    break;
                default:
                    break;
            }
        }

    }
}
