package converter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // write your code here
        System.out.print("Enter number in decimal system: ");
        long numDecimal = sc.nextLong();
        System.out.print("Enter target base: ");
        int radix = sc.nextInt();
        System.out.printf("Conversion result: %s%n",
                Long.toString(numDecimal, radix));
    }
}
