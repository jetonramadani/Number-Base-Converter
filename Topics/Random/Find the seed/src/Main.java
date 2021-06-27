import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here

        int min = Integer.MAX_VALUE;
        int minI = -1;
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int nums = scanner.nextInt();
        int ex = scanner.nextInt();
        for (int i = start; i <= end; i++) {
            int max = Integer.MIN_VALUE;
            Random random = new Random(i);
            for (int j = 0; j < nums; j++) {
                int genNum = random.nextInt(ex);
                if (genNum > max) {
                    max = genNum;
                }
            }
            if (min > max) {
                min = max;
                minI = i;
            }
        }
        System.out.println(minI);
        System.out.println(min);
    }
}