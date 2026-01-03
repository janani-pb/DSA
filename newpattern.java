import java.util.Scanner;

public class newpattern{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Upper Pyramid
        for (int i = 1; i <= n; i++) {

            // Spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower Inverted Pyramid
        for (int i = n - 1; i >= 1; i--) {

            // Spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();
    }
}
