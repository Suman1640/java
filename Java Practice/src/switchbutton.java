import java.util.*;

public class switchbutton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Suman");
                break;
            case 3:
                System.out.println("Rikta");
                break;

            default:
                System.out.println("Invalid");
                break;
        }
    }
}