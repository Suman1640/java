import java.util.*;

public class elseifSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Select button");
        int button = sc.nextInt();


        // using else if

        if (button == 1) {
            System.out.println("Hello");
        } else if (button == 2) {
            System.out.println("Suman");
        } else if (button == 3) {
            System.out.println("Rikta");
        } else {
            System.out.println("Invalid");
        }
    }
}