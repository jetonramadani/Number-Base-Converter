import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        double m = scanner.nextDouble();
        for (int i = k; ;i++) {
            boolean isOkay = true;
            Random rand = new Random(i);
            for(int j = 0; j < n; j++) {
                isOkay = isOkay && rand.nextGaussian() <= m;
            }
            if (isOkay) {
                System.out.println(i);
                break;
            }
        }
    }
}