import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        double vx = sc.nextDouble();
        double vy = sc.nextDouble();
        double ux = sc.nextDouble();
        double uy = sc.nextDouble();
        double num = vx * ux + vy * uy;
        double den = Math.sqrt(Math.pow(vx, 2) + Math.pow(vy, 2))
                * Math.sqrt(Math.pow(ux, 2) + Math.pow(uy, 2));
        double cos =  num / den;
        System.out.println(Math.toDegrees(Math.acos(cos)));

    }
}