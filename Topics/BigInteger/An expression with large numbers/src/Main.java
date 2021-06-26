import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());
        BigInteger c = new BigInteger(sc.next());
        BigInteger d = new BigInteger(sc.next());
        System.out.println(a.negate().multiply(b)
                            .add(c).subtract(d));
    }
}