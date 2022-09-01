import java.util.*;

public class GreaterOrLesser_elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
//using else if 
        if (a == b) {
            System.out.println("Equal");
        }

        else if (a > b) {
                System.out.println("Greater");
            } else {
                System.out.println("lesser");

            }
    }
}
