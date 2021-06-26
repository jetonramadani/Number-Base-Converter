import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        BigDecimal num = new BigDecimal(sc.next());
        int scale = sc.nextInt();
        num = num.setScale(scale, RoundingMode.HALF_DOWN);
        System.out.println(num);
    }   
}