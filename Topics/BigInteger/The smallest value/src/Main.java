import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        BigInteger num = new BigInteger(sc.nextLine());
        BigInteger fact = BigInteger.ONE;
        int count = 1;
        while (fact.compareTo(num) < 0) {
            ++count;
            fact = fact.multiply(BigInteger.valueOf(count));
        }
        System.out.println(count);
    }
}