import java.util.Scanner;

public class checkYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");

        int year = sc.nextInt();

        if (year % 4 == 0) {
            System.out.println(" a leap year");
        } else {
            System.out.println(" not a leap year");
        }
    }
}
