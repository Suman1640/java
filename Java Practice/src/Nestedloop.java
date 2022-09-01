import java.util.Scanner;

public class Nestedloop {
    public static void main(String[] args) {
        // print solid rectangle Pattern
        /*
         * *****
         * *****
         * *****
         * *****
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter colume- ");
        int n = sc.nextInt();
        System.out.print("Enter row- ");
        int m = sc.nextInt();
        // outer loop
        for (int i = 1; i <= n; i++) {
            // iner loop
            for (int j = 1; j <= m; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
