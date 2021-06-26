package converter;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static int getValue(char ch) {
        if (ch >= '0' && ch <= '9') {
            return ch - '0';
        } else {
            return Character.toUpperCase(ch) - 'A' + 10;
        }
    }
    private static void convert(String[] bases) {
        int from = Integer.parseInt(bases[0]);
        int to = Integer.parseInt(bases[1]);
        while (true) {
            System.out.printf("Enter number in base %d to convert to base %d (To go back type /back) ", from, to);
            String line = sc.nextLine();
            if (line.equals("/back")) {
                break;
            }
            String[] parts = line.split("\\.");
            BigInteger integer = new BigInteger(parts[0], from);
            String answer = "Conversion result: " + integer.toString(to);
            if (parts.length == 2) {
                BigDecimal divide = new BigDecimal(String.valueOf(from));
                BigDecimal multiplier = BigDecimal.ONE.divide(divide, 5, RoundingMode.HALF_UP);
                BigDecimal res = BigDecimal.ZERO;
                for (char ch : parts[1].toCharArray()) {
                    res = res.add(new BigDecimal(getValue(ch)).multiply(multiplier));
                    multiplier = multiplier.divide(divide, 5, RoundingMode.HALF_UP);
                }
                StringBuilder decPart = new StringBuilder();
                multiplier = new BigDecimal(String.valueOf(to));
                for (int i = 0; i < 5; i++) {
                    res = res.multiply(multiplier);
                    int wholePart = res.toBigInteger().intValue();
                    res = res.subtract(new BigDecimal(wholePart));
                    decPart.append(getCharRep(wholePart));
                }
                answer += "." + decPart;
            }
            System.out.println(answer);
        }

    }

    private static char getCharRep(int wholePart) {
        if (wholePart < 10) {
            return (char) (wholePart + '0');
        } else {
            return (char) ('a' + wholePart - 10);

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
