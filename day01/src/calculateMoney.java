import java.util.Scanner;

public class calculateMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter P: ");
        int P = scanner.nextInt();

        System.out.print("enter R: ");
        float R = scanner.nextFloat();

        System.out.print("enter n: ");
        int n = scanner.nextInt();

        System.out.print("enter t: ");
        float t = scanner.nextFloat();
        scanner.close();
        double money = P  * Math.pow((1 + R / n),  n * t) - P;

        System.out.println("money = " + money + " VND");
    }
}
