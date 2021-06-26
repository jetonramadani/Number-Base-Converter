package converter;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static void convert(String[] bases) {
        int from = Integer.parseInt(bases[0]);
        int to = Integer.parseInt(bases[1]);
        while (true) {
            System.out.printf("Enter number in base %d to convert to base %d (To go back type /back) ", from, to);
            String line = sc.nextLine();
            if (line.equals("/back")) {
                break;
            }
            BigInteger integer = new BigInteger(line, from);
            System.out.println("Conversion result: " + integer.toString(to));
        }

    }
        public static void main(String[] args) {
        boolean flag = true;
        // write your code here
        while(flag) {
            System.out.print("Enter two numbers in format: {source base} {target base} (To quit type /exit) ");
            String line = sc.nextLine();
            if ("/exit".equals(line)) {
                flag = false;
            } else {
                convert(line.split("\\s+"));
            }
        }

    }
}
