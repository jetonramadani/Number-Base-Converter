import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // write your code
        Scanner sc = new Scanner(System.in);
        BigDecimal start = new BigDecimal(sc.next());
        BigDecimal percent = new BigDecimal(sc.next());
        int years = sc.nextInt();
        BigDecimal hundred = new BigDecimal(100);
        BigDecimal finalAmount = start.multiply(BigDecimal.ONE.add(percent
                .divide(hundred, 2, RoundingMode.CEILING)).pow(years))
                .setScale(2, RoundingMode.CEILING);
        System.out.println("Amount of money in the account: " + finalAmount);
    }
}